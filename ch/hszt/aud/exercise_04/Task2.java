package ch.hszt.aud.exercise_04;

public interface Task2 {

	/**
	 * Interface einer Singly Linked List. Implementieren Sie die
	 * definierten Methoden in Ihrer Klasse.
	 * 
	 * Für die Aufgabe 1.2 können Sie ebenfalls dieses Interface benutzen.
	 * Die zu benutzende Methode ist bereits definiert. Sie müssen Sie nur
	 * noch implementieren. :-)
	 */


	/**
	 * @param data, Wert des neuen Eintrags als String.
	 *            
	 * @return neuer Node.
	 * @throws NullPointerException, falls data null.
	 */
	public ListNode newListNode(String data)
			throws NullPointerException;

	/**
	 * @param node, der Node welcher vorangestellt wird.
	 * @throws NullPointerException, falls Node null.
	 */
	public void prepend(ListNode node) throws NullPointerException;

	/**
	 * @param node, der Node, welcher hinzugefügt wird.
	 * @throws NullPointerException, falls Node null.
	 */
	public void append(ListNode node) throws NullPointerException;

	/**
	 * @param node, der Node, welcher sortiert eingefügt wird.
	 * @throws NullPointerException, falls node null.
	 */
	public void sortedInsert(ListNode node)
			throws NullPointerException;

	/**
	 * @param data, wert des Nodes als String.
	 * @return erster Node, welcher den Wert data enth�lt.
	 * @throws NullPointerException, falls data null.
	 */
	public ListNode firstNodeWith(String data)
			throws NullPointerException;

	/**
	 * @param data, Wert des Nodes als String.
	 * @throws NullPointerException, falls data null.
	 */
	public   void deleteNodeWith(String data)
			throws NullPointerException;

	/**
	 * Löscht alle Nodes.
	 */
	public void deleteAllNodes();

	/**
	 * Schreibt alle enthaltenen Werte der Liste in umgekehrter Reihenfolge auf.
	 * Beispiel, falls Liste = a, b, c, d.
	 * WriteNodesInReverseOrder() ergibt:
	 * d, c, b, a.
	 */
	public String WriteNodesInReverseOrder();

	/**
	 * @return eine lesbare Liste der Werte der Nodes.
	 */
	public String toString();

}
