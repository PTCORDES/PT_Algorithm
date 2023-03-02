# 5-1 스택 예제
# 선입후출 구조 OR 후입선출 구조 

#출력하고자 하는 결과값 --> [5,2,3,1]

stack = []

stack.append(5)
stack.append(2)
stack.append(3)
stack.append(7)
stack.pop() # 7 삭제
stack.append(1)
stack.append(4)
stack.pop() # 4삭제

# stack = [5,2,3,1] reveres_stack = [1,3,2,5]

print(stack)
print(stack[::-1])
