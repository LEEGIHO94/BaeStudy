def solution(n):
    ls = list(str(n))
    ls.sort(reverse = True)
    return int("".join(ls))
    return int("".join(sorted(str(n)), reverse=True));