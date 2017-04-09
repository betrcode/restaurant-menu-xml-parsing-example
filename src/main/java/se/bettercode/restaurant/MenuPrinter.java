package se.bettercode.restaurant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import se.bettercode.restaurant.model.BreakfastMenu;
import se.bettercode.restaurant.model.Food;

import java.io.IOException;

@AllArgsConstructor
public class MenuPrinter {

  @Getter
  private String file;

  public void print() throws IOException {
    final String xml = new XmlFileLoader().loadFileAsString(getFile());
    final BreakfastMenu breakfastMenu = new BreakfastMenuMaker().fromXmlString(xml);
    printMenu(breakfastMenu);
  }

  private void printMenu(BreakfastMenu breakfastMenu) {
    for (Food food : breakfastMenu.getFoods()) {
      System.out.println(food.toString());
    }
  }

}
