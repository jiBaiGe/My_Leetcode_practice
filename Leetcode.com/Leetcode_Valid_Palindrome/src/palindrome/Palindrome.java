package palindrome;

public class Palindrome {
	
	  public static boolean isPunctuation (char i ) {
		  String s = ",.?':!;";
		  for(int k = 0 ;k < s.length();k++) {
			  if(s.charAt(k) == i) {return true;}
		  }
		  return false;
	  }
	
	  //�ж�һ�������Ƿ�Ϊ���ģ����ӱ��
	  public static boolean isPalindrome(String s) {
		  if(s .equals("")) {return true;}
	        StringBuilder mys = new StringBuilder();
	        mys.append(s);
	        for(int i = 0; i < mys.length(); i++) {
	        	if (isPunctuation(mys.charAt(i))) {// ����Ϊ���ӱ�㣬����ɾ�����������б�㡣
	        		mys.deleteCharAt(i--);   //��Ϊɾ�������ַ����±귢���仯������ɾ����i--��      		
	        	}
	          }
	        	String sss = mys.toString();
	        	String ss = mys.reverse().toString();
	        	
	        		if(ss.equals(sss)) {
	        			return true;
	        	}
	        return false;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringBuilder mys = new StringBuilder("abc");
//        
//        for(int i = 0; i < mys.length(); i++) {
//        	if (isPunctuation(mys.charAt(i))) {// ����Ϊ���ӱ�㣬����ɾ�����������б�㡣
//        		mys.deleteCharAt(i--);   //��Ϊɾ�������ַ����±귢���仯������ɾ����i--��
//        		
//        	}
//          }
//        System.out.println(mys.reverse());
		
		System.out.println(isPalindrome("ab"));
	}

}
