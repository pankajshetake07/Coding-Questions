package entities;

public class CountAndSay {
	
	static String countAndSay(int n) {
		String ans = "1";
		for(int i=1; i<n; i++) {
			ans = helper(ans);
		}
		return ans;
	}
	static String helper(String s) {
		StringBuilder sb = new StringBuilder();
		char prev = s.charAt(0);
		int count = 1;
		for(int i=1; i<s.length(); i++) {
			if(s.charAt(i) == prev) {
				count++;
			} else {
				sb.append(count);
				sb.append(prev);
				prev = s.charAt(i);
				count = 1;
			}
		}
		sb.append(count);
		sb.append(prev);
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(countAndSay(1));
	}
}
