import java.util.ArrayList;
public class eulerpractice6{
	public static void main(String args[]){

		
		System.out.println(sumofsquares(1,100)-squareofsum(1,100));


	}
	public static int sumofsquares(int lower, int upper){
		int toret=0;
		for (int i=lower;i<=upper;i++){
			toret+=(int)(Math.pow(i,2));
		}
		return toret;
	}
	public static int squareofsum(int lower, int upper){
		int toret=0;
		for (int i=lower;i<=upper;i++){
			toret+=i;
		}
		return (int)(Math.pow(toret,2));
	}
}

