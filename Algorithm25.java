/*
 * 두 정수 left와 right가 매개변수로 주어집니다.
 * left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
 *
 * 1 ≤ left ≤ right ≤ 1,000
 */

public class Algorithm25 {
    boolean isSquare(int x) {
        int x_sqrt = (int)Math.sqrt(x);

        if(Math.pow(x_sqrt, 2) == x) {
            return true;
        }

        return false;
    }

    public int solution(int left, int right) {
        int answer = 0;

        for(int i=left; i<right+1; i++) {
            if(isSquare(i)) {
                answer -= i;
            } else {
                answer += i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int result = new Algorithm25().solution(13, 17);

        System.out.println("result: " + result);
    }
}
