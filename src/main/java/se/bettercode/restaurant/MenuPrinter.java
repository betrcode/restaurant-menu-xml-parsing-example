package se.bettercode.restaurant;

import se.bettercode.restaurant.model.BreakfastMenu;
import se.bettercode.restaurant.model.Food;

import java.io.IOException;

public class MenuPrinter {

  public void print() throws IOException {
    final String xml = new XmlFileLoader().loadFileAsString("menu.xml");
    final BreakfastMenu breakfastMenu = new BreakfastMenuMaker().fromXmlString(xml);
    printMenu(breakfastMenu);
  }

  private void printMenu(BreakfastMenu breakfastMenu) {
    for (Food food : breakfastMenu.getFoods()) {
      System.out.println(food.toString());
    }
  }

}
