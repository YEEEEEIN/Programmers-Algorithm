/*
 * 문자열 my_string이 매개변수로 주어집니다. 
 * my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
 */

package 문자열_뒤집기;

class Solution2 {
	public String solution(String my_string) {
		// StringBuffer / reverse() 메소드 사용하기
		StringBuffer sb = new StringBuffer(my_string);
		return sb.reverse().toString();
		
        //StringBuilder sb = new StringBuilder(my_string);
        //return sb.reverse().toString();
    }
    
    public static void main(String[] args) {
    	Solution2 s = new Solution2();
		System.out.println(s.solution("jaron"));
		System.out.println(s.solution("bread"));
		
	}
}