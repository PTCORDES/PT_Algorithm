# 실전 문제 왕실의 나이트
# 구현 문제에서 중요한 점 이 문제와 비슷한 이동 문제가 많이 나온다.
# dx,dy 로 이동 리스트를 구현하거나 , steps로 이동 가능한 좌표를 리스트 형태로 저장하는 방식이 많이 사용되니 익숙해질 것 

# 문제 설명
# 행복왕국의 왕실정원은 체스판과 같은 8 X 8 좌표 평면이다. 
# 나이트의 이동방식은 다음과 같다. 
# 1.수평으로 두 칸 이동 뒤 , 수직으로 한 칸 이동 
# 2. 수직으로 두 칸 이동 뒤 , 수평으로 한 칸 이동
# 왕실의 행 위치는 1~8 , 열 위치는 a~h 로 표현한다.
# 나이트의 이동 방식을 steps 리스트에 넣는 것이 중요하다.

input_data = input()
row = int(input_data[1])
column = int(ord(input_data[0])- int(ord('a'))) + 1

#나이트가 이동할 수 있는 방식들을 리스트에 저장
steps = [(-2,-1), (-1, -2), (1, -2), (2,-1),(2,1), (1,2), (-1,2),(-2,1)]

# 8가지 방향에 대하야 각 위치로 이동이 가능한지 확인

result = 0
for step in steps:
    # 이동하고자 하는 위치 확인 
    next_row = row + step[0]
    next_column = column + step[1]
    # 해당 위치로 이동이 가능하다면 카운트 증가
    if next_row >= 1 and next_row <= 8 and next_column >= 1 and next_column <= 8:
        result += 1

print(result)

