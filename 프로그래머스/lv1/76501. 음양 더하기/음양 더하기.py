'''
    정수 배열 ab 부호 차례로 담은게 sig.  true 양 false 음
    합을 구해라
'''
def solution(absolutes, signs):
    return sum([val if signs[idx] else -val for idx, val in enumerate(absolutes)])
    # return sum([absolutes[i] if signs[i] else -absolutes[i] for i, _ in enumerate(absolutes)])

