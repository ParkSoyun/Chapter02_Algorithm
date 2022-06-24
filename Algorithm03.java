/*
 * 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
 * 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
 *
 *
 * n은 길이 10,000이하인 자연수입니다.
 */

public class Algorithm03 {
    public String solution(int n) {
        StringBuilder answer_sb = new StringBuilder();
        String answer = "";

        for(int i=1; i<n+1; i++) {
            if(i % 2 == 1) {
                answer_sb.append("수");
            } else {
                answer_sb.append("박");
            }
        }

        answer = answer_sb.toString();

        return answer;
    }

    public static void main(String[] args) {
        String result = new Algorithm03().solution(3);

        System.out.println("result: " + result);
    }
}
