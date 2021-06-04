package org.example;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;



public class App 
{
    public static void main( String[] args )
    {
        String state;
        BigDecimal orderAmount, subtotal, total, totalTax;
        BigDecimal tax = BigDecimal.valueOf(0);
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        Scanner input = new Scanner(System.in);
        System.out.println("What is the order amount? ");
        orderAmount = input.nextBigDecimal();
        System.out.println("What is the state? ");
        state = input.next();
        if(state.equals("WI"));
            tax = BigDecimal.valueOf(0.055);
        subtotal = orderAmount.setScale(2, RoundingMode.HALF_UP);;
        totalTax = subtotal.multiply(tax).setScale(2, RoundingMode.HALF_UP);;
        total  = subtotal.add(totalTax).setScale(2, RoundingMode.HALF_UP);
        System.out.println("The subtotal is "
                + formatter.format(subtotal)
                + " \nThe tax is " + formatter.format(totalTax)
                + "\nThe total is " + formatter.format(total));

    }
}
