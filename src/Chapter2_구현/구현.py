loc = input()
row = int(loc[1])
column = loc[0]

steps = [(-2,1),(-2,-1),(2,1),(2,-1),(-1,-2),(-1,2),(1,2),(1,-2)]

count = 0

for step in steps:
    if (row + step[1])>=1 and (row + step[1])<=8 and (ord(column) + ord(step[0]))>=ord('a') and (ord(column) + ord(step[0]))<=ord('h'):
        count+=1

print(count)