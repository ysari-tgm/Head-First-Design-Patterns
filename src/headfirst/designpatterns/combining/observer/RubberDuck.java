package headfirst.designpatterns.combining.observer;

/**
 * Pattern: Obeserver Pattern
 * 
 * Diese Klasse ist eine "Entenart" und implementiert, die Klasse
 * Quackable.
 * Dies ist ein konkretes Subjekt und diese implementieren immer die Subjekt
 * Klasse. In diesem Fall ist das das Interface Quackable.
 * Zusätzlich zu den register und remove (Hier kein remove) Methoden
 * wird auch die Methode notifyObervers() implementiert, welches
 * genutzt wird, um alle Beobachter (Observer) zu benachrichtigen,
 * wenn der Status geändert wird. In diesem Fall, wenn die Ente quarkt.
 * 
 * @author Yunus Sari
 * @version 04.06.2016
 */
public class RubberDuck implements Quackable {
	Observable observable;

	public RubberDuck() {
		observable = new Observable(this);
	}
 
	public void quack() {
		System.out.println("Squeak");
		notifyObservers();
	}

	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}
  
	public String toString() {
		return "Rubber Duck";
	}
}
