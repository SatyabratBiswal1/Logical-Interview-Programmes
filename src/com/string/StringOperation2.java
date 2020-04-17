package com.string;

public class StringOperation2 {
	String strvar="satya,is,a,good,boy";

	public String getStrvar() {
		return strvar;
	}

	public void setStrvar(String strvar) {
		this.strvar = strvar;
	}
	
	public void split()
	{
		String arr[]=strvar.split(",");
		for(String a:arr)
		{
			System.out.println(a);
		}
			
	}
	public static void main(String args[])
	{
		StringOperation2  e = new StringOperation2();
		e.split();
		//e.setStrvar("satya,is,a,good,boy");
		//System.out.println(e.getStrvar());
		
		
	}

}
