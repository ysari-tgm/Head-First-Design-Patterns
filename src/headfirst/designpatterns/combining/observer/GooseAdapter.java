package headfirst.designpatterns.combining.observer;

/**
 * Pattern: Adapter Pattern
 * 
 * Falls bei einer Klasse die Schnittstelle nicht der benötigten
 * Schnittstelle entspricht wird Adapter Pattern verwendet.
 * In diesem Fall wird aus einer Ente eine Gans.
 * 
 * @author Yunus Sari
 * @version 04.06.2016
 */
public class GooseAdapter implements Quackable {
	Goose goose;
	Observable observable;

	public GooseAdapter(Goose goose) {
		this.goose = goose;
		observable = new Observable(this);
	}
 
	public void quack() {
		goose.honk();
		notifyObservers();
	}

	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}

	public String toString() {
		return "Goose pretending to be a Duck";
	}
}
