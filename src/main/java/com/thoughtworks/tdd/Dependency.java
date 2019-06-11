package com.thoughtworks.tdd;

public class Dependency {

    public String say(){
        return "Leave me alone.";
    }

    public String fizzBuzzResult(){
        String re = "";
        for( int i = 0; i < 120; i++) {
            String result = fizzBuzz(i+1);
            re += result+"\n";
        }
        return re;
    }

    public static String fizzBuzz(int i) {
    String result = "";
        if (i % 3 == 0){
        result += "Fizz";
        }
        if (i % 5 == 0) {
        result += "Buzz";
        }
        if (i % 7 == 0) {
        result += "Whizz";
        }
        if (result.length() == 0) {
        result = String.valueOf(i);
        }
        return result;
    }

}