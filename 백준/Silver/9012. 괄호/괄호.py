from collections import deque
import sys

n = int(sys.stdin.readline())

for _ in range(n):
    answer = "YES"
    d = deque()
    ls = list(sys.stdin.readline().strip())
    for v in ls:
        if v == "(":
            d.append("(")
        else:
            if not d or d[-1] == ")":
                answer = "NO"
                break
            else:
                d.pop()
    if d:
        answer = "NO"
    print(answer)