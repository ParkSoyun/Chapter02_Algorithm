import java.util.Arrays;

/*
 * 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
 * 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
 * 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
 *
 * 두 수는 1이상 1000000이하의 자연수입니다.
 */

public class Algorithm28 {
    public int[] solution(int n, int m) {
        int gcd = 0;
        int divisor = 1;

        while((n/divisor >= 1) && (m/divisor >= 1)) {
            if((n%divisor == 0) && (m%divisor == 0)) {
                gcd = divisor;
            }

            divisor++;
        }

        int lcm = gcd * (n/gcd) * (m/gcd);

        int[] answer = new int[]{gcd, lcm};

        return answer;
    }

    public static void main(String[] args) {
        int[] result = new Algorithm28().solution(3, 12);

        System.out.println("result: " + Arrays.toString(result));
    }
}
