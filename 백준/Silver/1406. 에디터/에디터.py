import sys

left = list()
right = list()

d = {
    "L": lambda: right.append(left.pop()) if left else None,
    "D": lambda: left.append(right.pop()) if right else None,
    "B": lambda: left.pop() if left else None,
    "P": lambda x: left.append(x)
}

left = list(sys.stdin.readline().strip())

n = int(sys.stdin.readline().strip())

for _ in range(n):
    tmp = sys.stdin.readline().split()
    op = tmp[0]
    if op == "P":
        d[op](tmp[1])
    else:
        d[op]()

while right:
    d["D"]()
print("".join(left))
