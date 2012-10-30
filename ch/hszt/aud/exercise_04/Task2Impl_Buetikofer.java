package ch.hszt.aud.exercise_04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created with IntelliJ IDEA.
 * User: bbu
 * Date: 24.10.12
 * Time: 20:14
 */
public class Task2Impl_Buetikofer implements Task2 {
    // Instance Variables
    ListNode list;
//    ListNode n;

    // Constructor
    public Task2Impl_Buetikofer() {
        // Nothing to do here
    }

    // Methods to overwrite from Task2
    @Override
    public ListNode newListNode(String data) throws NullPointerException {
        ListNode n = new ListNodeImpl();
        if (n == null) {
            System.out.println("Error: heap overflow");
            return null;
        }
        n.setNext(null);
        n.setData(data);

        return n;
    }

    @Override
    public void prepend(ListNode node) throws NullPointerException {
        node.setNext(list);
        this.list = node;
    }

    @Override
    public void append(ListNode node) throws NullPointerException {
        ListNode lastNode;

        if(list == null) {
            list = node;
        } else {
            lastNode = list;
            while(lastNode.getNext() != null) {
                lastNode = lastNode.getNext();
            }

            lastNode.setNext(node);
        }
    }

//    @Override
//    public void sortedInsert(ListNode node) throws NullPointerException {
//        ListNode pred = null;
//        ListNode succ = list;
//
//        while(succ != null) {
//            if( node.getData().compareToIgnoreCase(succ.getData())  > 0 ) {
//                pred = succ;
//            }
//            succ = succ.getNext();
//
//        }
//
//        if(pred == null) {
//            list = node;
//        } else {
//            pred.setNext(node);
//        }
//
//        node.setNext(succ);
//
//    }

    @Override
    public void sortedInsert(ListNode node) throws NullPointerException {
        if (list == null) {
            list = node;
        } else if (list.getData().charAt(0) > node.getData().charAt(0)) {
            // liegt lexikalisch nach dem ersten Node
            prepend(node);
        } else if (list.getNext() == null) {
            // liegt lexikalisch vor dem ersten Node
            list.setNext(node);
        } else {
            ListNode curNode = list;
            ListNode nextNode = curNode.getNext();

            while (nextNode.getData().charAt(0) < node.getData().charAt(0) && nextNode != null) {
                curNode = curNode.getNext();
                nextNode = curNode.getNext();
            }

            if (nextNode != null) {
                curNode.setNext(node);
                node.setNext(nextNode);
            } else {
                curNode.setNext(node);
            }
        }
    }

    @Override
    public ListNode firstNodeWith(String data) throws NullPointerException {
        while(list != null && !list.getData().equals(data) ) {
            list = list.getNext();
        }
        return list;
    }

    @Override
    public void deleteNodeWith(String data) throws NullPointerException {
        ListNode pred = null;
        ListNode n = list;

        while(n != null && !n.getData().equals(data)) {
            pred = n;
            n = n.getNext();
        }

        if(n!=null) {
            if(pred == null) {
                list = n.getNext();
            } else {
                pred.setNext(n.getNext());
            }
        }
        // Dispose n
    }

    @Override
    public void deleteAllNodes() {
        list = null;
    }

    @Override
    public String WriteNodesInReverseOrder() {
        ListNode n = list;

        ArrayList<String> all = new ArrayList<String>();

        while(n != null) {
            all.add(n.getData());
            n = n.getNext();
        }

        Collections.reverse(all);

        return all.toString();


    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode n = list;
        while(n != null) {
            sb.append(n.getData());
            n = n.getNext();
            if(n!=null) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

}
