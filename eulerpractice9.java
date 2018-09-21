import java.util.ArrayList;
public class eulerpractice9{
	public static void main(String args[]){

	
		System.out.println(abc());

	}
	public static int abc(){
		for (int i=1;i<1000;i++){
			for(int j=1;j<1000;j++){
				for(int k=1;k<1000;k++){
					if((i*i)+(j*j)==(k*k)&&i+j+k==1000){
						return i*j*k;
					}
				}
			}
		}
		return 0;
	}


}