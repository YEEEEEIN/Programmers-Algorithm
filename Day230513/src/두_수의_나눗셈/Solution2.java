/*
 * 정수 num1과 num2가 매개변수로 주어질 때, 
 * num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.
 */
package 두_수의_나눗셈;

class Solution2 {
    public int solution(int num1, int num2) {
        int answer = (int)(num1 / (double)num2 * 1000);
        return answer;
    }

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		System.out.println(s.solution(3,2));
		System.out.println(s.solution(7,3));
		System.out.println(s.solution(1,16));
	}
}
