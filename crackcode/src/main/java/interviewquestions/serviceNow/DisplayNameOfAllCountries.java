package interviewquestions.serviceNow;

import java.util.Locale;

public class DisplayNameOfAllCountries {

  public static void displayAllCountryNames() {
    String[] countryNames = Locale.getISOCountries();
    for (String country : countryNames) {
      Locale countryLocale = new Locale("", country);
      System.out.println("Country Code: " + countryLocale.getCountry() + " Country Name is: " + countryLocale.getDisplayCountry());
    }
  }

  public static void main(String[] args) {
    displayAllCountryNames();
  }

}
