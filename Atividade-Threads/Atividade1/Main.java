package threads;

public class Main {
  public static void main(String args[]){
      (new Thread(new ExThread())).start();
  }
}
