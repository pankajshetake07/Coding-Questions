package entities;

public class LongestPalindromicSubstring {
	public static String longestPalindromicSubstr(String s) {
		StringBuilder sb = new StringBuilder();
		int i=0;
		int j=s.length()-1;
		while(i <= j) {
			if(s.charAt(i) != s.charAt(j)) {
				j--;
			} else if(s.charAt(i) == s.charAt(j)) {
				sb.append(Character.valueOf(s.charAt(i)));
				sb.append(Character.valueOf(s.charAt(j)));
				i++;
				j--;
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String s = "babadn";
		System.out.println(longestPalindromicSubstr(s));
	}

}
