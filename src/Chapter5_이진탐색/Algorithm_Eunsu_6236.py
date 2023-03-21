
n,m = list(map(int,input().split()))

array = []
for i in range(n):
    a = int(input())
    array.append(a)


start, end = min(array) ,sum(array)
print(start)
print(end)



while start <= end:
    mid = (start + end) // 2
    charge = mid
    num = 1 

    for i in range(n):
        if charge < array[i]:
            charge = mid 
            num +=1
        charge -= array[i]
           

    if num > m or mid < max(array):
        start = mid + 1
    else:
        end = mid - 1
        k = mid

print(k)


        



    