import java.util.ArrayList;
public class eulerpractice4{
	public static void main(String args[]){

	
		System.out.println(largepal());


	}

	//find largest palindrome number made form product of 3 digit numbers
	public static int largepal(){
		ArrayList<Integer> pals=new ArrayList<Integer> ();
		for (int i=100;i>=100&&i<=999;i++){
			for (int j=100;j>=100&&j<=999;i++){
				int ij=i*j;
				String ijstring=ij+"";
				if (ijstring.length()%2==0){
					String first=ijstring.substring(0,ijstring.length()/2);
					String sec=ijstring.substring(ijstring.length()/2);
					if (first.equals(sec)){
						pals.add(ij);
					}
				}
				else{
					String first=ijstring.substring(0,ijstring.length()/2);
					String sec=ijstring.substring(ijstring.length()/2+1);
					if (first.equals(sec)){
						pals.add(ij);
					}
				}
			}	
		}
		int max=0;
		for (int i=0;i<pals.size();i++){
			if (pals.get(i)>max){
				max=pals.get(i);
			}
		}
		return max;
	}

	

}