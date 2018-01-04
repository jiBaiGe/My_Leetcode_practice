package newCode.net;

public class JumpFloorII {
	
	   public int JumpFloorII(int target) {
	        
	        int sol = 2;
	        
	        if (target == 0){
	            return 0;
	        }
	        if(target == 1){
	            return 1;
	        }
	        if(target == 2){
	           return 2; 
	        }
	        for (int i = 2; i != target; i++){
	            sol = sol * 2;
	            
	        }
	        return sol;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
