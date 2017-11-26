package add;

public class addB {
	
	public static String add(String a, String b) {   //determine the rule of addition
		String s = "";
		if (a.equals("1") &&b.equals("1")) {
		s = "0";
		return s;
		}
		if(a.equals("1")&& b.equals("0")) {
			s = "1";return s;
		}
		if(a.equals("0")&& b.equals("0")) {
			s = "0";return s;
		}
		
		if(a.equals("0")&& b.equals("1")) {
				s = "1";return s;
		}
		if(a.equals("")) {
			s = b;return s;
	}
		return s;
	}
	
	  public static String addBinary(String a, String b) {
		  int al = a.length();
		  int bl = b.length();
		  boolean over =false;
		  String fina ="";
		  String dig = "",yu = "";
		  StringBuilder sol = new StringBuilder("");
		  

		  while (al>0 && bl>0) {
				dig =   add(a.substring(al-1,al ),b.substring(bl-1,bl ));
				if (
					(a.substring(al-1,al ).equals("1") && b.substring(bl-1,bl ).equals("1") )
					 ||(yu.equals("1") && dig.equals("1")                                   )
				   ) 
				{over = true;}else over = false;  // if needs to add one on next digit

				dig = add(yu,dig); // if need,add one.
				
				sol.append(dig);
				if (over) {yu = "1";}else yu="";
				al--;bl--;
				
		  }
        //when two binary numbers have different length,execute following.
		  while(al!=0) {
			 dig = add(yu,a.substring(al-1,al));
			 if(yu.equals("1") &&a.substring(al-1,al).equals("1")) {
				 yu = "1";
			 }else yu ="";
			 sol.append(dig);
			 al--;
			 
		  }
		  while(bl!=0) {
			   dig = add(yu,b.substring(bl-1,bl));
			 if(yu.equals("1") && b.substring(bl-1,bl).equals("1")) {
				 yu = "1";
			 }else yu ="";

			 sol.append(dig);
			 bl--;
		  }
		  
		  if (yu.equals("1")) {sol.append(yu);}//add the finally carry addition
		  fina = sol.reverse().toString();
		  return fina;
	    }
	  
	public static void main(String[] args) {  //test
		// TODO Auto-generated method stub
		String a = "1";
		String b = "1111";
		System.out.println( addBinary(a,b));
	}

}
