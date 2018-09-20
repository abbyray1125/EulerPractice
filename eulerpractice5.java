import java.util.ArrayList;
public class eulerpractice5{
	public static void main(String args[]){

	System.out.println(isdivisible(1,20));
		
		


	}
	public static int isdivisible(int lower, int upper){
		for (int x=2520;x>0;x++){
			for (int i=lower;i<=upper;i++){
				if (x%i!=0){
					break;
				}
				else if (x%i==0&&i==upper){
					return x;
				}
			}
		}
		return 0;
			
	}
}

