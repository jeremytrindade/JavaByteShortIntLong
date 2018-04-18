package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        /* First Part
        // Int has a width of 32
        int myMinValue= -2_147_483_648;
        int myMaxValue= 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        // byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        //short has a width of 16
        short myShortValue = -32768;
        short myShortValue = 32767;
        short myNewShortValue = (short) (myShortValue/2);

        // lon has a width of 64
        long myLongValue = -9_223_372_036_854_775_808L;
        long myLongValue = 9_223_372_036_854_775_807L;
        */

        //1. Create a byte variable and set it to any valid byte number.
        //2. Create a short variable and set it to any valid short number.
        //3. Create a int variable and set it to any valid int number.
        //4. Create a variable of type long, and make it equal to
        //   50000 + 10 times the sun of byte, plus the short plus the int

        byte myByteValue2 = 10;

        short myShortValue2 = 20;

        int myIntValue2 = 50;

        long myLastValue = 50000 + (myIntValue2 + myShortValue2 + myByteValue2) * 10;
        short shortTotal = (short) (1000 + 10 * (myIntValue2 + myShortValue2 + myByteValue2));

        System.out.println("myLastValue is: " + myLastValue);
        System.out.println("shortTotal is: " + shortTotal);
    }
}
