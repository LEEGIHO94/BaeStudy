'''
    메서드 생성:
        3진법을 만들어주는 메서드
        이를 다시 10진법으로 만들어라 
'''
def s(n):
    answer = ''
    while n >0 :
        n, a = divmod(n,3)
        answer = answer + str(a)
    return answer

def solution(n):
    answer = s(n)
    return int(answer,3)    