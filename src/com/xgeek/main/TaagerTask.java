package com.xgeek.main;

public class TaagerTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input unsorted array 4,3,1,5,6 find missing number\
		int[] input = new int[] {4,3,1,5,6};
		int lenght = input.length;
		// n* (n+1)/2
		int sum = lenght *(lenght+1)/2 ;
		for(int i =0;i<lenght; i++) {
			sum = sum -input[i];
		}
		// sort array // to sort array n^2
		int flag = 0;
		for(int y = input[0]; y<input[lenght -1]; y++) {
			if(input[flag] != y) {
				flag++;
			}else {
				//print
			}
		}
		
	/*	
	 	Hashcode 46AD = Confirmed
	    Hashcode 763C = Cancelled
	    {0,0,0,1,1}
	    for(int i; i< length/2; i++){
	    int swap = ; 
	    input[length -i]
	    }
	 	O = { orderID: 1, orderStatus=â€œconfirmedâ€?, â€¦.}
		1 = {orderID: 2, orderStatus=â€œcancelledâ€?, ..}
   - 
		
		
		
	*/	
		

	}

}
