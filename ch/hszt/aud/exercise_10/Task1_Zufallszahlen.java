package ch.hszt.aud.exercise_10;

import ch.aplu.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
* Damit das GUI möglichst einfach umgesetzt werden kann, bitte folgende Library reinziehen
* und folgendermassen vorgehen:
*  - Auf Moodle aplu.jar (gezippt) runterladen und entzippen
*  - In Eclipse mit rechter Maustaste auf das Projekt klicken
*  - Im Kontextmenu: "Build Path"--> Libraries auswählen. 
*  - User Library selektieren und eine neue erstellen und danach auf das entzippte jar verlinken.
*
* Die Bib vereinfacht einiges:
* Folgende Statements benötigt ihr:
* - Bitte importiert in eure Klasse java.awt.Color;
* - Um Punkte zu färben: color(Color.red).
* - Um einen Punkt auf das GUI zu zeichen: point(zx, zy);
*/

class Task1_Zufallszahlen extends GPanel {
	private int anzSchuesse; // Anzahl Versuche
	private int anzTreffer; // Anzahl Treffer
	private double berechneteFlaeche;
	private JTextField textField = new JTextField(6);
	private JLabel label = new JLabel("Anzahl Schüsse");
	private JButton goButton = new JButton("go");

	Task1_Zufallszahlen() {
		goButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				init();
				anzSchuesse = Integer.parseInt(textField.getText());
				schiessen();
				calculateArea();
			}
		});

		add(label);
		add(textField);
		add(goButton);
		validate();
	}

	private void init() {
		window(-0.5, 1.5, -0.5, 1.5);
		clear();
		pos(0.5, 0.5);
		rectangle(1, 1);
		pos(0, 0);
		arc(1, 0, 90);
	}

	/**
	 * Hier müsst ihr randomisiert auf die Zielscheibe schiessen und auf den Screen 
	 * mittels point(xz, yz) den Punkt einzeichnen. Je nach dem ob treffer oder nicht,
	 * mit einer anderen Farbe.
	 * Bitte benutzt die vordefinierten Variablen anzSchuesse und anzTreffer hierzu.
	 * color(Color.red): färbt den Punkt
	 * point(zx, zy): setzt den Punkt aufs GUI
	 */
	private void schiessen() {
		double zx, zy; //zx = x-Wert, zy = y-Wert
		
		// hier musst du nun das Schiessen simulieren...
	}
	
	/**
	 * Berechnet die Fläche aufgrund der Anzahl Schüsse und Anzahl effektiver Treffer
	 * Ihr müsst nur die Berechnung programmieren und das Resultat in die Variable "meineBerechneteFlaeche" abfüllen.
	 */
	public void calculateArea() {
		// berechne hier die Fläche und fülle das Resultat in die Variable 
		// "berechneteFlaeche" ab.
		
		color(Color.black);
		pos(0, -0.2);
		text("Die Fläche beträgt " + berechneteFlaeche + " qcm");

	}
	
	/**
	 * Euer Randomisierer
	 * Als Rückgabewert soll ein double im Bereich von 0 - 0.999999 zurückkommen.
	 * Damit ihr x wie auch y bestimmen könnt, müsst ihr diese Methode 2mal aufrufen...
	 * Nein, Math.random() ist nicht erlaubt. 
	 * Ihr habt ein paar Algorithmen in der Theorie kennengelernt..
	 */
	public double myRandomiser() {
		// euer random Algorithmus.... (return 0 bitte ersetzen...)
		return 0;
	}
	public static void main(String[] args) {
		System.out.println("Übung 10 - Aufgabe 1 - Zufallszahlen");
		System.out.println("------------------------------------");
		System.out.println("Du solltest nun ein GUI vor dir sehen...");
		new Task1_Zufallszahlen();
	}
}