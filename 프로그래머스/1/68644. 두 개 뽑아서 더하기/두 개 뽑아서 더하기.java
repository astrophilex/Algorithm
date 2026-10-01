import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                int value = numbers[i] + numbers[j];
                
                if (!list.contains(value)) {
                        list.add(value);
                }
            }
        }
        
        Collections.sort(list); // 오름차순 정렬
        int[] answer = new int [list.size()]; // answer 배열의 크기를 list 만큼으로 지정
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}