package headfirst.designpatterns.combining.observer;

/**
 * Pattern: Itterator Pattern
 * 
 * Der Itterator Pattern wird daf�r verwendet, um Objekte
 * in eienr Sammlung zusammenzufassen. So werden hier die Enten
 * als eine Herde zusammengefasst.
 * Durch diese Klasse kann sichergestellt werden, dass dies generisch
 * abl�uft, und man keinen R�cksicht mehr auf Implemeniterungsdetails
 * geben muss.
 * 
 * @author Yunus Sari
 * @version 05.06.2016
 */
import java.util.Iterator;
import java.util.ArrayList;

public class Flock implements Quackable {
	ArrayList<Quackable> ducks = new ArrayList<Quackable>();
  
	public void add(Quackable duck) {
		ducks.add(duck);
	}
  
	public void quack() {
		Iterator<Quackable> iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = (Quackable)iterator.next();
			duck.quack();
		}
	}
   
	public void registerObserver(Observer observer) {
		Iterator<Quackable> iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = (Quackable)iterator.next();
			duck.registerObserver(observer);
		}
	}
  
	public void notifyObservers() { }
  
	public String toString() {
		return "Flock of Ducks";
	}
}
