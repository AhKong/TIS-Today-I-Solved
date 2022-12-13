import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/*
 문자열 s가 매개변수로 주어집니다.
 s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
*/
    public class Solution {
        public String solution(String s) {
            String answer = "";
            for(int i = 0; i<s.length(); i++){
                if(s.indexOf(s.charAt(i))==i && s.lastIndexOf(s.charAt(i))==i){
                    answer+=s.charAt(i);
                }
            }
            char[] chars = answer.toCharArray();
            Arrays.sort(chars);
            return  new String(chars);
        }

        public String solution2(String s){
            return Arrays.stream(s.split(""))
                    .collect(Collectors.groupingBy(s1 -> s1))
                    .entrySet()
                    .stream()
                    .filter(entry -> entry.getValue().size() <= 1)
                    .map(Map.Entry::getKey)
                    .sorted()
                    .collect(Collectors.joining());
        }
    }
