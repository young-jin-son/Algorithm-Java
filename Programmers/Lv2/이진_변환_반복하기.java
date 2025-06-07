package Programmers.Lv2;
import java.util.*;

class 이진_변환_반복하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("110010101001")));
    }

    public static int[] solution(String s) {
        int[] answer = new int[2];
        while (!s.equals("1")) {
            String tmp = s.replace("0", "");
            answer[0]++;
            answer[1] += s.length() - tmp.length();
            s = Integer.toBinaryString(tmp.length());
        }
        return answer;
    }
}