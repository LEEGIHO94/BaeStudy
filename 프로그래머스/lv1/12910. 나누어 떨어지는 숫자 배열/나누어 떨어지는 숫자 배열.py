def solution(arr, divisor):
    tmp = sorted([i for i in arr if i % divisor == 0])
    if not tmp:
        return [-1]
    return tmp
