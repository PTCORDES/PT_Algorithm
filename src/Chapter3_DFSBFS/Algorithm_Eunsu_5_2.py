# 5_2 큐 에제
# 5,2,3,7 삽입 삭제() 1,4 삽입 삭제 ()
# 선입선출 구조

from collections import deque

queue = deque()

queue.append(5)
queue.append(2)
queue.append(3)
queue.append(7)
queue.popleft()
queue.append(1)
queue.append(4)
queue.popleft()

print(queue) # 먼저 들어온 순서대로 출력
queue.reverse() # 다음 출력을 위해 역순으로 바꿈
print(queue) # 나중에 들어온 원소부터 출력 
