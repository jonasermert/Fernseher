package com.jonasermert;

public class Main {

    public static void main(String[] args) {

        Fernseher meinFernseher = new Fernseher();

        meinFernseher.status(true);
        meinFernseher.ausgabe();
        meinFernseher.lauter(50);
        meinFernseher.ausgabe();
        meinFernseher.programmWechsel(8);
        meinFernseher.ausgabe();
        meinFernseher.programmWechsel(4);
        meinFernseher.ausgabe();
        meinFernseher.leiser(7);
        meinFernseher.programmWechsel(4);
        meinFernseher.ausgabe();
        meinFernseher.status(false);
        meinFernseher.ausgabe();
    }
}

