package ch.hszt.aud.exercise_04;

/**
 * Created with IntelliJ IDEA.
 * User: bbu
 * Date: 27.10.12
 * Time: 12:33
 *
 * Es macht meiner Ansicht nach keinen Sinn, ein Interface in ein Interface zu verschachteln.
 * Deswegen habe ich dieses Interface implementiert.
 * Siehe Hardcore Java Kapitel 6, Nested Interfaces
 *
 */
public interface ListNode {
    /**
     * @return nächster Node.
     */
    public ListNode getNext();

    /**
     * @param next, Node, welcher als nächster hinzugefügt wird.
     */
    public void setNext(ListNode next);

    /**
     * @return den Wert des aktuellen Nodes.
     */
    public String getData();

    /**
     * @param data, Wert des aktuellen Nodes.
     *
     * @throws NullPointerException, falls data null.
     */
    public void setData(String data) throws NullPointerException;
}
