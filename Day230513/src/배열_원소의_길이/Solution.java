/*
 * 문자열 배열 strlist가 매개변수로 주어집니다. 
 * strlist 각 원소의 길이를 담은 배열을 retrun하도록 solution 함수를 완성해주세요.
 */

package 배열_원소의_길이;

import java.util.Arrays;

class Solution {
	public int[] solution(String[] strlist) {
		int[] answer = new int[strlist.length]; // 배열은 선언할 때 크기 지정
		for (int i = 0; i < strlist.length; i++) {
			answer[i] = strlist[i].length();
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		// 배열을 출력하고 싶을 때
		// Arrays.toString으로 배열을 문자열로으로 바꿔서 출력
		System.out.println(Arrays.toString(s.solution(new String[] { "We", "are", "the", "world!" })));
		System.out.println(Arrays.toString(s.solution(new String[] { "I", "Love", "Programmers." })));

	}
}