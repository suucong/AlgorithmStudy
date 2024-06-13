def DFS(L):
    if L == m:
        print(" ".join(map(str, pm)))
    else:
        for i in range(1, n + 1):
            pm[L] = i
            DFS(L + 1)

n = int(input())
m = int(input())
pm = [0] * m

DFS(0)