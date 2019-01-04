package org.fasttrackit;


public class App 
{
    public static void main( String[] args )
    {

        Amount amount = new Amount();
        System.out.println(amount.summing(5, 20) );

        Difference difference = new Difference();
        System.out.println(difference.subtraction(6, 2));

        Multiplication multiplication = new Multiplication();
        System.out.println(multiplication.increasing(5, 10));

        Division division = new Division();
        System.out.println(division.divide(40, 4));

    }
}
