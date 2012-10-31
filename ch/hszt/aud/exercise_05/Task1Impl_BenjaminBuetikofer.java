package ch.hszt.aud.exercise_05;

/**
 * Created with IntelliJ IDEA.
 * User: bbu
 * Date: 31.10.12
 * Time: 19:42
 */
public class Task1Impl_BenjaminBuetikofer extends Task1 {
    String[] stack;

    public Task1Impl_BenjaminBuetikofer() {
        stack = new String[SIZE];
    }

    @Override
    public void push(String data) throws NullPointerException {
        boolean check = false;
        for(int i = 0; i<SIZE; i++) {
            if(stack[i] == null) {
                stack[i] = data;
                check = true;
                break;
            }
        }
        if(!check)
           throw new NullPointerException();
    }

    @Override
    public String pop() throws NullPointerException {
        boolean check = false;
        for(int i = 0; i<SIZE; i++) {
            if(stack[i] != null) {
                return stack[i];
            }
        }
        throw new NullPointerException();
    }

    @Override
    public boolean isEmpty() {
        if(stack.length == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isFull() {
        if(stack.length > 14) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
