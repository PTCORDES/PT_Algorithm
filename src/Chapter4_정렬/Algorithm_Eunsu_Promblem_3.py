# 두 배열의 원소 교체

n,k = map(int,input().split())
a = list(map(int,input().split()))
b = list(map(int,input().split()))

a.sort() # 배열 A는 오름차순 정렬 수행
b.sort(reverse=True) # 배열 B는 내림차순 정렬 수행  --> 인덱스에 따른 원소값 매칭을 위함 

for i in range(k):
    if a[i] < b[i]:
        # 두 원소를 교체
        a[i],b[i] = b[i],a[i]
    else:
        break
print(sum(a))