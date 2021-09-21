package com.mohsinkd786.basics;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {

        //
        System.out.println("Welcome to Java");

        char grade = 'z';

        //grade = 'A';

        System.out.println(grade);
        grade++; // increment

        System.out.println(grade);

        // bytes

        byte num1 = 10;
        byte num2 = -100;

        //byte sum = num2 + num1;
        num1++;

        System.out.println(num1);

        short x = 11;
        short y = 12;

        y = num1;

       // short z = x + num1;
        int a = 200;

        // implicit type casting
        // default type casting from smaller to larger storage
        //a = num1;
        //a = x;

        // explicit type casting
        // from large to small storage
        num1 = (byte)a;

        System.out.println(num1);

        float fl1 = 99.212345678f; // 7 decimal places

        System.out.println(fl1);
        double db1 = 98.299977866464;

        System.out.println(db1);


        // conditional statements

        // if else
        num1 = 101;
        y = 14;
        a= -1;

        if(num1 > 100 && (a > 0 || y < 15)){
            System.out.println("NUm1 is greater than 100 ");
        } else if(num1 == 100){
            System.out.println("NUm1 is equal to 100");
        } else{
            System.out.println("NUm1 us lesser than 100");
        }

        // get /read values from command line
        Scanner scanner = new Scanner(System.in);

        int firstValue = scanner.nextInt();
        System.out.println(firstValue);
    }
}

// Assignment : Write a Program to identify if a value is even & is square or multiple of previous value.
//              e.g. first value = 2, then I gave 4 then it should say 4 is a square & multiple of 2
//              e.g. first value = 2, then I gave 6 then it should say 6 is a multiple of 2 = 3s of 2
//              e.g. first value = 2 , then I gave 3 then it should 3 is neither a square nor a multiple of 2

// Assignment : Write a Program to calculate the number of digits of a number.
//              e.g. number  = 100 then it should say 3 & then it should calculate the cube if its a multiple of 3 = result = 3,27
//              e.g. number = 1000 then it should say 4 & then it should calculate the square since 4/2 is remainder = 0 = result = 4,16
//              e.g. number = 10000 then it should say 5 & then it should calculate the square of the nearest smallest even number = 5[4],16
//              e.g. number = 100000 then it should say 6 & then it should calculate the square of 6 = 6,36
//              [Exceptional cases when number is divisible by 2 & 3 ,2 shall have higher precedence over 3]
// NOTE : Incase of values less than 2 return the same value e.g. 8, = result = 1


// Eclipse
// STS
// IntelliJ



// JDK - Java Dev Kit
//  1. Oracle JDK -
//  2. Open JDK -
// JAVA_HOME
// JRE - Java Runtime Environment


// Compile a Java Program : use
//  javac fileName.java

// Run a Java Program: use
// java compiledFileName

// Entry Points to Run a Program in Java
// Servlet - web based applications
// Main Method - for desktop / console based applications


// Types of Language

// 1. Statically typed : C / C++ / Java / C#
// 2. Dynamically typed : Ruby / Python / Php


// Data types:

// 1. Primitive :

/*
*   Char:
*       char:
*   Integer:
*       byte: -128 - 127 - 1 byte
*       short: -32768 - 32767 - 2 bytes
*       int:  -2,147,4xx,6xx - 2,147,4xx,6xx  - 4 bytes
*       long: 8 bytes
*   Float:
*       float: 4 bytes
*       double: 8 bytes
*   Boolean:
*      boolean:
*
* */
// 2. Non Primitive:
/*
*   1. Strings:
*   2. Objects
*   3. Arrays:
*
*
* */
