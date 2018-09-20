import java.util.ArrayList;
public class eulerpractice2{
	public static void main(String args[]){

	
		ArrayList<Integer> list=new ArrayList<Integer> ();
		list.add(1);
		list.add(2);
		System.out.println(list);
		System.out.println(String.format("%,d",getfibb(4000000,list)));



	}

	// takes in a upper bound and a toret and adds even fibbanaccci numbers below it

	public static int getfibb(int upperbound, ArrayList<Integer> fibbnums){
		int toret=2;
		for(int i=2;fibbnums.get(i-2)+fibbnums.get(i-1)<upperbound;i++){
			int first=fibbnums.get(i-2);
			int sec= fibbnums.get(i-1);
			fibbnums.add(first+sec);
			if((first+sec)%2==0){
				toret+=first+sec;
			}
		}
		return toret;
	}

	

}