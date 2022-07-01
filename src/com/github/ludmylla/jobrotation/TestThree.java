package com.github.ludmylla.jobrotation;

public class TestThree {
	
	public static void main(String[] args) {
		
		TestThree testThree = new TestThree();
		// execute um de cada vez
		
		testThree.sequenceA();
		//testThree.sequenceB();
		//testThree.sequenceC();
		//testThree.sequenceD();
		//testThree.sequenceE();
		
	}
	
	private void sequenceA() {
	
		int [] number = new int[30];
		number[0] = 1;
		int cont = 2;
		
		int maxNumber = 30;
		
		for ( int i = 0; i <maxNumber; i = i + cont) {
		
			System.out.println(number[0] + i);
		}
	}
		
	
	private void sequenceB() {
		int [] number = new int[128];
		number[0] = 2;

		int maxNumber = 128;
		
		for ( int i = 2; i <=maxNumber; i+=i) {
		
			System.out.println(i);
		}
	}
	
	private void sequenceC() {
		for(int i = 0; i<=10; i++) {
			int sequence = i*i;
			System.out.println(sequence);
		}
	}
	
	private void sequenceD() {
		for (int i = 0; i < 20; i += 2) {
			int result = i * i ;
		    System.out.println (result );
		}
	}
	
	private void sequenceE() {
		
		int n1 = 0;
		int n2 = 1;
		
		for(int i = 0; i<13; i++) {
			n1 = n1 +n2;
			n2 = n1 - n2;
			System.out.println(n1);
		}
	}
	
	
	 //F) 2,10, 12, 16, 17, 18, 19, - 200, cada indice tem a letra D 
	// o duzentos é o ultimo que tem a letra D no inicio.
	

}
