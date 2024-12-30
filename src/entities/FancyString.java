package entities;

public class FancyString {
	public static String makeFancyString(String s) {
        StringBuilder ans = new StringBuilder();
        int sameCount = 0;
        char prev = s.charAt(0);
        for(char curr : s.toCharArray()) {
        	if(prev == curr) {
        		sameCount++;
        	} else {
        		sameCount = 1;
        	}
        	if(sameCount < 3) {
        		ans.append(curr);
        	}
        	prev = curr;
        }
        return ans.toString();
    }

	public static void main(String[] args) {
		String s = "leeetcoooodeeee";
		System.out.println(makeFancyString(s));
	}

}
