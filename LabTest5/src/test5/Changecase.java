package test5;

public class Changecase {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="HeLlo";///declare string
		StringBuffer nstr=new StringBuffer(str);//create Stringbuffer object
		 for(int i=0;i<str.length();i++)
		 {
			 if(Character.isLowerCase(str.charAt(i)))//check character is lower case
			 {
				 nstr.setCharAt(i, Character.toUpperCase(str.charAt(i)));//convert lower to upper case
			 }
			 else if(Character.isUpperCase(str.charAt(i)))//check chracter is upper case
			 {
				 nstr.setCharAt(i,Character.toLowerCase(str.charAt(i)));//convert upper to lower case
			 }
		 }
       System.out.println(nstr);//print new string
	}

}
