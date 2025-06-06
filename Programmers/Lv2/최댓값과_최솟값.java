package Programmers.Lv2;
import java.util.*;

class 최댓값과_최솟값 {
    public static void main(String[] args) {
        System.out.println(solution("1 -1 1 2"));
    }

    public  static String solution(String s) {
        String[] sn = s.split(" ");
        int[] nums = new int[sn.length];
        for (int i = 0; i < sn.length; i++) {
            nums[i] = Integer.parseInt(sn[i]);
        }
        Arrays.sort(nums);
        return nums[0] + " " + nums[nums.length - 1];
    }
}