package com.xgeek.main;

public class ReverseInteger {

	public static void main(String[] args) {
		ReverseInteger reverseInteger = new ReverseInteger();
		int x = 1267;
		System.out.println(reverseInteger.reverse(x));

	}
    public int reverse(int x) {
        
        long maxInt = Integer.MAX_VALUE;
        long minInt = Integer.MIN_VALUE;
        long m=x%10;//7
        long n=x/10;//126
        while(n!=0){
         long t= n%10;
         m=m*10;
         m=m+t;
         n=n/10;

         if (m > maxInt || m < minInt ) {
                 return 0;
         }
        }
        int k= (int) m;
      
        return k;
     }

}
