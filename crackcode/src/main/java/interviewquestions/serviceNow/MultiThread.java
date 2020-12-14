package interviewquestions.serviceNow;

public class MultiThread implements Runnable {
  @Override
  public void run() {
    System.out.println("Thread " + Thread.currentThread().getId() + " is Running");
  }

  public static void main(String[] args) {
    for (int i = 0; i < 8; i++) {
      Thread multiThread = new Thread(new MultiThread());
      multiThread.start();
    }
  }
}
