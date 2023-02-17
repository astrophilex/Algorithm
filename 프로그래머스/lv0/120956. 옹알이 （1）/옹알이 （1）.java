class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(int i = 0 ; i < babbling.length ; i++){
            String b = babbling[i];
            b = b.replace("aya","___");
            b = b.replace("ye","__");
            b = b.replace("woo","___");
            b = b.replace("ma","__");
            b = b.replace("_","");
            if(b.equals("")){
                answer = answer + 1;
            }

        }
        return answer;
    }
}