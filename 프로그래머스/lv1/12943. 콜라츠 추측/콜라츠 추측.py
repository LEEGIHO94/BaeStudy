def solution(num):
    n = 0
    while True :
        if num == 1:
            break
            
        if num % 2 == 0 :
            num = num /2
        else:
            num = num * 3 + 1

        if n == 501:
            n = -1
            break
        n+=1
    return n
    