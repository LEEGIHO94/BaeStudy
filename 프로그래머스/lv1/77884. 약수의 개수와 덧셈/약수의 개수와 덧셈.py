def getMyDivisor(n):
    count = 0
    for i in range(1, int(n**(1/2)) + 1):
        if (n % i == 0):
            count += 1 
            if ( (i**2) != n) : 
                count += 1
    return count

def solution(left, right):
    return sum([i if getMyDivisor(i) % 2 == 0 else -i for i in range(left, right+1)])