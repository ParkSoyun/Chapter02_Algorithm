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
