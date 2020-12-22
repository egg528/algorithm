# 경우를 나누어 보자

# 동생이 수빈이보다 왼쪽에 있으면 즉, 동생 <= 수빈이면 걸어서 가는 수밖에 없다.


"""
수빈 < 동생이라면 이야기가 달라진다,,, 
최적의 경로를 어떻게 찾아야 하나
모든 경우를 다 시도해봐야 할 것 같은데,,,
다이나믹 프로그래밍 써야하나

1에서 8로 간다고 가정해보자
1에서 2로가는 가장 빠른 건 걷기 1초 or 순간이동
1에서 3으로 가는 건 2
1에서 4는 2초

뭔가 감이 오는데,, 만약에 6까지 가는 가장 빠른 경로를 찾는다고 가정해보면 
다이나믹 프로그래밍을 통해 착성한 것들 중 6/2 = 3 혹은 6-1 5의 값을 찾아보면 되는 것 아닌가?

"""
from collections import deque

"""
subin, dongsang = map(int, input().split())



def whereIsMySister(dongsang, subin):
    if dongsang <= subin:
        return subin - dongsang

    dynamic = [0] * (dongsang + 1)

    for i in range(subin + 1):
        dynamic[i] = subin - i


    for i in range(subin+1, dongsang+1):
        if i%2 != 0:
            dynamic[i] = dynamic[i-1]+1

        elif dynamic[i-1] < dynamic[i//2]:
            dynamic[i] = dynamic[i-1]+1

        else:
            dynamic[i] = dynamic[i//2]+1

    return dynamic[dongsang]




print(whereIsMySister(dongsang, subin))
"""


from collections import deque

subin, dongsang = map(int, input().split())


graph = [0] * 100001



def BFS(graph, subin, dongsang):
    if dongsang <= subin:
        return subin - dongsang

    queue = deque()
    queue.append(subin)


    while queue:
        now = queue.popleft()

        if now == dongsang:
            return graph[now]

        t = [now-1, now+1, now*2]

        for i in t:
            if (0 <= i <= 100000) and graph[i] == 0:
                graph[i] = graph[now]+1
                queue.append(i)



print(BFS(graph, subin, dongsang))