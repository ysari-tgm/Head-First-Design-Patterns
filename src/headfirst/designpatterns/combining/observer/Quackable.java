package headfirst.designpatterns.combining.observer;

/**
 * Pattern: Obeserver Pattern
 * 
 * Diese Klasse implementiert das �bergeordnete Interface Quackable
 * Objekte (Art der Ente) benutzen diese Klasse, bei einem Quacken
 * die Information weiterzuleiten.
 * 
 * Hier fehlt die Methode removeObserver(), was auch n�tzlich sein k�nnte,
 * wenn dies dabei w�re.
 * 
 * @author Yunus Sari
 * @version 04.06.2016
 */
public interface Quackable extends QuackObservable {
	public void quack();
}
