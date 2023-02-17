class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        String push = A;
        for(int i = 0; i < A.length(); i++){
            if(push.equals(B)){
            return answer;
            }
            String a = push.substring(push.length() - 1);
            push = a + push.substring(0, push.length() - 1);
        answer ++;
        }
        return -1;
    }
}