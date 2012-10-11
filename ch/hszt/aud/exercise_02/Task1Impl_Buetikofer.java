package ch.hszt.aud.exercise_02;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: bbu
 * Date: 04.10.12
 * Time: 15:59
 */
public class Task1Impl_Buetikofer implements Task1 {
    @Override
    public int add(int number1, int number2) {
        // geht auch viel einfacher: return number1 - (-number2);
        String n1 = "";
        String n2 = "";

        if(number1 > 0) {
            for(int i = 0; i<number1; i++) {
                n1 = n1.concat("1");
            }
        } else {
            for(int i = 0; i>number1; i--) {
                n1 = n1.concat("0");
            }
        }

        if (number2>0) {
            for (int i=0;i<number2; i++) {
                n2 = n2.concat("1");
            }
        } else {
            for(int i = 0; i>number2; i--) {
                n2 = n2.concat("0");
            }
        }
        if (n1.contains("1") && n2.contains("1")) {
            return n1.concat(n2).length();
        }
        if (n1.contains("1") && n2.contains("0")) {
            return n1.length() - n2.length();
        }
        if (n1.contains("0") && n2.contains("1")) {
            return n2.length() - n1.length();
        }
        return -n1.length() - n2.length();
    }
}
