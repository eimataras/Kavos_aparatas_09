package lt.eimantas;

public class Produktai {
    private Float beans;
    private Float water;
    private Float sugar;
    private Float milk;

    public Produktai (Float beans, Float water, Float sugar, Float milk) {
        this.beans = beans;
        this.water = water;
        this.sugar = sugar;
        this.milk = milk;
    }


    public Float getBeans() {
        return beans;
    }

    public void setBeans(Float beans) {
        this.beans = beans;
    }

    public Float getWater() {
        return water;
    }

    public void setWater(Float water) {
        this.water = water;
    }

    public Float getSugar() {
        return sugar;
    }

    public void setSugar(Float sugar) {
        this.sugar = sugar;
    }

    public Float getMilk() {
        return milk;
    }

    public void setMilk(Float milk) {
        this.milk = milk;
    }

    @Override
    public String toString() {
        return "Vanduo: "+water+"; Pupeles: "+beans+"; Pienas: "+milk+"; Cukrus: "+sugar;
    }
}
