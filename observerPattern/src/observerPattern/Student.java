package observerPattern;

public class Student implements Observer{

  private String message;

  private Data data;

  Student(Data data){
    data.registerObserver(this);
  }

  @Override
  public void updateMessage(String message) {
    this.message = message;
    displayUpdatedMessage();
  }

  public void displayUpdatedMessage() {
    System.out.println(message);
  }

}
