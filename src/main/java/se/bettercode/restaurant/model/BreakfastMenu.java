package se.bettercode.restaurant.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.util.List;

@Data
@JacksonXmlRootElement(localName = "breakfast-menu")
public class BreakfastMenu {
  @JacksonXmlProperty(localName = "food")
  @JacksonXmlElementWrapper(useWrapping = false)
  private List<Food> foods;
}
