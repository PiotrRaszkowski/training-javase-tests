package pl.jitsolutions.training.javasetests;

public enum Manufacturer {
    VOLKSWAGEN("Wolsburg"),
    AUDI("Elbląg"),
    FORD("Detroit"),
    SEAT("Ibiza");

    private String headquater;

    Manufacturer(String headquater) {
        this.headquater = headquater;
    }

    public String getHeadquater() {
        return headquater;
    }
}
