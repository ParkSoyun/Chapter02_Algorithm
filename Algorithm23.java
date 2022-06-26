/*
 * 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
 * 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다.
 * 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
 *
 * 공백은 아무리 밀어도 공백입니다.
 * s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
 * s의 길이는 8000이하입니다.
 * n은 1 이상, 25이하인 자연수입니다.
 */

public class Algorithm23 {
    public String solution(String s, int n) {
        char[] s_array = s.toCharArray();
        StringBuilder answer_sb = new StringBuilder();

        for(int i=0; i<s_array.length; i++) {
            if(s_array[i] == 32) {
                answer_sb.append(s_array[i]);
            } else {
                char change = (char)(s_array[i] + n);

                if(change > 122) {
                    answer_sb.append((char)(change - 26));
                } else if(s_array[i] <= 90 && change > 90) {
                    answer_sb.append((char)(change - 26));
                } else {
                    answer_sb.append((char)change);
                }
            }
        }

        String answer = answer_sb.toString();

        return answer;
    }

    public static void main(String[] args) {
        String result = new Algorithm23().solution("a B z", 4);

        System.out.println("result: " + result);
    }
}
