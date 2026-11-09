def solution(s, n):
    answer = ""

    for c in s:
        if c == " ":
            answer += " "

        elif c.islower():
            # 소문자 처리
            answer += chr((ord(c) - ord('a') + n) % 26 + ord('a'))

        else:
            # 대문자 처리
            answer += chr((ord(c) - ord('A') + n) % 26 + ord('A'))

    return answer