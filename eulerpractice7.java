import java.util.ArrayList;
public class eulerpractice7{
	public static void main(String args[]){

	
		
		System.out.println(String.format("%,f",numprime(10001)));

		//600,851,475,143

	}

// tells you teh indexth prime 
	public static int numprime(int index){
		int count=0;
		int i=2;
		while (count<index){
			if (isprime(i)==true){
				count++;
			}
			i++;
		}
	}

//checks if number is prime
	public static boolean isprime(double x){
		boolean isprime=true;
		for (double i=2;i<Math.sqrt(x);i++){
			if (x%i==0){
				isprime=false;
			}
		}	
		return isprime;
	}


}