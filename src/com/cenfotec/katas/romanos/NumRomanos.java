package com.cenfotec.katas.romanos;

public class NumRomanos {

	public static String process(int number) {
		String numeroRomano;
		
		 String Unidad[]={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
	      String Decena[]={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
	      String Centena[]={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC"};
	      String Mil[]={"","M","MM","MMM","Mv","v","vM","vMM","vMMM","Mx"};
	      int u= number%10;
	      int d= (number/10)%10;
	      int c= (number/100)%10;
	      int m = (number/1000);
	      
	      if(number>=1000) {
	    	  return numeroRomano = Mil[m] + Centena[c] + Decena[d] + Unidad [u];
	      }else {
	      if(number>=100) {
	    	  return numeroRomano = Centena[c] + Decena[d] + Unidad [u];
	      }else {
	    	  if(number>=10) {
	    		  return numeroRomano = Decena[d] + Unidad [u];  
	    	  }else {
	    		  return numeroRomano = Unidad[u];
	    	  }
	      }
	   }
	}
}
