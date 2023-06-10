def solution(numbers):
    ans = list(range(10))
    for i in numbers:
        ans.remove(i)
    return sum(ans)