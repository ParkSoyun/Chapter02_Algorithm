import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 * array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
 * divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
 *
 *
 * arr은 자연수를 담은 배열입니다.
 * 정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
 * divisor는 자연수입니다.
 * array는 길이 1 이상인 배열입니다.
 */

public class Algorithm02 {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answer_list = new ArrayList<>();

        for(int i=0; i<arr.length; i++) {
            if(arr[i] % divisor == 0) {
                answer_list.add(arr[i]);
            }
        }

        if(answer_list.size() == 0) {
            return new int[]{-1};
        } else {
            Collections.sort(answer_list);

            int[] answer = new int[answer_list.size()];

            for(int j=0; j<answer_list.size(); j++) {
                answer[j] = answer_list.get(j).intValue();
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        int[] result = new Algorithm02().solution(new int[]{5, 9, 7, 10}, 5);

        System.out.println("result: " + Arrays.toString(result));
    }
}
