/*
문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.
*/

public class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        // 아스키코드 대문자 : 65~90 소문자 : 97~122
        for(int i = 0 ;i<my_string.length();i++){
            char c = my_string.charAt(i);
            if(c>=65 && c<=90){
                c = (char)(c+32);
            } else {
                c = (char)(c-32);
            }
            answer.append(c);
        }
        return answer.toString();
    }

    public String solution2(String my_string){
        StringBuilder answer = new StringBuilder();
        for(char c : my_string.toCharArray()){
            if(Character.isLowerCase(c)){
                c = Character.toUpperCase(c);
            } else {
                c = Character.toLowerCase(c);
            }
            answer.append(c);
        }
        return answer.toString();
    }
}
