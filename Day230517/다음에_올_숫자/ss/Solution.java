/*
 * 등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 
 * 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.
 */
package ss;

class Solution {
	public int solution(int[] common) {
		// 런타임 error 수정
		int answer = 0;
        if(common[2] - common[1] == common[1] - common[0]){ // 등차 수열
            answer = common[common.length - 1] + (common[1] - common[0]);
        } else { // 등비 수열
            answer = common[common.length - 1] * (common[1] / common[0]);
        }
        return answer;
        
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(new int[] { 1, 2, 3, 4 }));
		System.out.println(s.solution(new int[] { 2, 4, 8 }));

	}
}