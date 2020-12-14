package interviewquestions.serviceNow;

import java.io.*;

public class CountNumberOfLines {

  public static int countNumberOfLines(String fileName) {
    int numberOfLinesCount = 0;
    String line = null;
    try {
      FileInputStream fileStream = new FileInputStream(new File(fileName));
      InputStreamReader input = new InputStreamReader(fileStream);
      BufferedReader reader = new BufferedReader(input);

      while ((line = reader.readLine()) != null) {
        if (line.length() > 10) {
          numberOfLinesCount++;
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return numberOfLinesCount;
  }
}
