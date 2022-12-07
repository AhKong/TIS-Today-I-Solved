/*
* 문자열 "hello"에서 각 문자를 오른쪽으로 한 칸씩 밀고 마지막 문자는 맨 앞으로 이동시키면 "ohell"이 됩니다.
* 이것을 문자열을 민다고 정의한다면 문자열 A와 B가 매개변수로 주어질 때, A를 밀어서 B가 될 수 있다면 몇 번 밀어야 하는지 횟수를 return하고
* 밀어서 B가 될 수 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
* */
public class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        char[] charArr = A.toCharArray();

        boolean isCorrect = false;

        if(A.equals(B)){
            return 0;
        }

        for(int j = 0 ; j<charArr.length-1; j++){
            answer++;
            char temp = charArr[charArr.length-1];
            // 오른쪽으로 shift 했음
            for(int i = charArr.length-1; i>=1; i--){
                charArr[i] = charArr[i-1];
            }
            charArr[0] = temp;
            if(String.valueOf(charArr).equals(B)){
                isCorrect=true;
                break;
            }
        }

        return isCorrect ? answer : -1;
    }

    public int solution2(String A, String B) {
        String tempB = B.repeat(2);
        System.out.println(tempB);
        return tempB.indexOf(A);
    }
}

