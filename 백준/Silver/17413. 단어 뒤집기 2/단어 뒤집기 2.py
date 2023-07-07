import sys
from collections import deque

'''
    문자열 뒤집기 but 단어만 뒤집기
    알파벳 소문자 숫자 공백 특문 구성
    
    시작 끝 공백 아님
    <> 번갈아 등장, <가 먼저 등작
    문자의 개수 같다.
    
    만개 이하 -> 반복 한번만 하는 선에서 깨자.
'''

'''
    하나하나를 입력 받아낸다.
    띄아쓰기를 기준으로 한 단어라고 잡는다.
    이 떄 <> 사이에 있는 값은 변환하지 않는다.
   
    그냥 쉽게 작업하자.
    <가 나오면 >가 나올때 까지의 데이터를 모두 하나의 단어로 만든다,
    아니라면 띄어쓰기를 기준으로 작업을 진행한다.
   
   if "<" in v:
        flag 를 이용하자.
        
   조건을 여러개로 나눈다.
   1.
   1. flag and 띄어쓰기 나왔을 때
   
   2. flag X 띄어 쓰기 나왔을 때
   
   3. > 나왔을 때
        
'''
stack = deque()
answer = list()
ls = list(sys.stdin.readline().strip())
flag = True
for v in ls:
    if "<" in v:
        while stack:
            answer.append(stack.pop())
        flag = False
        answer.append(v)
    elif ">" in v:
        flag = True
        answer.append(v)
    elif not flag :  # 꺽쇠로 시작한 상태
        answer.append(v)
    elif flag and " " in v:
        while stack:
            answer.append(stack.pop())
        answer.append(v)
    else :
        stack.append(v)
while stack:
    answer.append(stack.pop())
print("".join(answer))

