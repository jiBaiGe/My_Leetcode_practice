package leetcode_Valid_Parentheses;

public class valid {
	 public static boolean isValid(String s) {
		 
		 boolean flag = true;
		 
		 if (s.length()%2 == 0){
		 
		 for (int i = 0 ; i < s.length();i++){
			 char a = s.charAt(i);
					 if (a == '}' || a == ')' || a == ']'){
						 if(i == 0){flag = false;break;};
						char b = s.charAt(i-1);
						switch (a) {
						case '}':
							if (b != '{'){flag = false;};
							break;
						case ')':
							if (b != '('){flag = false;};
							break;
						case ']':
							if (b != '['){flag = false;};
							break;
							default:flag = false;
						}
						if (flag == true){						
						s = s.substring(0, i-1) + s.substring(i+1);
						i = 0;
						}else break;
					 }
					 if(s.length() == 0  ){break;}
					 if( i == s.length() - 1){flag = false;break;}
		 }
		 }else flag = false;
	        return flag;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isValid("[[]"));
	    
	}

}
