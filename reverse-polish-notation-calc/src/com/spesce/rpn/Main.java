package com.spesce.rpn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("RPN Calc");
        System.out.println("Type '.exit' at any time to quit");
        String inp = "";
        Scanner inpScan = new Scanner(System.in);

        while(inp != ".exit")
        {
            System.out.println("Input a RPN expression");
            System.out.print("-> ");
            inp = inpScan.nextLine();
            try{
                System.out.println(RPN.evaluate(inp));
            } catch(Exception e)
            {
                System.out.println("Invalid Expression, Try again or type '.exit' to quit");
            }

        }
    }
}
