package org.fasttrackit;


public class App 
{
    public static void main( String[] args )
    {

        Amount amount = new Amount();
        System.out.println(amount.summing(5, 20) );
        System.out.println(amount.summing(5.0, 20.0) );

        Difference difference = new Difference();
        System.out.println(difference.subtraction(6, 2));
        System.out.println(difference.subtraction(6.0, 2.0));

        Multiplication multiplication = new Multiplication();
        System.out.println(multiplication.increasing(5, 10));
        System.out.println(multiplication.increasing(5.0, 10.0));

        Division division = new Division();
        System.out.println(division.divide(40, 4));
        System.out.println(division.divide(40.0, 4.0));

    }
}
