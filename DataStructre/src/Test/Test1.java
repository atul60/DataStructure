package Test;

import java.text.DecimalFormat;

public class Test1 {
	
	public static String formatInIndianRupee(Double amount1) {
		long amount = amount1.longValue(); 
	    long rem = 0;
	    boolean fComma = false;
	    int count = 0;

	    String formatedNumber;
	    for(formatedNumber = ""; amount != 0.0; ++count) {
	        rem = amount % 10;
	        if (count == 3 && !fComma || count != 1 && count % 2 == 1) {
	            formatedNumber = "," + formatedNumber;
	        }

	        formatedNumber = String.valueOf(rem) + formatedNumber;
	        amount = amount / 10;
	    }
	    formatedNumber += ".";
	    formatedNumber = formatedNumber.concat(String.format("%.2f",amount1).split("[.]")[1]);
	    return formatedNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(Test1.formatInIndianRupee(123663456787654.565677d));

	}

}
