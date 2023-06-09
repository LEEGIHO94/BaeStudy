def solution(a, b):
    answer = 0
    m = min([a,b])
    n = max([a,b])
    return sum(range(m,n+1))