import java.util.ArrayList;
public class eulerpractice9{
	public static void main(String args[]){

	
		SYtem.out.println(abc(1000))

	}
	public static int abc(int d){
		for (int i=0;i<d;i++){
			for(int j=0;j<d;j++){
				for(int k=0;k<d;k++){
					if(i*i+j*j==k*k&&i+j+k==d){
						return i*j*k;
					}
				}
			}
		}
		return 0;
	}


}