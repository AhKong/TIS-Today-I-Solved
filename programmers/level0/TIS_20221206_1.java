/*
* 연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다.
* 두 정수 num과 total이 주어집니다.
* 연속된 수 num개를 더한 값이 total이 될 때, 정수 배열을 오름차순으로 담아 return하도록 solution함수를 완성해보세요.
 * */

public class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        double center = Math.ceil((double) total / num * 10000/10000.0);
        if(num%2==0){
            num = num/2;
        } else {
            num = (num-1)/2;
        }
        int temp = 0;
        int t = 1;
        for(int i = 0 ; i<answer.length;i++){
            if(temp < num){
                answer[i] = (int)(center-num+i);
            } else if(temp == (num) ){
                answer[i] = (int) center;
            } else {
                answer[i] = (int)(center+t);
                t++;
            }
            temp++;
        }
        return answer;
    }
}

