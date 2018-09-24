import java.util.ArrayList;
public class eulerpractice7{
	public static void main(String args[]){

	
		
		System.out.println(String.format("%,d",numprime(2000000)));

		//600,851,475,143

	}

// tells you teh indexth prime 
	public static int numprime(int index){
		int count=0;
		int i=1;
		while (i<index){
			if (isPrime(i)==true){
				count++;
			}
			i++;
		}
		return count;
	}


	 public static boolean isPrime(int n) {
        if (n < 2) return false;
        else if (n == 2) return true;
        for (int i = 2; i < Math.pow(n, 0.5) + 1; i++)
            if (n % i == 0)
                return false;
        return true;
    }



}