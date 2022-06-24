/*
 * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
 * 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
 *
 *
 * N의 범위 : 100,000,000 이하의 자연수
 */

public class Algorithm06 {
    public int solution(int n) {
        String n_string = Integer.toString(n);
        int answer = 0;

        for(int i=0; i<n_string.length(); i++) {
            answer += n_string.charAt(i) - '0';
        }

        return answer;
    }

    public static void main(String[] args) {
        int result = new Algorithm06().solution(123);

        System.out.println("result: " + result);
    }
}
