/*
 영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다.
 문자열 numbers가 매개변수로 주어질 때, numbers를 정수로 바꿔 return 하도록 solution 함수를 완성해 주세요.
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public long solution(String numbers) {

        Map<String, Integer> numberMap = new HashMap<>();
        numberMap.put("zero", 0);
        numberMap.put("one", 1);
        numberMap.put("two", 2);
        numberMap.put("three", 3);
        numberMap.put("four", 4);
        numberMap.put("five", 5);
        numberMap.put("six", 6);
        numberMap.put("seven", 7);
        numberMap.put("eight", 8);
        numberMap.put("nine", 9);

        for (String key : numberMap.keySet()) {
            if (numberMap.containsKey(key)) {
                numbers = numbers.replace(key, String.valueOf(numberMap.get(key)));
            }
        }

        long answer = (long) Double.parseDouble(numbers);
        return answer;
    }
    
    
    // 배열의 인덱스를 활용
    public long solution2(String numbers) {
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < strArr.length; i++) {
            numbers = numbers.replaceAll(strArr[i], String.valueOf(i));
        }

        return Long.parseLong(numbers);
    }
}
