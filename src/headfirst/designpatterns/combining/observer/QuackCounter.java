package headfirst.designpatterns.combining.observer;

/**
 * Pattern: Observer Pattern, Factory Pattern
 * 
 * Durch die "Zusammenarbeit" von Observer Pattern und Factory Pattern
 * wird dieser Klasse ermöglicht die Anzahl der Quacks, die von den
 * Enten kommen, zu zählen. 
 * 
 * @author Yunus Sari
 * @version 05.06.2016
 */
public class QuackCounter implements Quackable {
	Quackable duck;
	static int numberOfQuacks;
  
	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}
  
	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}
 
	public static int getQuacks() {
		return numberOfQuacks;
	}
 
	public void registerObserver(Observer observer) {
		duck.registerObserver(observer);
	}
 
	public void notifyObservers() {
		duck.notifyObservers();
	}
   
	public String toString() {
		return duck.toString();
	}
}
