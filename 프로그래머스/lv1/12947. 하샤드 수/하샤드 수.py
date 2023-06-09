'''
    if x는 하샤드 수
        x의 자릿수의 합으로 x가 나우어 떨어져야함
    즉 자릿수의 합을 구하는 로직 필요
'''
def solution(x):
    return x % sum([int(i) for i in str(x)]) == 0