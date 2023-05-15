/*
 * 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. 
 * num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
 */

package 배열_뒤집기;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for(int i = 0; i <= num_list.length -1; i++){
            answer[i] = num_list[num_list.length-1-i];
        }
        return answer;
    }
    
    public static void main(String[] args) {
    	Solution s = new Solution();
		// 배열을 출력하고 싶을 때
		// Arrays.toString으로 배열을 문자열로으로 바꿔서 출력
		System.out.println(Arrays.toString(s.solution(new int[] {1, 2, 3, 4, 5})));
		System.out.println(Arrays.toString(s.solution(new int[] { 1, 1, 1, 1, 1, 2})));
		System.out.println(Arrays.toString(s.solution(new int[] { 1, 0, 1, 1, 1, 3, 5})));
		
	}
}
