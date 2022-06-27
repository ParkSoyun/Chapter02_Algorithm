/*
 * 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
 *
 * n은 0 이상 3000이하인 정수입니다.
 */

public class Algorithm26 {
    public int solution(int n) {
        int answer = 0;

        for(int i=1; i<n+1; i++) {
            if(n % i == 0) {
                answer  += i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int result = new Algorithm26().solution(12);

        System.out.println("result: " + result);
    }
}
