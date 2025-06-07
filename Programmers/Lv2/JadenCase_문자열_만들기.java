package Programmers.Lv2;

class JadenCase_문자열_만들기 {
    public static void main(String[] args) {
        System.out.println(solution("3people unFollowed me"));
    }

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isFirst = true;
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (c == ' ') {
                sb.append(c);
                isFirst = true;
            } else {
                sb.append(isFirst ? Character.toUpperCase(c) : Character.toLowerCase(c));
                isFirst = false;
            }
        }
        return sb.toString();
    }
}