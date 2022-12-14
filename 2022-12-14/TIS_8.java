/*
문자열 before와 after가 매개변수로 주어질 때,
before의 순서를 바꾸어 after를 만들 수 있으면 1을,
만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.
*/

import java.util.Arrays;

public class Solution {
    public int solution(String before, String after) {
        for(char c : before.toCharArray()){
            if(after.contains(String.valueOf(c))){
                int index = after.indexOf(String.valueOf(c));
                after = after.replaceFirst(after.substring(index,index+1),"");
            }
        }
        return after.isBlank()? 1 : 0;
    }

    // 진짜 이렇게 신박하게 풀ㄹ어보고 픔............
    public int solution2(String before,String after){
        char[] a = before.toCharArray();
        char[] b = after.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        return new String(a).equals(new String(b)) ? 1 :0;
    }
}
