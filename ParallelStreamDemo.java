package Java8.paralleStream;

import java.util.stream.Stream;

public class ParallelStreamDemo1 {
  public static void main(String[] args) {
    System.out.println("===========Normal/Sequential Stream==============");
    Stream<Integer> seqStream = Stream.of(2, 3, 4, 6, 1, 5);
    seqStream.forEach(i -> System.out.println(i + " : " + Thread.currentThread()));

    System.out.println("===========Parallel Stream==============");

    Stream<Integer> parallelStream = Stream.of(2, 3, 4, 6, 1, 5);
    parallelStream.parallel().forEach(i -> System.out.println(i + " - " + Thread.currentThread()));

  }
}
