'''
    개인정보 휴대폰 번호 가린다.
    뒷 내자리 제외한 나머지 부분 전부 *로 변경하는 코드를 구현하시오
'''
def solution(phone_number):
    return ("*"*(len(phone_number)-4)) + phone_number[-4:]

    
