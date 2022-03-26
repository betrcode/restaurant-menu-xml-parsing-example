package se.bettercode.restaurant;

import org.junit.Test;
import se.bettercode.restaurant.model.BreakfastMenu;
import se.bettercode.restaurant.model.Food;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class BreakfastMenuMakerTest {

    // UUT
    private final BreakfastMenuMaker menuMaker = new BreakfastMenuMaker();

    @Test
    public void fromXml() throws IOException {
        BreakfastMenu expectedBreakfastMenu = new BreakfastMenu();
        expectedBreakfastMenu.setFoods(Collections.singletonList(new Food("Nothing good", "$1.95", "Plate full of nothing", (short) 0)));
        BreakfastMenu breakfastMenu = menuMaker.fromXml(generateInputStream());
        assertEquals(expectedBreakfastMenu, breakfastMenu);
    }

    private InputStream generateInputStream() {
        String xmlAsString = "<?xml version='1.0'?>\n" +
                "<breakfast-menu>\n" +
                "    <food>\n" +
                "        <name>Nothing good</name>\n" +
                "        <price>$1.95</price>\n" +
                "        <description>Plate full of nothing</description>\n" +
                "        <calories>00</calories>\n" +
                "    </food>\n" +
                "</breakfast-menu>";
        return new ByteArrayInputStream(xmlAsString.getBytes());
    }

}
