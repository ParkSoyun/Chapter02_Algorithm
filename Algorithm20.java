import java.util.Arrays;

/*
 *문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
 * s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
 *
 * str은 길이 1 이상인 문자열입니다.
 */

public class Algorithm20 {
    public String solution(String s) {
        char[] s_array = s.toCharArray();

        Arrays.sort(s_array);

        StringBuilder answer_sb = new StringBuilder();

        for(int i=s_array.length-1; i>=0; i--) {
            answer_sb.append(s_array[i]);
        }

        String answer = answer_sb.toString();

        return answer;
    }

    public static void main(String[] args) {
        String result = new Algorithm20().solution("Zbcdefg");

        System.out.println("result: " + result);
    }
}
