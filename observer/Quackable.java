package headfirst.designpatterns.combining.observer;

/**
 * Pattern: Obeserver Pattern
 * 
 * Diese Klasse implementiert das übergeordnete Interface Quackable
 * Objekte (Art der Ente) benutzen diese Klasse, bei einem Quacken
 * die Information weiterzuleiten.
 * 
 * Hier fehlt die Methode removeObserver(), was auch nützlich sein könnte,
 * wenn dies dabei wäre.
 * 
 * @author Yunus Sari
 * @version 04.06.2016
 */
public interface Quackable extends QuackObservable {
	public void quack();
}
