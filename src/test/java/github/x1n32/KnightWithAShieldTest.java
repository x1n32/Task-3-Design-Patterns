package github.x1n32;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

import org.junit.Before;
import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


public class KnightWithAShieldTest {
    
	static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	static LocalDateTime now = LocalDateTime.now();  
	static String fileReport = "==================\n" + dtf.format(now)  + " \n";
	static int beforeFileLength = fileReport.length();


    @Before
    public static void fileCreation(){
      
        try {
          File myObj = new File("reportingErrors.txt");
          if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());
            } else {
              System.out.println("File already exists.");
            }
      
        } catch (IOException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }
    }


  @AfterAll
  public static void file(){

    
      try {

          FileWriter Writer = new FileWriter("reportingErrors.txt",true);
          Writer.write(fileReport);
          if (beforeFileLength == fileReport.length()){
              Writer.write("All Tasks Complete and Working! Congratulations!\n");
          }
          
          Writer.close();
          System.out.println("Successfully written.");
          System.out.println(fileReport.length());

      }
      catch (IOException e) {
          System.out.println("An error has occurred.");
          e.printStackTrace();
      }

  }
}
