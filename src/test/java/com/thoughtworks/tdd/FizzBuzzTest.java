package com.thoughtworks.tdd;

import com.thoughtworks.tdd.Dependency;
import com.thoughtworks.tdd.HelloWorld;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class FizzBuzzTest {

    String result = "1\n" +
            "2\n" +
            "Fizz\n" +
            "4\n" +
            "Buzz\n" +
            "Fizz\n" +
            "Whizz\n" +
            "8\n" +
            "Fizz\n" +
            "Buzz\n" +
            "11\n" +
            "Fizz\n" +
            "13\n" +
            "Whizz\n" +
            "FizzBuzz\n" +
            "16\n" +
            "17\n" +
            "Fizz\n" +
            "19\n" +
            "Buzz\n" +
            "FizzWhizz\n" +
            "22\n" +
            "23\n" +
            "Fizz\n" +
            "Buzz\n" +
            "26\n" +
            "Fizz\n" +
            "Whizz\n" +
            "29\n" +
            "FizzBuzz\n" +
            "31\n" +
            "32\n" +
            "Fizz\n" +
            "34\n" +
            "BuzzWhizz\n" +
            "Fizz\n" +
            "37\n" +
            "38\n" +
            "Fizz\n" +
            "Buzz\n" +
            "41\n" +
            "FizzWhizz\n" +
            "43\n" +
            "44\n" +
            "FizzBuzz\n" +
            "46\n" +
            "47\n" +
            "Fizz\n" +
            "Whizz\n" +
            "Buzz\n" +
            "Fizz\n" +
            "52\n" +
            "53\n" +
            "Fizz\n" +
            "Buzz\n" +
            "Whizz\n" +
            "Fizz\n" +
            "58\n" +
            "59\n" +
            "FizzBuzz\n" +
            "61\n" +
            "62\n" +
            "FizzWhizz\n" +
            "64\n" +
            "Buzz\n" +
            "Fizz\n" +
            "67\n" +
            "68\n" +
            "Fizz\n" +
            "BuzzWhizz\n" +
            "71\n" +
            "Fizz\n" +
            "73\n" +
            "74\n" +
            "FizzBuzz\n" +
            "76\n" +
            "Whizz\n" +
            "Fizz\n" +
            "79\n" +
            "Buzz\n" +
            "Fizz\n" +
            "82\n" +
            "83\n" +
            "FizzWhizz\n" +
            "Buzz\n" +
            "86\n" +
            "Fizz\n" +
            "88\n" +
            "89\n" +
            "FizzBuzz\n" +
            "Whizz\n" +
            "92\n" +
            "Fizz\n" +
            "94\n" +
            "Buzz\n" +
            "Fizz\n" +
            "97\n" +
            "Whizz\n" +
            "Fizz\n" +
            "Buzz\n" +
            "101\n" +
            "Fizz\n" +
            "103\n" +
            "104\n" +
            "FizzBuzzWhizz\n" +
            "106\n" +
            "107\n" +
            "Fizz\n" +
            "109\n" +
            "Buzz\n" +
            "Fizz\n" +
            "Whizz\n" +
            "113\n" +
            "Fizz\n" +
            "Buzz\n" +
            "116\n" +
            "Fizz\n" +
            "118\n" +
            "Whizz\n" +
            "FizzBuzz\n";

    @BeforeAll
    static void initTestEnv() {
    }

    @BeforeEach
    void initEveryMethod() {
    }


    @Test
    @DisplayName("try display name")
    public void fizz_buzz_test() {
        //given
        Dependency dependency = new Dependency();
        FizzBuzz fizzBuzz = new FizzBuzz(dependency);

        //when
        String actual = fizzBuzz.beenCalled();

        //then
        assertThat(actual, is(result));
    }

    @Test
    public void should_be_mocked() {
        //given
        Dependency dependency = mock(Dependency.class);
        when(dependency.fizzBuzzResult()).thenReturn("Fizz Buzz");
        FizzBuzz fizzBuzz = new FizzBuzz(dependency);

        //when
        String actual = fizzBuzz.beenCalled();

        //then
        assertThat(actual, is("Fizz Buzz"));
    }
}
