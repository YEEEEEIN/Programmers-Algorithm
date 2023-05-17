package 연속된_수의_합;

import java.util.Arrays;

class Solution {
	public int[] solution(int num, int total) {
		int[] answer = new int[num];
		if (num % 2 == 1) { // 연속된 수의 갯수가 홀수이면
			for (int i = 0; i < num; i++) {
				answer[i] = total / num - (num - 1) / 2 + i; // 정석
				// answer[i] = total/num - num/2 + i;
			}
		} else { // 연속된 수의 갯수가 짝수이면
			for (int i = 0; i < num; i++) {
				answer[i] = total / num - num / 2 + 1 + i; // 정석
				// answer[i] = total/num - (num-1)/2 + i;
			}

		}
		return answer;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(Arrays.toString(s.solution(3, 12)));
		System.out.println(Arrays.toString(s.solution(5, 15)));
		System.out.println(Arrays.toString(s.solution(4, 14)));
		System.out.println(Arrays.toString(s.solution(5, 5)));

	}
}