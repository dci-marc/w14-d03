package org.dcistudent;

import java.util.Optional;

/**
 * The Exercise class contains exercises to practice using Optional.
 */
public class Exercise {
  /**
   * Main method to test the exercises.
   *
   * @param args the command-line arguments
   */
  public static void main(String[] args) {
    Laptop laptopOptional1 =
        new Laptop("SN12345", true, true, null);

    // Exercise 1: Write a lambda using orElseGet() to default the price to $800 if the price is
    // missing.
    // Print the output to confirm the price.
    Optional<Integer> price = laptopOptional1.getPrice();
    Integer defaultPrice = price.orElse(800);
    laptopOptional1.setPrice(Optional.of(defaultPrice));
    System.out.println(laptopOptional1);

    // Exercise 2: Write a method that takes in a Laptop object and returns true if the price is
    // greater than $1200.
    Laptop laptop1 =
        new Laptop("SN001", true, true, 1500);
    Optional<Integer> price1 = laptop1.getPrice();
    boolean isGreaterThan1200 = price1.filter(p -> p > 1200).isPresent();
    System.out.println(isGreaterThan1200);

    // Exercise 3: Call the method that you created in Exercise 2 for the following Laptop
    // objects and print out the output.
    Laptop laptop2 =
        new Laptop("SN002", true, false, 1000);
    System.out.println(Exercise.isGreaterThan1200(laptop2));

    Laptop laptop3 =
        new Laptop("SN003", false, false, 700);
    System.out.println(Exercise.isGreaterThan1200(laptop3));
  }

  /**
   * Returns true if the price of the laptop is greater than $1200.
   *
   * @param laptop the laptop object
   * @return true if the price is greater than $1200
   */
  private static boolean isGreaterThan1200(Laptop laptop) {
    return laptop.getPrice().filter(p -> p > 1200).isPresent();
  }
}
