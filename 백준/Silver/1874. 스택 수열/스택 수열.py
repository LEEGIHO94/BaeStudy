import sys
from collections import deque

n = int(sys.stdin.readline())
tmp = 0
d = deque()
d.append(0)
answer = ""
ls = list()
for _ in range(n):
    num = int(sys.stdin.readline())

    while True:
        if d[-1] < num:
            if tmp < num:
                tmp += 1
                d.append(tmp)
                ls.append("+")
            else:
                answer = "NO"
                break
        elif d[-1] == num:
            d.pop()
            ls.append("-")
            break
        else:  # 최대 값보다 작을 경우
            if d[-1] == 0:
                answer = "NO"
                break
            d.pop()
            ls.append("-")

    if answer == "NO":
        break
if "NO" in answer:
    print(answer)
else:
    print("\n".join(ls))