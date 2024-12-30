package entities;

public class IntegerToHexadecimal {
	public static String toHex(int num) {
		long n = num;
		if(n < 0) {
			n = (long)(Math.pow(2, 32) + num);
		}
        StringBuilder res = new StringBuilder();
        while(n > 0){
            int rem = (int)(n % 16);
            if(rem >= 10){
                int a = rem - 10;
                char ch = 'a';
                res.append((char)(ch+a));
            }else {
                res.append(rem);
            }
            n =  n / 16;
        }
        return res.reverse().toString();
    }
	
	public static void main(String[] args) {
		int a = -1;
		System.out.println(toHex(a));
	}

}
