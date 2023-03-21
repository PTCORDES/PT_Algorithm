# 순차 탐색

def sequential_search(n, target, array):
    # 긱 원소를 하나씩 확인 --> 시간복잡도 (N)
    for i in range(n):
        if array[i] == target:
            return i+1 # 현재의 위치 반환 (인덱스는 0부터 시작하니까 1 더하기)
        
print("생성할 원소 개수를 입력한 다음 한 칸 띄고 찾을 문자열을 입력하세요")
input_data = input().split()
n = int(input_data[0])
target = input_data[1]

print("앞서 적은 원소 개수만큼 문자열을 입력하세요. 구분은 띄어쓰기 한 칸으로 합니다.")
array = input().split()

print(sequential_search(n,target,array))/
