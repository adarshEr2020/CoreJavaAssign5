package com.corejava;

public class FlipCoin {
    public static void main(String[] args) {
        int Count = 1;
        double result;
        while(Count < 2)
        {

            result = Math.random();

            if(result <= 0.5)

                System.out.println(" Heads.");

            else

                System.out.println(" Tails.");

            Count = Count + 1;

        }

    }
}
