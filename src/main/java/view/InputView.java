package view;

import java.util.Scanner;

public class InputView {

  private static Scanner scanner = new Scanner(System.in);

  public static int inputMoneyAmount() {
    System.out.println("enter amount");
    return scanner.nextInt();
  }
}
