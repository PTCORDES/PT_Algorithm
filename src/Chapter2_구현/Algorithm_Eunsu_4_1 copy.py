#상하좌우 문제 

# 여행가 A는 N X N 크기의 정사각형 공간 위에 서있다. 가장 왼 쪽위 좌표는 (1,1) , 가장 오른쪽 아래 좌표는 (N,N)
# 여행가 A는 상하좌우 방향으로 이동, 시작 좌표는 항상 (1,1) 이다.
# L : 왼쪽으로 한 칸 , R : 오른쪽으로 한 칸 , U : 위로 한 칸 , D : 아래로 한 칸 
# A가 N X N 크기의 정사각형 공간을 벗어나는 움직임은 무시된다.

n = int,input()
x,y = 1,1
plans = input().split()

# L , R , U , D에 따른 이동 방향
dx = [0,0,-1,1]
dy = [-1,1,0,0]
move_types = ['L', 'R', 'U', 'D']

# 이동계획을 하나씩 확인
for plan in plans:
    #이동 후 좌표 구하기
    for i in range(len(move_types)):
        if plan == move_types[i]:
            nx = x + dx[i]
            ny = y + dy[i]
    #공간을 벗어나는 경우 무시
    if nx < 1 or ny < 1 or nx > n or ny > n:
        continue

    #이동 수행
    x,y = nx, ny

print(x,y)
