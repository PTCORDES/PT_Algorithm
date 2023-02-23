N, M, K = map(int, input().split())
number = list(map(int, input().split()))

max1_num = max(number)
number.remove(max1_num)
max2_num = max(number)

sum = 0
flag = 0
while M>0:
    if flag==i0:
        for i in range(K):
            sum += max1_num
        M-=K
        flag = 1
    else:
        sum += max2_num
        M-=1
        flag = 0

print(sum)



    

