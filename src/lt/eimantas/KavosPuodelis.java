package lt.eimantas;

public class KavosPuodelis extends Puodelis implements Receptai {
    private Produktai products;
    private String coffeeName;
    private boolean ifDone;


    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public boolean isIfDone() {
        return ifDone;
    }

    public void setIfDone(boolean ifDone) {
        this.ifDone = ifDone;
    }

    @Override
    public String toString() {
        return "Kavos pavadinimas: "+coffeeName+"; Pupeles: "+this.products.getBeans()+"; Vanduo:"+this.products.getWater()+"; Cukrus: "+this.products.getSugar()+"; Pienas: "+this.products.getMilk();
    }

    public void setProducts(Produktai products) {
      this.products = products;
    }

    @Override
    public Produktai getRecipe() {
        return this.products;
    }

    @Override
    public void setRecipe(int Size, String name, Float beans, Float water, Float milk, Float sugar) {
        this.coffeeName = name;
        this.setProducts(new Produktai(beans, water, sugar, milk));
    }
}
