package observerPattern;

public class Main {

  public static void main(String[] args) {
    Data data = new Data();

    data.setMessage("new message arrived");

    Student student = new Student(data);

    //data.addObserver(student);

    data.notifyobserver();

    data.removeObserver(student);

    data.notifyobserver();

    data.registerObserver(student);

    data.notifyobserver();

  }

}
