'''
    abcde.  -> c가 중심임 그 c의 인덱스는 2    5 / 2    2
    abcd.    -> bc 가 중심임      이때 b의 인덱스는 1.    나누기 한 값은 2 
    홀수 일 때는 나누기 한 그 몫이 중심 값이 되고
    짝수일때는 나누기한 값 -1부터 하나 더를 슬라이싱해줘야한다.
'''
def solution(s):
    if len(s) ==1 :
        return s
    if len(s) % 2 !=0:
        return s[len(s)//2]
    return s[len(s)//2 -1: len(s)//2 +1]
