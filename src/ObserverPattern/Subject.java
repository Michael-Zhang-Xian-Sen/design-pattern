package ObserverPattern;

import java.util.ArrayList;

public abstract class Subject{
    public ArrayList<Observer> observers = new ArrayList<Observer>();

    public void Attach(Observer observer){
        observers.add(observer);
    }

    public void Detach(Observer observer){
        observers.remove(observer);
    }

    public void notifyObserver(){
        for(Observer observer:observers){
            observer.notifyObserver();
        }
    }
}
