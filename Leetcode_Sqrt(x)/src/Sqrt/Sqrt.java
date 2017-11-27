package Sqrt;

public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Do text = new Do(160000);
			text.mySqrt();
			text.print();
			
	}

}

class Do{
	int num = 0;
	Do(int i ){
		num = i;		
	}
	
	   void mySqrt() {
	        long sol = num;
	        for (;sol*sol > num;sol=sol/2) {}
	        	for(;sol*sol <= num;sol++) {}
	        num = (int)sol-1;
	    }
	  void print() {
		  System.out.println(num);
	  }
}