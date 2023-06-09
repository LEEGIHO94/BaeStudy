def solution(n):
    answer = 0
    i = 1
    while i*i <= n:
        if n % i == 0:
            answer+=i     
            if i != n/i:
                answer+= (n/i)
        i+=1
    return answer