package entities;

public class RererseWordsInString {
	public static String reverseWords(String s) {
        s = s.replaceAll("\\s+", " ").trim();
//        System.out.println(s);
        String words[] = s.split(" ");
        StringBuilder sb = new StringBuilder("");
        for(int i=words.length-1; i>=0; i--){
            sb.append(words[i]);
            if(i > 0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }

	public static void main(String[] args) {
		String str = "cb ipctpyru  bovcbo";
//		str = str.replaceAll("\\s+"," ").trim();
//		System.out.println(str);
		System.out.println(reverseWords(str));
	}

}
