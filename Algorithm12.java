/*
 * 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
 * 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
 * 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
 *
 * x는 1 이상, 10000 이하인 정수입니다.
 */

public class Algorithm12 {
    public boolean solution(int x) {
        String x_string = Integer.toString(x);
        int sum = 0;
        boolean answer;

        for(int i=0; i<x_string.length(); i++) {
            sum += x_string.charAt(i) - '0';
        }

        if(x % sum == 0) {
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        boolean result = new Algorithm12().solution(10);

        System.out.println("result: " + result);
    }
}
