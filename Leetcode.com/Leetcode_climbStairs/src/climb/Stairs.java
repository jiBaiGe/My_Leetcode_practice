package climb;

public class Stairs {
	
	public static int climbStairs(int n) {
		int sol = 0;
		int n1=1,n2=2;
		if (n == 1) {
			return sol = 1;
		}
		if (n == 2) {
			return sol = 2;
		}
		
		for(int i = 2;i != n;i++) {	
		sol = n1+n2 ;
		n1 =n2;
		n2 =sol; 
		}
     return sol;   
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(climbStairs(1));
	}

}
