/*
 문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.
 "abc1Addfggg4556b"	6	["abc1Ad", "dfggg4", "556b"]
*/
public class Solution {
    public String[] solution(String my_str, int n) {
        int count = (int) Math.ceil((double) my_str.length()/n);
        String[] answer = new String[count];
        for(int i = 0; i<count; i++){
            int start  = n*i;
            int end = 0;
            if(i==(count-1)){
                end = my_str.length();
            } else {
                end = start+n;
            }
            answer[i] =my_str.substring(start,end);
        }
        return answer;
    }
}

