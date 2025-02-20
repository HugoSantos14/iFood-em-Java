package model.enums;

public enum CuisineType {
    BRAZILLIAN("Brasileira"),
    JAPANESE("Japonesa"),
    ITALLIAN("Italiana");

    private String description;

    CuisineType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
