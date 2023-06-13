'''
    단어별 홀수 대문자 짝수 소문자
        -> s를 split 을 통해 list로 만들고
            for문을 통해 값을 만든다.
            합칠 때는 스페이스바를 추가한다.
            하나 이상의 공백 문자로 구분될 수 있다. -> 하나 이상의 공백이 존재할 수 있다.
'''
def solution(s):
    answer = ""
    an = s.split(" ")
    for v in an:
        for i , k in enumerate(v):
            if i % 2 ==0:
                answer += k.upper()
            else :
                answer += k.lower()
        answer += " "
    
    return answer[:-1]