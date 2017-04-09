package se.bettercode.restaurant;

import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
    String file = parseArgument(args);
    new MenuPrinter(file).print();
  }

  private static String parseArgument(String[] args) {
    return args.length > 0 ? args[0] : "default-menu.xml";
  }

}