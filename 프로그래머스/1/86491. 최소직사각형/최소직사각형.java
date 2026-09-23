class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max_w = 0;
        int max_h = 0;
        int weight = 0;
        int height = 0;
        
        for(int i = 0; i < sizes.length; i++){
            for(int j = 0; j < sizes.length; j++){
                if(sizes[i][0] > sizes[i][1]){
                    weight = sizes[i][0];
                    height = sizes[i][1];
                }else{
                    weight = sizes[i][1];
                    height = sizes[i][0];
                }
                
                if(max_w < weight){
                 max_w = weight;    
                }
                if(max_h < height){
                 max_h = height;    
                }
                
                
                
            }
        }
        
        answer = max_w * max_h;
        
        return answer;
    }
}