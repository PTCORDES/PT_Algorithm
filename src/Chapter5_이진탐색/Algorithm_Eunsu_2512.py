#2512번 

n = int(input())

array = list(map(int,input().split()))
goals = int(input())
start ,end = 0,max(array)


while start <= end:
    mid = (start+end)//2
    result = 0 

    for i in array:
        if i >= mid:
            result += mid
        else:
            result +=i
    if result <= goals:
        start = mid + 1
    else:
        end = mid -1 

print(end)







    
    