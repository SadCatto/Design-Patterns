public class BorgirBuilder implements Builder {
    Borgir b = new Borgir();

    BorgirBuilder patty(String s) {
        if (s.equals("Non Veg"))
            this.b.p = new NonVegPatty();
        if (s.equals("Veg"))
            this.b.p = new VegPatty();
        System.out.println("Patty Added");
        return this;
    }

    BorgirBuilder cheese(String s) {
        this.b.ch = new Cheese(s);
        System.out.println("Cheese Added");
        return this;
    }

    BorgirBuilder sauce(String s) {
        this.b.s = new Sauce(s);
        System.out.println("Sauces Added");
        return this;
    }

    public Borgir combine() {
        return this.b;
    }
}
