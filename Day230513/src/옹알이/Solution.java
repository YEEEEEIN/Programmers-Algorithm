package 옹알이;

class Solution {
	public int solution(String[] babbling) {
		int answer = 0;

		for (int i = 0; i < babbling.length; i++) {
			babbling[i] = babbling[i].replaceFirst("aya", "0");
			babbling[i] = babbling[i].replaceFirst("woo", "0");
			babbling[i] = babbling[i].replaceFirst("ye", "0");
			babbling[i] = babbling[i].replaceFirst("ma", "0");
			babbling[i] = babbling[i].replace("0", "");

			if (babbling[i].equals(""))
				answer++;
		}

		return answer;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(new String[] { "aya", "yee", "u", "maa", "wyeoo" }));
		System.out.println(s.solution(new String[] { "ayaye", "uuuma", "ye", "yemawoo", "ayaa" }));

	}
}
