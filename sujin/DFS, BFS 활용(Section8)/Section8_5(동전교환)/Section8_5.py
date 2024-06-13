from collections import deque

def min_coin_amount(coins, amount):
    queue = deque([(0, 0)])
    visited = set()
    visited.add(0)

    while queue:
        current_amount, coin_count = queue.popleft()

        if current_amount == amount:
            return coin_count

        for coin in coins:
            next_amount = current_amount + coin
            if next_amount <= amount and next_amount not in visited:
                visited.add(next_amount)
                queue.append((next_amount, coin_count + 1))

    return -1

n = int(input())
coins = list(map(int, input().split()))
m = int(input())
answer = 0

print(min_coin_amount(coins, m))