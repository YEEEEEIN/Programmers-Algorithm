package 연속된_수의_합;

import java.util.Arrays;

class Solution2 {
	public int[] solution(int num, int total) {
		int[] answer = new int[num];
		for (int i = 0; i < num; i++) {
			answer[i] = total / num - (num - 1) / 2 + i;

		}
		return answer;
	}

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		System.out.println(Arrays.toString(s.solution(3, 12)));
		System.out.println(Arrays.toString(s.solution(5, 15)));
		System.out.println(Arrays.toString(s.solution(4, 14)));
		System.out.println(Arrays.toString(s.solution(5, 5)));

	}
}