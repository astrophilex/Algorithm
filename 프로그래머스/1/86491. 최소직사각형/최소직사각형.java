class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max_w = 0; // 최대 가로 길이
        int max_h = 0; // 최대 세로 길이
        
        // 가로 세로 구분없이 큰 값, 작은 값 구분해서 큰 값 중에서 큰 값, 작은 값 중에서 큰 값 구하면 됨
        
        for(int i = 0; i < sizes.length; i++){
            int weight = Math.max(sizes[i][0], sizes[i][1]); // Math.max 최댓값 구함
            int height = Math.min(sizes[i][0], sizes[i][1]); // Math.max 최솟값 구함

            if(max_w < weight){
             max_w = weight;    
            }
            if(max_h < height){
             max_h = height;    
            }
        }
        
        answer = max_w * max_h;
        
        return answer;
    }
}