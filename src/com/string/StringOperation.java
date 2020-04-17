package com.string;

public class StringOperation {
	String strvar="chagul";

	public String getStrvar() {
		return strvar;
	}

	public void setStrvar(String strvar) {
		this.strvar = strvar;
	}
	public void Reversebuffer()
	{
		
         StringBuffer sb = new StringBuffer(strvar);
        
        System.out.println("Reversed string with String Builderis::" +sb.reverse());
	}
	public void Reversewtobuffer()
	{
		String reverse="";
		 for(int i = strvar.length() - 1; i >= 0; i--)
	        
	            reverse+= strvar.charAt(i);
	            System.out.println("reverse string WTO Buffer::" +reverse);
	        
	}
	public static void main(String args[])
	{
		StringOperation s= new StringOperation();
		s.Reversebuffer();
		StringOperation s1= new StringOperation();
		s1.Reversewtobuffer();
		
	}


}
