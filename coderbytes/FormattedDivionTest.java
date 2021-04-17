package coderbytes;

import java.util.*; 
import java.io.*;
import java.text.*;

class FormattedDivisionTest {

   public static String FormattedDivision(int num1, int num2) { 
    DecimalFormat df = new DecimalFormat( "#,###,###,##0.0000" );
    return df.format((double)num1/(double)num2);
    
  } 

  public static void main (String[] args) {  
	    System.out.println(FormattedDivision(12345678, 10000)); 
	    System.out.println(FormattedDivision(2, 3)); 
	    System.out.println(FormattedDivision(10, 10)); 
	    System.out.println(FormattedDivision(46, 22)); 
  }

}
