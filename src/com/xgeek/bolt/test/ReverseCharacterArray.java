package com.xgeek.bolt.test;
/**
 * <p>This algorithm reverses the letter of words in sentence like 
 * Example input : I am programmer
 * Example output: I ma remmargorp </p>
 * 
 * @author mubi
 *
 */
public class ReverseCharacterArray {

	public static void main(String[] args) {

				char[] input = {'I',' ','d','r','i','v','e',' ','w','i','t','h',' ','h','o','n','d','a'};
				
				reverseWords(input);
				
				System.out.println("function output:");
				
				for(int i = 0 ;  i<input.length ; i++) {
					System.out.print(input[i]);
				}

	}
	public static char[] reverseWords(char[] input) {
		int inputLenght = input.length;
		int lastIndex = inputLenght;
		int startIndex;
		for(int i = inputLenght-1 ; -1 <i ; i--) {
			if((int)input[i]==32) {
				startIndex = i+1;
				for(int x= 0; x < (lastIndex -startIndex)/2; x++) {
					char swap = input[x+startIndex];
					input[x+startIndex] = input[lastIndex-x-1];
					input[lastIndex-x-1] = swap;
				}
				lastIndex = i;
			}
		}
		return input;
	}

}
