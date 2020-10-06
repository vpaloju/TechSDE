package interviewquestions;

public class Singleton {
    static Singleton singleTon = null;
    String s = null;

    private Singleton() {
        s = "Some value";
    }

    //To make Thread safe.
    synchronized public static Singleton getInstance() {
        if (singleTon == null) {
            singleTon = new Singleton();
        }
        return singleTon;
    }

    //Using inner class.
    private static class BillPughSingleton {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstanceBillPugh() {
        return BillPughSingleton.INSTANCE;
    }
}
