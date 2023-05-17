/*
 * 등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 
 * 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.
 */
package ss;

class Solution {
	public int solution(int[] common) {
		int answer = 0;
		int a = common[2] - common[1];
		int b = common[1] - common[0];
		int c = common[1] / common[0];
		
		if (a == b) { // 등차 수열
			answer = common[common.length - 1] + a;
		} else { // 등비 수열
			answer = common[common.length - 1] * c;
		}
		return answer;
        
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(new int[] { 1, 2, 3, 4 }));
		System.out.println(s.solution(new int[] { 2, 4, 8 }));

	}
}