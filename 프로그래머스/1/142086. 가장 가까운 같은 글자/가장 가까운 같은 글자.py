def solution(s):
    answer = []
    a = list(s)
    
    for i in range(len(a)):
        if a[i] not in a[:i]:
            answer.append(-1)
        else:
            for j in range(i - 1, -1, -1):
                if a[i] == a[j]:
                    answer.append(i - j)
                    break
    return answer