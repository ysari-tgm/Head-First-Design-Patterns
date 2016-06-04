package headfirst.designpatterns.combining.observer;

/**
 * Pattern: Factory Pattern
 * 
 * Diese Klasse erbt von der Klasse AbstractDuckFactory.
 * Es werden QuarkCounter Objekte erstellt, um die Anzahl der
 * Quark zu zählen. Dadurch werden die Enten konretisiert und diese
 * Klasse kann die Erstllung der Enten zu ihrem nutzen verwenden,
 * und kann für jede Ente einen Counter erstellen.
 * 
 * @author Yunus Sari
 * @version 04.06.2016
 */
public class CountingDuckFactory extends AbstractDuckFactory {
  
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}
  
	public Quackable createRedheadDuck() {
		return new QuackCounter(new RedheadDuck());
	}
  
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}
   
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}
}
