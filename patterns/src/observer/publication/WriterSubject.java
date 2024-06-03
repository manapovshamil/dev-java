package observer.publication;

import java.util.ArrayList;
import java.util.List;

public class WriterSubject implements Subject{
    private String newText;
    private List<Observer> observers;
    public WriterSubject() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(newText);
        }
    }

    public void setText(String text) {
        newText = text;
        notifyObservers();
    }
}
