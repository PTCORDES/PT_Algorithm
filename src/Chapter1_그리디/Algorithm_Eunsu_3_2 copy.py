# 그리디 문제 3-2 큰 수의 법칙

""" 
입력 조건 

 """
# N,M,K를 공백으로 구분하려 입력받기
n,m,k = map(int, input().split())

# N개의 수를 공백으로 구분하여 입력받기
data = list(map(int,input().split()))

data.sort() # 입력받은 data 정렬
first = data[n-1] # 가장 큰 수 index 마지막 순서 값
second = data[n-2]  # 두번째로 큰 수 index 마지막-1 값

result = 0

while True:
    for i in range(k): # 가장 큰 수를 k 번 더하기
        if m == 0 :
            break
        result += first
        m -= 1 # 더 할 때마다 1씩 빼기 
    if m == 0: # m이 0이라면 반복문 탈출
        break
    result += second # 두 번째로 큰 수 한 번 더하기
    m -= 1 # 더할 때 마다 1씩 빼기

print(result)
