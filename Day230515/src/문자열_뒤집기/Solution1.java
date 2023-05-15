/*
 * 문자열 my_string이 매개변수로 주어집니다. 
 * my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
 */

package 문자열_뒤집기;

class Solution1 {
    public String solution(String my_string) {
        String answer = "";
        for(int i = my_string.length()-1; i >= 0; i--) {
        	answer += my_string.charAt(i); // 문자열의 덧셈은 이어붙여주기
        }
        return answer;
    }
    
    public static void main(String[] args) {
    	Solution1 s = new Solution1();
		System.out.println(s.solution("jaron"));
		System.out.println(s.solution("bread"));
		
	}
}