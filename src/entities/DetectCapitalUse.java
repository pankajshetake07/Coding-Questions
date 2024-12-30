package entities;

public class DetectCapitalUse {
	public static boolean detectCapitalUse(String str) {
		int count =0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				count++;
			}
		}
		if(!Character.isUpperCase(str.charAt(0)) && count >=1 ) {
			return false;
		}
		if(count == str.length() || count == 1 || count == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String str = "ffffffffffffffffffffF";
		System.out.println(detectCapitalUse(str));
	}

}
