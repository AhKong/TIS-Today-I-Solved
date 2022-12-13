import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.List;

/*
 문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때,
 my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
*/
public class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder(my_string);
        char num1Char = my_string.charAt(num1);
        char num2Char = my_string.charAt(num2);
        sb.setCharAt(num2,num1Char);
        sb.setCharAt(num1,num2Char);
        return sb.toString();
    }

    public String solution2(String myString, int num1, int num2) {
        List<String> list = Arrays.stream(myString.split("")).collect(Collectors.toList());
        Collections.swap(list, num1, num2);
        return String.join("", list);
    }
}
