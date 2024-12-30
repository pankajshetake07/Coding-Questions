package entities;

public class GCD {
	public static int gcd(int a, int b) {
		int temp=0;
        if(a==1 & b==1){
            return 1;
        }
        int n = Math.max(a,b);
        for(int i=1; i<=n/2; i++){
            if(a % i == 0 && b % i == 0){
                temp = i;
                continue;
            }
        }
        return temp;
    }

	public static void main(String[] args) {		
		int a = 48, b = 72;
		System.out.println(gcd(a, b));
	}

}
