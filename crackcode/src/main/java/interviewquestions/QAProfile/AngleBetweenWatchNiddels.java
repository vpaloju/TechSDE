package interviewquestions.QAProfile;

public class AngleBetweenWatchNiddels {

    static double angleBetweenNiddles(int hour, int min){
            double hourHandAnglePerHour = 360/12;
            double minuteHandanglePerMinute = 360/60;
            double hourHandleAnglePerMinute = min*(0.5);//30/60.
            return Math.abs((hour*hourHandAnglePerHour+hourHandleAnglePerMinute)-min*minuteHandanglePerMinute);
    }

    public static void main(String[] args) {
        System.out.println(angleBetweenNiddles(3,15));
    }
}
