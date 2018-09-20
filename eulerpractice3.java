import java.util.ArrayList;
public class eulerpractice3{
	public static void main(String args[]){

	
		
		System.out.println(String.format("%,d",largepfact(13195)));

		//600,851,475,143

	}

	// find largest prime factor
	public static double largepfact(double num){
		ArrayList<Double> factors=new ArrayList<Double>();
		for (double i=2;i<Math.sqrt(num);i++){
			if(num%i==0){
				factors.add(i);
				largepfact(num/i);
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


}