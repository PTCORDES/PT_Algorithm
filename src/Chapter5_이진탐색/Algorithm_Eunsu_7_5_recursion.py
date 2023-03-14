# 이진탐색 재귀함수로 구현

def binaray_search(array,target,start,end):
    if start > end:
        return None
    mid = (start + end ) // 2
    if array[mid] == target:
        return mid
    elif array[mid] > target:
        return binaray_search(array,target,start,mid-1)
    else:
        return binaray_search(array,target,mid + 1, end)

n = int(input())
# 가게에 있는 전체 부품 번호를 공백으로 구분하여 입력
array = list(map(int,input().split()))
array.sort() # 이진 탐새을 수행하기 위한 사전 정렬
# M (손님이 요청한 부품 개수 ) 입력
m = int(input())

x = list(map(int,input().split()))

#손님이 확인 요청한 부품 번호를 하나씩 화인

for i in x:
    # 해당 부품이 존재하는지 확인
    result = binaray_search(array,i,0,n-1)
    if result != None:
        print('yes', end='')
    else:
        print('no',end='')