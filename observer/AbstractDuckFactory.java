package headfirst.designpatterns.combining.observer;

/**
 * Diese abstrakte Klasse AbstractDuck Factory definiert eine Familie von
 * zusammengehörigen Produkten.
 * In diesem Fall sind es die Arten von Enten.
 * 
 * @author Yunus Sari
 * @version 04.06.2016
 * 
 */
 
public abstract class AbstractDuckFactory {
 
	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedheadDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();
}
