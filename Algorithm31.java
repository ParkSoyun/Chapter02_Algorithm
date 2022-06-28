/*
 * 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
 * 소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다. (1은 소수가 아닙니다.)
 *
 * n은 2이상 1000000이하의 자연수입니다.
 */

public class Algorithm31 {
    public int solution(int n) {
        int answer = 0;

        boolean isPrimeNum = true;

        for(int i=2; i<n+1; i++) {
            if(i == 2) {
                isPrimeNum = true;
            } else if(i % 2 == 0) {
                isPrimeNum = false;
            } else {
                for(int j=2; j<Math.sqrt(i)+1; j++) {
                    if(i % j == 0) {
                        isPrimeNum = false;

                        break;
                    }
                }
            }

            if(isPrimeNum == true) {
                answer++;
            } else {
                isPrimeNum = true;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int result = new Algorithm31().solution(10);

        System.out.println("result: " + result);
    }
}
