/*
Program to find the power
@author Vishal Rathi
JAVA ASSIGNMENT
*/

import java.util.Scanner;

public class MyCalculator{
    public long power(int a,int b) throws MyCalculatorException  //Power function
    {
        if(a<0 & b<0)
        {
            throw new MyCalculatorException("n and p can not be negative");
        }
        else if(a==0&b==0)
        {
            throw new MyCalculatorException("n and p should not be zero");
        }
       else
        {
            return(long) Math.pow(a,b);
        }

    }
    public static void main(String args[]) throws Exception   //Main Function

    {   int i;
        int j;
        Scanner input=new Scanner(System.in); 
        MyCalculator a=new MyCalculator();
        System.out.println("Enter Two values n and p");
        i =input.nextInt();   //First input from user
        j=input.nextInt();    //Secound input from user
        long x=a.power(i,j);
        System.out.println("Output is "+x);
        



    }
}