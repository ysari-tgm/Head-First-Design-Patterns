package headfirst.designpatterns.combining.observer;

/**
 * Pattern: Obeserver Pattern
 * 
 * Das Oberver Interfacee, mit der update Methode.
 * Alle Beobachter (Observer) implementieren.
 * Dieses Interface hat nur eine Methode.
 * Die Methode update wird aufgerufen, wenn sich
 * beim Status des Subjekten etwas ändert.
 * 
 * @author Yunus Sari
 * @version 04.06.2016
 */
public interface Observer {
	public void update(QuackObservable duck);
}
