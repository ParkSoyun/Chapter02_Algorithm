import java.util.Arrays;

/*
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
 * 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 *
 *
 * n은 10,000,000,000이하인 자연수입니다.
 */

public class Algorithm07 {
    public int[] solution(long n) {
        String n_string = Long.toString(n);
        int[] answer = new int[n_string.length()];

        for(int i=0; i<n_string.length(); i++) {
            answer[n_string.length()-(i+1)] = n_string.charAt(i) - '0';
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] result = new Algorithm07().solution(12345);

        System.out.println("result: " + Arrays.toString(result));
    }
}
