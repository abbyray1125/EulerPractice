public class eulerpractice1{
	public static void main(String args[]){

		System.out.println(threeand5(1000));







	}

// takes in a number and return the sum of all the multiples of 3 or 5 below it 
	public static int threeand5(int num){
		int toret=0;
		for (int i=0;i<num;i++){
			if (i%3==0||i%5==0){
				toret+=i;
			}

		}
		return toret;
	}
	







}