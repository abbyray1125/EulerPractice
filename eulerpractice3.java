import java.util.ArrayList;
public class eulerpractice3{
	public static void main(String args[]){

	
		
		System.out.println(largepfact(13195.0));

		//600,851,475,143

	}

	// find largest prime factor
	public static double largepfact(double num){
		ArrayList<Double> factors=new ArrayList<Double>();
		for (double i=2;i<Math.sqrt(num);i++){
			if(isprime(i)=true){
				if(num%i==0){
					factors.add(i);
				}
			}
		}
		double max=2;
		for(int i=0;i<factors.size();i++){
			if(factors.get(i)>max){
				max=factors.get(i);
			}
		}
		return max;
	}

//checks if number is prime
	public static boolean isprime(double x){
		boolean isprime=true;
		for (double i=2;i<Math.sqrt(num);i++){
			if (x%i==0){
				isprime=false;
			}
		}	
		return isprime;
	}


}