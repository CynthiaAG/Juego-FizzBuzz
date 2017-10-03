package org.ulpgc;

public class FizzBuzz {
    public String fizzBuzz(int num){

        if(num % 15 == 0){ return "FizzBuzz";}
        if(num % 3 == 0){ return "Fizz";}
        if(num % 5 == 0){ return "Buzz";}

        return "" + num;
    }
}
