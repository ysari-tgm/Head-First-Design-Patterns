package headfirst.designpatterns.combining.observer;

/**
 * Pattern: Obeserver Pattern
 * 
 * Dieses interface ist die �berklasse von Quackable und Observable
 * und dient einfach als Layer �ber den "gleichgeordneten"
 * Klassen.
 * 
 * @author Yunus Sari
 * @version 04.06.2016
 */
public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}
