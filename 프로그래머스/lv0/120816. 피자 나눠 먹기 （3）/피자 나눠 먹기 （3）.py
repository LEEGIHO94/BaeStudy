'''
    피자 조각 수 slice 피자먹는 사람수 n
    n명이 최소 한 조각 이상 피자 먹으려면 몇개 시켜야하는가?
    slice / n 이 값이 있을 경우
    
'''
def solution(slice, n):
    return (n-1)//slice + 1
