class Solution {
    public int solution(int n) {
        int answer = 0;
        int power = 1;
        StringBuilder sb = new StringBuilder(); // string에 append로 추가할 때 씀
        
        while(n > 0){
            sb.append(n % 3); // 3진법 변환위해 나누기 3
            n /= 3; // 이걸 해줘야 n 값 줄어들고 반복문 탈출 가능
        }
        
        for(int i = sb.length() - 1; i >= 0; i--){ // 현재 반전상태로 저장 되어 있음. 뒤에부터 3 곱하니까 뒤부터 호출
             int num = sb.charAt(i) - '0'; // 문자열 '0' 빼는 이유는 '0' = 48 '1' = 49 라서 숫자로 바꿔주는 작업
            answer += num * power; // 3의 배수 곱해줌
            power *= 3; // power는 3의 값을 올려줌 3 * 1 -> 3 * 3 ...
        }
        
        return answer;
    }
}