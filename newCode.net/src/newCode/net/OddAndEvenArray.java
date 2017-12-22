package newCode.net;

public class OddAndEvenArray {
	int []a ;
	OddAndEvenArray(int []a){
		this.a = a;
	}
	
	public  boolean isEven(int x) {
		if(x % 2 ==0) {
			return true;
		}
		else return false;
	}
	
	public  void reOrderArray(int [] array) {
        int [] odd = new int [array.length];
        int ol = 0;
        int [] even = new int [array.length];
        int el = 0;
        int [] brandNew =array;
        for (int i = 0; i < array.length; i++) {
        	if(isEven( array[i]) ) {
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

	public void print() {
		for(int i = 0; i<a.length ; i++) {
		System.out.print(a[i]+"-");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {1,6,3,8,5,10};
		OddAndEvenArray y = new OddAndEvenArray(a);
		
		y.reOrderArray(a);
		y.print();
		
	}

}
