package Observer_Pattern;

import java.util.LinkedList;
import java.util.List;

public class Livestreamer implements Subject {
    List<Observer> observers = new LinkedList<Observer>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendUpdate(Update update) {
        for (Observer observer : observers) {   // I'm starting to question my varible naming scheme here.
            observer.receiveUpdate(update);
        }
    }

    public void acceptUpdate(Update update) {
        sendUpdate(update);
    }
    
}
