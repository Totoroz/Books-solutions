/*Unit conversion. Write a unit conversion program that asks the users from which
 unit they want to convert (fl. oz, gal, oz, lb, in, ft, mi) and to which unit they want to
 convert (ml, l, g, kg, mm, cm, m, km). Reject incompatible conversions (such as gal
 → km). Ask for the value to be converted, then display the result:
     Convert from? gal
     Convert to? ml
     Value? 2.5
     2.5 gal = 9463.5 ml
*/

import java.util.Scanner;

public class P3_24 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	final double FLUID_OUNCE_TO_LITER = 0.029586;
	final double GALLON_TO_LITER = 3.758;
	final double OUNCE_TO_GRAM = 28.3495;
	final double POUND_TO_GRAM = 453.6;
	final double INCH_TO_METER = 0.00254;
	final double FOOT_TO_METER = 0.305;
	final double MILE_TO_METER = 1609.0;
	System.out.print("Convert from? (fl.oz, gal, oz, lb, in, ft, mi) ");
	String convert_from = input.next();
	System.out.print("Convert to? (ml, l, g, kg, mm, cm, m, km) ");
	String convert_to = input.next();
	System.out.print("Value: ");
	double value = input.nextDouble();
	input.close();
	
	double c_factor = 0.0;
	
	if (convert_from.equals("fl.oz")) {
	    if (convert_to.equals("ml")) {
		c_factor = FLUID_OUNCE_TO_LITER * 1000;
	    }
	    else if (convert_to.equals("l")) {
		c_factor = FLUID_OUNCE_TO_LITER;
	    }
	}
	else if (convert_from.equals("gal")) {
	    if (convert_to.equals("ml")) {
		c_factor = GALLON_TO_LITER * 1000;
	    }
	    else if (convert_to.equals("l")) {
		c_factor = GALLON_TO_LITER;
	    }
	}
	else if (convert_from.equals("oz")) {
	    if (convert_to.equals("g")) {
		c_factor = OUNCE_TO_GRAM;
	    }
	    else if (convert_to.equals("kg")) {
		c_factor = OUNCE_TO_GRAM / 1000;
	    }
	}
	else if (convert_from.equals("lb")) {
	    if (convert_to.equals("g")) {
		c_factor = POUND_TO_GRAM;
	    }
	    else if (convert_to.equals("kg")){
		c_factor = POUND_TO_GRAM / 1000;
	    }
	}
	else if (convert_from.equals("in")) {
	    if (convert_to.equals("mm")) {
		c_factor = INCH_TO_METER * 1000;
	    }
	    else if (convert_to.equals("cm")) {
		c_factor = INCH_TO_METER * 100;
	    }
	    else if (convert_to.equals("m")) {
		c_factor = INCH_TO_METER;
	    }
	    else if (convert_to.equals("km")) {
		c_factor = INCH_TO_METER / 1000;
	    }
	}
	else if (convert_from.equals("ft")) {
	    if (convert_to.equals("mm")) {
		c_factor = FOOT_TO_METER * 1000;
	    }
	    else if (convert_to.equals("cm")) {
		c_factor = FOOT_TO_METER * 100;
	    }
	    else if (convert_to.equals("m")) {
		c_factor = FOOT_TO_METER;
	    }
	    else if (convert_to.equals("km")) {
		c_factor = FOOT_TO_METER / 1000;
	    }
	}
	else if (convert_from.equals("ml")) {
	    if (convert_to.equals("mm")) {
		c_factor = MILE_TO_METER * 1000;
	    }
	    else if (convert_to.equals("cm")) {
		c_factor = MILE_TO_METER * 100;
	    }
	    else if (convert_to.equals("m")) {
		c_factor = MILE_TO_METER;
	    }
	    else if (convert_to.equals("km")) {
		c_factor = MILE_TO_METER / 1000;
	    }
	}
	
	if (c_factor == 0.0) {
	    System.out.println("Conversion is unavailable.");
	}
	else {
	    double converted = value * c_factor;
	    System.out.printf("%.4f %s = %.4f %s", value, convert_from, converted, convert_to);
	}
    }
}
