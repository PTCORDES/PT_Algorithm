# 개미전사
n = int(input())

# 모든 사람 정보 입력받기
array = list(map(int,input().split()))

# 앞서 계산된 결과를 지정하기 위한 DP 테이블 초기화

d = [0] * 100 

# 다이나믹 프로그래밍 진행
d[0] = array[0]
d[1] = max(array[0],array[1])
for i in range(2,n):
    d[i] = max[d[i-1],d[i-2] + array[i]]


# 계산된 결과 출력

print(d[n-1])

