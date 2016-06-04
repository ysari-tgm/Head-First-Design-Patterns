package headfirst.designpatterns.combining.observer;

/**
 * Pattern: Obeserver Pattern
 * 
 * Quacoligst ist eine Observer.
 * Dies sieht man, dass Obserer implementiert worden ist,
 * und/oder, dass die Methode update() überschrieben worden ist.
 * Bei Änderungen wird der Quackologist informiert und muss deswegen
 * nicht jedes Mal Observer fragen, ob die Informationen, dem neusten
 * Stand entsprechen.
 * 
 * @author Yunus Sari
 * @version 04.06.2016
 */

public class Quackologist implements Observer {
 
	public void update(QuackObservable duck) {
		System.out.println("Quackologist: " + duck + " just quacked.");
	}
 
	public String toString() {
		return "Quackologist";
	}
}
