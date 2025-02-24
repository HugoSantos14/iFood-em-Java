package model.enums;

public enum ProductCategory {
    MEATS("Carne"),
    FISHES("Peixe"),
    DRINKS("Bebidas"),
    FRUITS_AND_VEGETABLES("Frutas e Vegetais"),
    HERBS("Ervas"),
    FLOURS("Farinhas"),
    PULPS_AND_FRUITS("Polpas e frutas"),
    MEALS("Refeições");

    private String description;

    ProductCategory(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
