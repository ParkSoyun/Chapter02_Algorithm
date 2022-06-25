import java.util.ArrayList;
import java.util.Arrays;

/*
 * 수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다.
 * 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
 *
 * 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
 * 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
 * 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
 *
 * 1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 *
 * 시험은 최대 10,000 문제로 구성되어있습니다.
 * 문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
 * 가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
 */

public class Algorithm18 {
    public int[] solution(int[] answers) {
        int[] pattern_one = {1 ,2, 3, 4, 5};
        int[] pattern_two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern_three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        ArrayList<Integer> one = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        ArrayList<Integer> three = new ArrayList<>();

        for(int i=0; i<answers.length; i++) {
            one.add(pattern_one[i % pattern_one.length]);
            two.add(pattern_two[i % pattern_two.length]);
            three.add(pattern_three[i % pattern_three.length]);
        }

        int[] correct_count = new int[answers.length];

        for(int i=0; i<answers.length; i++) {
            if(answers[i] == one.get(i)) {
                correct_count[0]++;
            }
            if(answers[i] == two.get(i)) {
                correct_count[1]++;
            }
            if(answers[i] == three.get(i)) {
                correct_count[2]++;
            }
        }

        int max = Arrays.stream(correct_count).max().getAsInt();

        ArrayList<Integer> answer_list = new ArrayList<>();

        for(int i=0; i<3; i++) {
            if(max == correct_count[i]) {
                answer_list.add(i);
            }
        }

        int[] answer = new int[answer_list.size()];

        for(int i=0; i<answer_list.size(); i++) {
            answer[i] = answer_list.get(i) + 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] result = new Algorithm18().solution(new int[]{1,2,3,4,5});

        System.out.println("result: " + Arrays.toString(result));
    }
}
