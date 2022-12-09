/*
my_string은 "3 + 5"처럼 문자열로 된 수식입니다.
 문자열 my_string이 매개변수로 주어질 때, 수식을 계산한 값을 return 하는 solution 함수를 완성해주세요.
*/
public class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] strArr = my_string.split(" ");
        int a = Integer.parseInt(strArr[0]);
        for(int i = 1; i<strArr.length;i+=2){
            int b = Integer.parseInt(strArr[i+1]);
            answer = (strArr[i].equals("+")? a+b : a-b);
            a = answer;
        }
        return answer;
    }
}
