package interviewquestions.serviceNow;

public class ConvertTemparature {

  public static void convertTemperature(float temperature, int operation) {
    float convertedTemperature = 0f;
    switch (operation) {
      //F To C
      case 1:
        convertedTemperature = ((temperature - 32) * 5) / 9;
        System.out.println(temperature + " Fahrenheit " + " in Celsius = " + convertedTemperature);
        break;
      //C To F
      case 2:
        convertedTemperature = (9 * temperature / 5) + 32;
        System.out.println(temperature + " Celsius " + " in Fahrenheit = " + convertedTemperature);
        break;
      default:
        System.out.println("Enterd temerature is Invalid");
        break; // optional
    }
  }

  public static void main(String[] args) {
    convertTemperature(100, 1);
    convertTemperature(37.77f, 2);
  }
}
