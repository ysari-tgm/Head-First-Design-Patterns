package headfirst.designpatterns.combining.observer;

/**
 * Pattern: Obeserver Pattern
 * 
 * Diese Klasse implementiert das übergeordnete Interface Quackable
 * Objekte (Art der Ente) benutzen diese Klasse, um sich zu registrieren,
 * damit dann später Daten an den Observer gelangen können.
 * 
 * Hier fehlt die Methode removeObserver(), was auch nützlich sein könnte,
 * wenn dies dabei wäre.
 * 
 * @author Yunus Sari
 * @version 04.06.2016
 */
import java.util.Iterator;
import java.util.ArrayList;

public class Observable implements QuackObservable {
	ArrayList<Observer> observers = new ArrayList<Observer>();
	QuackObservable duck;
 
	public Observable(QuackObservable duck) {
		this.duck = duck;
	}
  
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
  
	public void notifyObservers() {
		Iterator<Observer> iterator = observers.iterator();
		while (iterator.hasNext()) {
			Observer observer = iterator.next();
			observer.update(duck);
		}
	}
 
	public Iterator<Observer> getObservers() {
		return observers.iterator();
	}
}
