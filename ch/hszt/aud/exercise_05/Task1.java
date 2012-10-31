package ch.hszt.aud.exercise_05;

public abstract class Task1 {

	/**
	 * Implementiere eine Klasse gem�ss der abstracten class Task1. Benutze keine
	 * Listen oder andere bereits in den Libraries vorhandene Datenstrukturen
	 * sondern den hier vordefinierten Stack. Die Methode toString() soll eine
	 * lesbare Liste der noch vorhandenen Gegenst�nde auflisten.
	 */

	/**
	 * Benutze diesen Stack in deiner Klasse.
	 */
	public final int SIZE = 15;
	public String[] STACK = new String[SIZE];

	/**
	 * @param data
	 *            Gegenstand, welcher dem Stack hinzugef�gt wird.
	 * @throws NullPointerException
	 *             falls data null
	 */
	public abstract void push(String data) throws NullPointerException;

	/**
	 * @return Gegenstand als String
	 * @throws NullPointerException. if stack is empty
	 */
	public abstract String pop() throws NullPointerException;

	/**
	 * @return true, falls Liste leer.
	 */
	public abstract boolean isEmpty();

	/**
	 * @return true, falls Stack voll. Frage: Z.B. auch bei einer Doubly Linked
	 *         List sinnvoll?
     *
     *         Nein, es kann ja wieder von vorne losgehen.
	 */
	public abstract boolean isFull();

	/**
	 * @return Lesbare Liste der �briggebliebenen Gegenst�nde.
	 */
	public abstract String toString();

}
