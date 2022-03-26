package se.bettercode.restaurant.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Food {

  @JacksonXmlProperty
  private String name;

  @JacksonXmlProperty
  private String price;

  @JacksonXmlProperty
  private String description;

  @JacksonXmlProperty
  private short calories;
}
