package Programmers.Lv2;

class 숫자의_표현 {
    public static void main(String[] args) {
        System.out.println(solution(15));
    }

    public static int solution(int n) {
        int answer = 0;
        for (int i=1; i<=n; i++) {
            int tmp = i;
            for (int j=i+1; j<=n; j++) {
                tmp += j;
                if (tmp >= n) break;
            }
            if (tmp == n) answer++;
        }
        return answer;
    }
}