package ch.hszt.aud.exercise_04;

/**
 * Created with IntelliJ IDEA.
 * User: bbu
 * Date: 24.10.12
 * Time: 20:14
 */
public class Task2Impl_Buetikofer implements Task2 {
    // Instance Variables
    ListNode list;
    ListNode nextNode;
    Task2 singleLinkedList;

    // Constructor
    public Task2Impl_Buetikofer() {
        // Nothing to do here
    }

    // Methods to overwrite from Task2
    @Override
    public ListNode newListNode(String data) throws NullPointerException {
        nextNode = new ListNodeImpl();
        if (nextNode == null) {
            System.out.println("Error: heap overflow");
            return null;
        }
        nextNode.setNext(null);
        nextNode.setData(data);

        return nextNode;
    }

    @Override
    public void prepend(ListNode list) throws NullPointerException {
        nextNode.setNext(list);
        list = nextNode;
    }

    @Override
    public void append(ListNode list) throws NullPointerException {
        ListNode lastNode;

        if(list == null) {
            list = nextNode;
        } else {
            lastNode = list;
            while(lastNode.getNext() != null) {
                lastNode = lastNode.getNext();
            }

            nextNode = lastNode.getNext();
        }
    }

    @Override
    public void sortedInsert(ListNode list) throws NullPointerException {

    }

    @Override
    public ListNode firstNodeWith(String data) throws NullPointerException {
        ListNode nextNodePtr;

        nextNodePtr = list;

        while(nextNodePtr != null && nextNodePtr.getData().equals(data) ) {
            nextNodePtr = nextNodePtr.getNext();
        }
        return nextNodePtr;
    }

    @Override
    public void deleteNodeWith(String data) throws NullPointerException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void deleteAllNodes() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String WriteNodesInReverseOrder() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        while(list.getNext() != null) {
            sb.append(list.getData() + ", ");
            list = list.getNext();
        }
        return sb.toString();
    }

}
