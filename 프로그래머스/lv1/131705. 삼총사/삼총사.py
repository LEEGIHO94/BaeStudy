def solution(numbers):
    answer = 0

    def dfs(idx, cnt, total):
        nonlocal answer

        if cnt == 3:
            if total == 0:
                answer += 1
            return

        if idx >= len(numbers):
            return

        dfs(idx + 1, cnt + 1, total + numbers[idx])  # 현재 수를 선택한 경우
        dfs(idx + 1, cnt, total)  # 현재 수를 선택하지 않은 경우

    dfs(0, 0, 0)
    return answer