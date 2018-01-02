package newCode.net;

public class ReOrderArray {
	
	  public void reOrderArray(int [] array) {
	        int [] odd = new int [array.length];
	        int ol = 0;
	        int [] even = new int [array.length];
	        int el = 0;
	        int [] brandNew = array;
	        for (int i = 0; i < array.length; i++) {
	        	if( array[i]%2 == 0 ) {
	        		even[el] = array[i];
	        		el ++;
	        	}else {
	        		odd[ol] = array[i];
	        		ol++;
	        	}
	        }
	        for(int j = 0; j < ol;j++) {
	        	brandNew[j] = odd[j];
	        }
	        for(int k =  0 ; k < el; k++) {
	        	brandNew[ol+k] = even[k];
	        }
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
