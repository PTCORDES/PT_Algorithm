# 5-4 재귀 함수의 종료 조건
# 문제 풀이에서 사용할 때는 재귀함수가 특정조건에서 종료되도록 설정을 해줘야한다.

def recursive_function(i):
    if i == 100:
        return
    print(i,'번째 재귀 함수에서',i+1,'번째 재귀 함수를 호출합니다.')
    recursive_function(i+1)
    print(i,'번째 재귀 함수를 종료합니다.')

recursive_function(1)
