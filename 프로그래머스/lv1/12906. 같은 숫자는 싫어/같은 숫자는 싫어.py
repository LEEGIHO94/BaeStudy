'''
    0~9 로 구성
    연속하는 숫자 하나 남기고 전부 제거 -> 제거된 수 반환할 때는 arr의 원소 순서 유지해야된다.
    즉 answer 리스트를 만들어서 거기다가 데이터를 하나하나 다 박아라
    검증할 때는 일단 스택을 하나 만들어서 peek가 같은지 체크해보고 같으면 꺼내라 이런 느김
'''
def solution(arr):
    answer = []
    for i in range(len(arr)):
        if i == 0:
            answer.append(arr[i])
            
        elif arr[i] != arr[i - 1]:
            answer.append(arr[i])
    return answer