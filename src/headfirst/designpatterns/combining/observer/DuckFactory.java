package headfirst.designpatterns.combining.observer;

/**
 * Pattern: Factory Pattern
 * 
 * Diese Klasse erbt von der Klasse AbstractDuckFactory.
 * Es werden QuarkCounter Objekte erstellt, um die Anzahl der
 * Quark zu zählen. Diese Klasse dient dazu, um die Enten
 * zu konkretisieren. So erstellt die DuckFactory normale Enten,
 * jedoch die CountingDuckFactory Quarkcounter, um die Anzahl der
 * Quarks zu zählen.
 * 
 * @author Yunus Sari
 * @version 04.06.2016
 */
public class DuckFactory extends AbstractDuckFactory {
  
	public Quackable createMallardDuck() {
		return new MallardDuck();
	}
  
	public Quackable createRedheadDuck() {
		return new RedheadDuck();
	}
  
	public Quackable createDuckCall() {
		return new DuckCall();
	}
   
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}
}
