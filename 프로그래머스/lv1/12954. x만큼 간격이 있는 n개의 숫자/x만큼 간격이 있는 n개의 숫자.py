'''
    정수 x 와 자연수 n을 입력 받아 x  부터 x씩 증가하는 숫자 n개를 가지는 리스트 반환
'''
def solution(x, n):
    return [x*i for i in range(1, n+1)]
    
