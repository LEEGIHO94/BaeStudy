'''
    이 문제는 일단 나눠서 데이터가 자연수면 다음 자연수의 제곱 리턴하고 아니면 -1 리턴해라 이거네
'''
import math
def solution(n):
    x = math.sqrt(n)
    if x == int(x):
        return math.pow(x+1,2)
    return -1