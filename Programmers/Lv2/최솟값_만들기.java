package Programmers.Lv2;
import java.util.*;

class 최솟값_만들기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 4, 2},	new int[]{5, 4, 4}));
    }

    public static int solution(int []A, int []B) {
        int answer = 0;
        int n = A.length;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < n; i++) {
            answer += A[i] * B[n-i-1];
        }

        return answer;
    }
}