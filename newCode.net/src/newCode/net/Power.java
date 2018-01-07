package newCode.net;

/*
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方
 */

public class Power {
	
	 public double power(double base, int exponent) {
	        double result = base;
	        boolean ispos = false;  //判断幂是否是负的
	        if(exponent < 0){
	            exponent = 0 - exponent;
	            ispos = true;
	        }
	        if(base == 0){
	            return 0;
	        }
	        if (exponent == 0){
	            return 1;
	        }
	        for(int i = 1;i < exponent; i++){
	            result = result*base;
	        }
	        if(ispos){
	            result = 1 / result;
	        }
	        return result;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
