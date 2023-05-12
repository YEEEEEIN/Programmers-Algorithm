package 배열의_평균값;

class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for(int i =0; i < numbers.length; i++){
            answer += numbers[i];
        }
        answer = answer/numbers.length;
        
        return answer;
    }
    
    public static void main(String[] args) {
    	Solution s = new Solution();
		System.out.println(s.solution(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
		System.out.println(s.solution(new int[] {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99}));
	}
}