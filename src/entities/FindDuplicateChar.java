package entities;

public class FindDuplicateChar {

	public static void main(String[] args) {
		String str = "welcomeoooolll";
		StringBuilder sb = new StringBuilder(str);
		//String temp = "";
		for(int i=0; i<sb.length(); i++) {
			boolean duplicateFound = false;
			for(int j=i+1; j<sb.length(); j++) {
				if(sb.charAt(i) == sb.charAt(j)) {
					sb.deleteCharAt(j);
					j--;
					duplicateFound = true;
				}
			}
			if(duplicateFound) {
				sb.deleteCharAt(i);
				i--;
			}
		}
		System.out.println(sb);
	}

}
