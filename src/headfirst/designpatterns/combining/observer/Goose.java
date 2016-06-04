package headfirst.designpatterns.combining.observer;

/**
 * Pattern: Adapter Pattern
 * 
 * Bei der Gans wird nicht wie bei der Ente eine Factory verwendet,
 * sondern diese steht als konkrete Klasse.
 * Diese Klasse wird benötigt, um die Gans, dann als "Ente" bei
 * Obervable zu registrieren.
 * 
 * @author Yunus Sari
 * @version 04.06.2016
 */
public class Goose {

	public void honk() {
		System.out.println("Honk");
	}

	public String toString() {
		return "Goose";
	}
}
