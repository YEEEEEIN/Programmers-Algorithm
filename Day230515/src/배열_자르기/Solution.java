/*
 * 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때, 
 * numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 
 * solution 함수를 완성해보세요.
 */

package 배열_자르기;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int [num2 - num1 + 1]; // 배열은 선언과 동시에 크기를 지정해줘야 한다
        
        int index = 0;
        for(int i = num1; i<= num2; i++){
            answer[index] = numbers[i];
            index++;
        }
        return answer;
    }
    public static void main(String[] args) {
    	Solution s = new Solution();
		// 배열을 출력하고 싶을 때
		// Arrays.toString으로 배열을 문자열로으로 바꿔서 출력
		System.out.println(Arrays.toString(s.solution(new int[] {1, 2, 3, 4, 5},1,3)));
		System.out.println(Arrays.toString(s.solution(new int[] {1, 3, 5},1,2)));
		
	}
}
