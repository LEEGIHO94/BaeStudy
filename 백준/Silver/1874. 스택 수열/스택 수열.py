import sys
from collections import deque

n = int(sys.stdin.readline())
tmp = 0
d = deque()
d.append(0)
answer = ""

for _ in range(n):
    num = int(sys.stdin.readline())

    while True:
        if d[-1] < num:
            if tmp < num:
                tmp += 1
                d.append(tmp)
                answer += "+\n"
            else:
                answer = "NO"
                break
        elif d[-1] == num:
            d.pop()
            answer += "-\n"
            break
        else:  # 최대 값보다 작을 경우
            if d[-1] == 0:
                answer = "NO"
                break
            d.pop()
            answer += "-\n"

    if answer == "NO":
        break
print(answer)