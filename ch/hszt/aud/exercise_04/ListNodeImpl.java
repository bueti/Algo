package ch.hszt.aud.exercise_04;

/**
 * Created with IntelliJ IDEA.
 * User: bbu
 * Date: 27.10.12
 * Time: 12:40
 */
public class ListNodeImpl implements ListNode {
    ListNode nextNode;
    String data;

    public ListNodeImpl() {

    }

    @Override
    public ListNode getNext() {
        return nextNode;
    }

    @Override
    public void setNext(ListNode next) {
        nextNode = next;
    }

    @Override
    public String getData() {
        return data;
    }

    @Override
    public void setData(String data) throws NullPointerException {
        this.data = data;
    }
}
