package com.packt.math;

import java.util.stream.IntStream;
import java.util.function.IntPredicate;

public class MathUtil {
  public MathUtil(){}

  public static Boolean isPrime(Integer num){
    if(num == 1) return false;
    return IntStream.range(2,num).noneMatch(i -> num % i == 0);
  }

  public static Integer sumOfFirstNPrimes(Integer count){
    return computeFirstNSum(count, (i -> isPrime(i)));
  }

  public static Boolean isEven(Integer number){
    return number % 2 == 0;
  }

  public static Integer sumOfFirstNOdds(Integer count){
    return computeFirstNSum(count, (i -> !isEven(i)));
  }

  public static Integer sumOfFirstNEvens(Integer count){
    return computeFirstNSum(count, (i -> isEven(i)));
  }

  private static Integer computeFirstNSum(Integer count, IntPredicate filter){
    return IntStream.iterate(1, i -> i+1)
                    .filter(filter)
                    .limit(count)
                    .sum();
  }
}
