# 구현 실전문제 게임개발
# 게임 캐릭터가 있는 공간은 N X M 크기의 직사각형 , 각각의 칸은 육지 OR 바다 , 캐릭터는 동서남북 중 한 곳을 바라봄
# 맵의 각 칸은 (A,B)로 표현 가능, A는 북쪽으로부터 떨어진 칸의 개수 , B는 서쪽으로부터 떨어진 칸의 개수 
# 캐릭터는 상하좌우로 움직임, 바다로 되어 있는 공간 출입 X 
# 캐릭터의 움직임 메뉴얼은 다음과 같다.

# 현재 위치에서 현재 방향을 기준으로 왼쪽방향 부터 차례대로 갈 곳을 정한다.
# 캐릭터의 바로 왼쪽 방향에 미탐색 칸이 존재한다면, 왼쪽 방향으로 회전한 다음 왼쪽으로 한칸을 전진한다.
# 왼쪽 방향에 가보지 않은 칸이 없다면, 왼쪽 방향으로 회전만 수행하고 1단계로 돌아간다.
# 만약 네 방향 모두 이미 가본 칸이거나 바다로 되어있는 경우 , 바라보는 방향을 유지한 채로 한 칸 뒤로 가고 1단계로 돌아간다.
# 단, 이 때 뒤쪽 방향이 바다인 칸이라 뒤로 갈 수 없는 경우에는 움직임을 멈춘다.

# 방향은 다음과 같다. 0: 북쪽 , 1: 동쪽 , 2: 남쪽, 3 : 서쪽
# 칸의 구분은 다음과 같다. 0:육지, 1: 바다 

# 방향을 설정해서 이동하는 문제 유형에서는 dx,dy 라는 별도의 리스트를 만들어 방향을 정하는 것이 효과적 

n,m = map(int,input().split())

# 방문한 위치를 저장하기 위한 맵을 생성하여 0으로 초기화
d = [[0]*m for _ in range(n)]
# 현재 캐릭터의 X 좌표, Y 좌표, 방향을 입력받기
x,y,direction = map(int,input().split())
d[x][y] = 1 # 현재 좌표 방문 처리 

# 전체 맵 정보를 입력받기
array = []
for i in range(n):
    array.append(list(map(int,input().split())))

# 북, 동 , 남 , 서 방향 정의
dx = [-1,0,1,0]
dy = [0,1,0,-1]

# 왼쪽으로 회전
def turn_left ():
    global direction 
    direction -= 1
    if direction == -1:
        direction = 3

#시뮬레이션 시작

count = 1
turn_time = 0
while True:
    # 왼쪽으로 회전
    turn_left()
    nx = x + dx[direction]
    ny = y + dy[direction]

    #회전한 이후 정면에 가보지 않은 칸이 존재하는 경우 이동
    if d[nx][ny] == 0 and array[nx][ny] == 0:
        d[nx][ny] = 1
        x = nx
        y = ny
        count += 1
        turn_time = 0
        continue
    # 회전한 이후 정면에 가보지 않은 칸이 없가나 바다인 경우
    else:
        turn_time += 1
    #네 바향 모두 갈 수 없는 경우
    if turn_time == 4:
        nx = x - dx[direction]
        ny = y - dy[direction]
        # 뒤로 갈 수 있다면 이동하기
        if array[nx][ny] == 0:
            x = nx
            y = ny
        #뒤가 바다로 막혀있는 경우
        else:
            break
        turn_time = 0


print(count)
