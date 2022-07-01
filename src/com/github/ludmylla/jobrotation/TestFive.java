package com.github.ludmylla.jobrotation;

public class TestFive {

	public static void main(String[] args) {
		 String word = "Hi Anna, she is your sister?";
         String result=""; 

         for(int x = word.length() -1;x>=0;x--){
             result = result + word.charAt(x);
         }
         System.out.println(result);
	}

}