import java.util.ArrayList;
public class eulerpractice4{
	public static void main(String args[]){

	
		System.out.println(largepal());
		


	}

	//find largest palindrome number made form product of 3 digit numbers
	public static int largepal(){
		int curpal=0;
		for (int i=100;i<1000;i++){
			for (int j=100;j<1000;j++){
				int ij=i*j;
				String ijstring=ij+"";
				if(checkPalindrome(ijstring)==true&&ij>curpal){
					curpal=ij;
				}
			}	
		}
		
		return curpal;
	}

	public static boolean checkPalindrome(String s){ 
    	boolean toret=false;
    	String reverse = new StringBuffer(s).reverse().toString(); 
    	if (s.equals(reverse)){
    		toret=true;
    	}
    	return toret;
     } 

}