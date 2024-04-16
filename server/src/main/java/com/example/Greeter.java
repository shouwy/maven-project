package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* this is a Class
*/

public class Greeter {

    private static Logger logger = LoggerFactory.getLogger(Greeter.class);
  /**
  * this in contructor
  */
 
  public Greeter() {
      logger.info("Initialisation Greeter");
  }

 /**
 * @param someone name of a person
 * @return greeting string
 */
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
   
 }
}
