package interviewquestions.QAProfile;

public class AngleBetweenWatchNiddels {

  static double angleBetweenNiddles(int hour, int min) {
    double hourHandAnglePerHour = 360 / 12;
    double minuteHandanglePerMinute = 360 / 60;
    double hourHandleAnglePerMinute = min * (0.5);//30/60.
    return Math.abs((hour * hourHandAnglePerHour + hourHandleAnglePerMinute) - min * minuteHandanglePerMinute);
  }

  public static double angle(int h, int m) {
    if (h == 0 || m == 0) {
      return -1;
    }
    if (h == 12) {
      h = 0;
    }
    if (m == 60) {
      m = 0;
      h += 1;
    }
    double hourAngle = (h * 60 + m) * 0.5;
    double minAngle = m * 6;
    double betweenAngle = Math.abs(hourAngle - minAngle);
    return Math.min(360 - betweenAngle, betweenAngle);
  }

  static int calcAngle(double h, double m) {
    // validate the input
    if (h < 0 || m < 0 || h > 12 || m > 60)
      System.out.println("Wrong input");

    if (h == 12)
      h = 0;
    if (m == 60) {
      m = 0;
      h += 1;
      if (h > 12)
        h = h - 12;
    }

    // Calculate the angles moved by hour and minute hands
    // with reference to 12:00
    int hour_angle = (int) (0.5 * (h * 60 + m));
    int minute_angle = (int) (6 * m);

    // Find the difference between two angles
    int angle = Math.abs(hour_angle - minute_angle);

    // smaller angle of two possible angles
    angle = Math.min(360 - angle, angle);

    return angle;
  }

  public static void main(String[] args) {
    System.out.println(angleBetweenNiddles(10, 15));
      System.out.println(calcAngle(10, 15));
    System.out.println(angle(10, 15));
  }
}
