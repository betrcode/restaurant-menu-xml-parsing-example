package se.bettercode.restaurant;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import se.bettercode.restaurant.model.BreakfastMenu;

import java.io.IOException;

public class BreakfastMenuMaker {

  public BreakfastMenu fromXmlString(String xml) throws IOException {
    final ObjectMapper mapper = new XmlMapper();
    return mapper.readValue(xml, BreakfastMenu.class);
  }

}
