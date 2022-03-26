package se.bettercode.restaurant;

import org.junit.jupiter.api.Test;
import se.bettercode.restaurant.model.BreakfastMenu;
import se.bettercode.restaurant.model.Food;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;


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
        String xmlAsString = """
                <?xml version='1.0'?>
                <breakfast-menu>
                    <food>
                        <name>Nothing good</name>
                        <price>$1.95</price>
                        <description>Plate full of nothing</description>
                        <calories>00</calories>
                    </food>
                </breakfast-menu>
                """;
        return new ByteArrayInputStream(xmlAsString.getBytes());
    }

}
