# 그리디 예제 1이 될 때까지

# 규칙 1 N에서 1을 뺀다.
# 규칙 2 N을 K로 나눈다.

# 해당 문제에서 가장 중요한 성질 --> 1을 빼는 횟수보다 나눗셈을 많이 하는 것이 N의 값을 더 많이 줄일 수 있다 즉, 나눈셈을 최대한 많이 하면된다.


# N과 K 를 입력받는다.

# N값이 100억 이하의 경우 코드 작성
""" n,k = map(int, input().split())
result = 0 

# N이 K 이상이라면 K로 계속 나누기 
while n >= k:
    # N이 K로 나누어 떨어지지 않으면 --> N에서 1씩 배기
    while n % k !=- 0:
        n -= 1
        result += 1
    #K로 나누기
    n //= k
    result += 1

# 마지막으로 남은 수에 대하여 1씩 빼기
while n > 1:
    n -= 1
    result += 1


print(result) """

# N값이 100억 이상일 때 , N이 K의 배수가 되도록 효율적으로 한 번에 빼는 방식

n, k = map(int,input().split())
result = 0 

while True:
    # (N == K로 나누어 떨어지는 수) 가 될 때 까지 1씩 빼기
    target = (n//k)*k
    result += (n-target)
    
    # N이 K보다 작을 때 (더 이상 나눌 수 없을 때) 반복문 탈출
    if n < k :
        break

    # K 로 나누기
    result += 1
    n //= k
# 마지막으로 남은 수에 대하여 1씩 빼기
result += (n-1)
print(result)
