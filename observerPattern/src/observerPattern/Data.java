package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Data {
  //initialize
  public Data() {
    this.observers = new ArrayList<>();
  }

  private String message;

  private List<Observer> observers;

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public List<Observer> getObservers() {
    return observers;
  }

  public void setObservers(List<Observer> observers) {
    this.observers = observers;
  }

  public void registerObserver(Observer observer) {
    this.observers.add(observer);
  }

  public void removeObserver(Observer observer) {
    this.observers.remove(observer);
  }

  public void notifyobserver() {
    for(Observer observer : observers) {
      observer.updateMessage(message);
    }
  }

}
