package entities;

public class PhrasePalindrome {
	public static boolean isPal(String s) {
		String s2 = s.toLowerCase();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<s2.length(); i++) {
			if(s2.charAt(i) >= 'a' && s2.charAt(i) <= 'z') {
				sb.append(s2.charAt(i));
			}
		}
		System.out.println(sb.toString());
		int n = sb.length();
		for(int i=0, j=n-1; i<j; i++, j--) {
			if(sb.charAt(i) != sb.charAt(j)) {
				return false;
			}
		}
		return true;
	}
	

	public static void main(String[] args) {
		String s = "   A man, a plan, a canal: Panama        ";
		System.out.println(isPal(s));
	}

}
