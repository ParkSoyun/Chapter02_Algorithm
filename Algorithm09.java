/*
 * 임의의 양의 정수 n에 대해 n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
 * n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
 *
 * n은 1이상, 50000000000000 이하인 양의 정수입니다.
 * */

public class Algorithm09 {
    public long solution(long n) {
        long sqrt_n = (long)Math.sqrt(n);

        long answer = -1;

        if(Math.pow(sqrt_n, 2) == n) {
            answer = (long)Math.pow(sqrt_n + 1, 2);
        }

        return answer;
    }

    public static void main(String[] args) {
        long result = new Algorithm09().solution(121);

        System.out.println("result: " + result);
    }
}
