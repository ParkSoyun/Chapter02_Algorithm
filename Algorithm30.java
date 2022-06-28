/*
 * 자연수 n이 매개변수로 주어집니다.
 * n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요.
 * 답이 항상 존재함은 증명될 수 있습니다.
 *
 * 3 ≤ n ≤ 1,000,000
 */

public class Algorithm30 {
    public int solution(int n) {
        int answer = 0;

        for(int x=2; x<n; x++) {
            if(n % x == 1) {
                answer = x;

                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int result = new Algorithm30().solution(10);

        System.out.println("result: " + result);
    }
}
