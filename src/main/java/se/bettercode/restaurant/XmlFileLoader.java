package se.bettercode.restaurant;

import java.io.InputStream;

public class XmlFileLoader {

  public static InputStream loadFile(String path) {
    return ClassLoader.getSystemResourceAsStream(path);
  }


}
