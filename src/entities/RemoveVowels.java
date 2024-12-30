package entities;

public class RemoveVowels {
	static String removeVowels(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' &&
               s.charAt(i) != 'o' && s.charAt(i) != 'u'){
                   sb.append(s.charAt(i));
               }
        }
        return sb.toString();
    }

	public static void main(String[] args) {
		String s = "welcome";
		System.out.println(removeVowels(s));
	}

}
