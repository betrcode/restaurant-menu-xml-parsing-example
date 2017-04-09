package se.bettercode.restaurant;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class XmlFileLoader {

  public String loadFileAsString(String path) {
    return loadFile(path)
        .map(String::toString)
        .collect(joining(""));
  }

  public Stream<String> loadFile(String path) {
    return new BufferedReader(new InputStreamReader(ClassLoader.getSystemResourceAsStream(path))).lines();
  }


}
