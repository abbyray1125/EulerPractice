import java.util.ArrayList;
public class eulerpractice7{
	public static void main(String args[]){

	
		
		System.out.println(String.format("%,d",numprime(10001)));

		//600,851,475,143

	}

// tells you teh indexth prime 
	public static int numprime(int index){
		int count=0;
		int i=1;
		while (count<index){
			i++;
			if (isprime(i)==true){
				count++;
			}
		}
		return i;
	}

//checks if number is prime
	public static boolean isprime(int x){
		boolean isprime=true;
		for (int i=2;i<Math.sqrt(x);i++){
			if (x%i==0){
				isprime=false;
			}
		}	
		return isprime;
	}


}