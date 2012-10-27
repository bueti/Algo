package ch.hszt.aud.exercise_04;

import java.util.*;

public final class Task1Samples {

    public static void main(String[] args) {
        System.out.println("Uebung 4 - Aufgabe 1");
        System.out.println("--------------------");
        System.out.println();

        Task1 task2Book1
                = new Task1Impl_Buetikofer
                (new Task1.Author[]
                 {new Task1.Author("Dieter", "Bohlen")},
                 "Nichts als die Wahrheit",
                 "3-453-86143-4",
                 "Heyne",
                 new Date(),
                 10.00);

        Task1 task2Book2
                = new Task1Impl_Buetikofer
                (new Task1.Author[]
                 {new Task1.Author("Nadja", "Abd El Farrag")},
                 "Ungelogen“ (k)eine Liebesgeschichte",
                 "3-7766-2339-X",
                 "Herbig",
                 new Date(),
                 0.52);

        Task1 task2Book3
                = new Task1Impl_Buetikofer
                (new Task1.Author[]
                 {new Task1.Author("Verona", "Pooth"),
                  new Task1.Author("Verona", "Feldbusch")},
                 "Der kleine Feldbusch",
                 "342666139X",
                 "Knaur",
                 new Date(),
                 0.19);

        printSample(task2Book1);
        printSample(task2Book2);
        printSample(task2Book3);
        System.out.println("");
        System.out.println("equals:");
        System.out.println("Book 1 equals Book 2? " + task2Book1.equals(task2Book2));
        System.out.println("Book 2 equals Book 1? " + task2Book2.equals(task2Book1));
        System.out.println("Book 3 equals Book 3? " + task2Book3.equals(task2Book3));
     
        System.out.println();
        System.out.println("compareTo");
    }

    private static void printSample(Task1 sample) {
        System.out.println(sample);
    }
}
