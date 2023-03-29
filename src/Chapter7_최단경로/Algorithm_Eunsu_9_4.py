# 실전문제 미래도시

INF = int(1e9) # 무한대 입력

n,m = map(int,input().split())

graph = [[INF] * (n+1) for _ in range(n+1)]

#자기 자신에서 자기 자신으로 가는 비용은 0으로 초기화
for a in range(1, n+1):
    for b in range(1, n+1):
        if a == b:
            graph[a][b] = 0

# 간선에 대한 정보를 입력받고 , 그 값으로 초기화 서로 연결된 경우에는 1로 초기화
for _ in range(m):
    # A에서 B로 가는 비용은 C라고 설정
    a,b, = map(int,input().split())
    graph[a][b] = 1
    graph[b][a] = 1

#거쳐 갈 노드 X와 최종 목적지 노드 K를 입력받기
x,k = map(int,input().split())

for k in range(1,n+1):
    for a in range(1,n+1):
        for b in range(1,n+1):
            graph[a][b] = min(graph[a][b], graph[a][k] + graph[k][b])


distance = graph[1][k] + graph[k][x]

if distance >= INF:
    print("-1")
#도달할 수 있다면, 최단 거리를 출력
else:
    print(distance)
    