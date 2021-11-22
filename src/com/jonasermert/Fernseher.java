package com.jonasermert;

public class Fernseher {

        int lautstaerke = 10;
        int programm = 1;
        boolean status = false;

        void status (boolean onOff) {
            status = onOff;
        }

        void lauter (int aenderung) {
            if (status == true) {
                lautstaerke = lautstaerke + aenderung;
                if (lautstaerke > 100) {
                    lautstaerke = 100;
                }
            }
        }

    void leiser (int aenderung) {
        if (status == true) {
            lautstaerke = lautstaerke - aenderung;
            if (lautstaerke <= 0) {
                lautstaerke = 0;
            }
        }
    }
    void programmWechsel (int wechsel) {
        if (status == true) {
            programm = wechsel;
        }
    }
    void ausgabe () {
        if (status == true)
            System.out.println("Der Fernseher ist eingeschalten, es läuft aktuell Programm " + programm + " bei Lautstärke " + lautstaerke);
        else
            System.out.println("Der Fernseher ist ausgeschalten");
    }
}
}
