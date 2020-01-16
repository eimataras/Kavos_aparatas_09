package lt.eimantas;

import java.util.Scanner;

public class Machine {
    private static Integer MAX_USE_NO = 50;
    private static Float MAX_SUGAR_G = 1000f;
    private static Float MAX_WATER_ML = 3000f;
    private static Float MAX_BEANS_G = 1000f;
    private static Float MAX_MILK_ML = 500f;
    private Float sugar;
    private Float water;
    private Float beans;
    private Float milk;
    private Integer useNo;

    public Machine() {
    }

    public Machine(Float parSugar, Float parWater, Float parBeans, Float parMilk) {
        this.sugar = parSugar;
        this.water = parWater;
        this.beans = parBeans;
        this.milk = parMilk;
    }

    public Machine(Float parSugar, Float parWater, Float parBeans, Float parMilk, Integer parUseNo) {
        this.sugar = parSugar;
        this.water = parWater;
        this.beans = parBeans;
        this.milk = parMilk;
        this.useNo = parUseNo;
    }

    public void topUpSugar() {
        Scanner sc = new Scanner(System.in);
        Float kiekis;
        Float pildytMax = MAX_SUGAR_G - sugar;
        do {
            System.out.println("Kiek gramu cukraus pilate? Iki pilno truksta: " + pildytMax + " g.");
            kiekis = sc.nextFloat();
            if (kiekis <= pildytMax) {
                sugar = sugar + kiekis;
                System.out.println("Papildete sekmingai. Siuo metu aparate yra: " + sugar + " g cukraus");
            } else {
                System.out.println("Tiek nebetelpa!");
            }
        } while (kiekis > pildytMax);
    }

    public void topUpWater() {
        Scanner sc = new Scanner(System.in);
        Float kiekis;
        Float pildytMax = MAX_WATER_ML - water;
        do {
            System.out.println("Kiek ml vandens pilate? Iki pilno truksta: " + pildytMax + " ml.");
            kiekis = sc.nextFloat();
            if (kiekis <= pildytMax) {
                water = water + kiekis;
                System.out.println("Papildete sekmingai. Siuo metu aparate yra: " + water + " ml vandens");
            } else {
                System.out.println("Tiek nebetelpa!");
            }
        } while (kiekis > pildytMax);
    }//Analogiskas

    public void topUpBeans() {
        Scanner sc = new Scanner(System.in);
        Float kiekis;
        Float pildytMax = MAX_BEANS_G - beans;
        do {
            System.out.println("Kiek g kavos pupeliu pilate? Iki pilno truksta: " + pildytMax + " g.");
            kiekis = sc.nextFloat();
            if (kiekis <= pildytMax) {
                beans = beans + kiekis;
                System.out.println("Papildete sekmingai. Siuo metu aparate yra: " + beans + " g kavos pupeliu");
            } else {
                System.out.println("Tiek nebetelpa!");
            }
        } while (kiekis > pildytMax);
    } //Analogiskas

    public void topUpMilk() {
        Scanner sc = new Scanner(System.in);
        Float kiekis;
        Float pildytMax = MAX_MILK_ML - milk;
        do {
            System.out.println("Kiek ml pieno pilate? Iki pilno truksta: " + pildytMax + " g.");
            kiekis = sc.nextFloat();
            if (kiekis <= pildytMax) {
                milk = milk + kiekis;
                System.out.println("Papildete sekmingai. Siuo metu aparate yra: " + milk + " ml pieno");
            } else {
                System.out.println("Tiek nebetelpa!");
            }
        } while (kiekis > pildytMax);
    } //Analogiskas

    public void makeCoffee (String kavosPavadinimas) {
        switch (kavosPavadinimas) {
            case "mazasKapucino": {
                KavosPuodelis mazasKapucino = new CapuccinoPuodelis(250);
                mazasKapucino.setRecipe(250, "SmallCapuccino", 10f, 200f, 10f, 5f);
                sugar = sugar - mazasKapucino.getRecipe().getSugar();
                water = water - mazasKapucino.getRecipe().getWater();
                beans = beans - mazasKapucino.getRecipe().getBeans();
                milk = milk - mazasKapucino.getRecipe().getMilk();
                mazasKapucino.setIfDone(true);
                System.out.println("Jusu kava: "+mazasKapucino.getCoffeeName()+" pagaminta. Skanaus :)");
                break;
            }
            case "espresso": {
                Puodelis espresso = new EspressoPuodelis(250);

                break;
            }
        }
    }
}
