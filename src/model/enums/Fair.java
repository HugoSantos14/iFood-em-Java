package model.enums;

import model.entities.Tent;

import java.util.ArrayList;
import java.util.List;

public enum Fair {
    VER_O_PESO("Ver-O-Peso", "Blvd. Castilhos França – Campina, Belém – PA"),
    JURUNAS("Jurunas", "Av. Bernardo Sayão, 1444 – Jurunas, Belém – PA"),
    CREMACAO("Cremação", "Passagem São Silvestre, 62 – Cremação, Belém – PA"),
    GUAMA("Guamá", "Av. José Bonifácio, 2216 – Guamá, Belém – PA"),
    BATISTA_CAMPOS("Batista Campos", "Av. Conselheiro Furtado, 981 – Batista Campos, Belém – PA"),
    SANTA_LUZIA("Santa Luzia", "Tv. Dom Pedro I, 1152-1200 – Umarizal, Belém – PA"),
    TELEGRAFO("Telégrafo", "Av. Sen. Lemos, 1448 – Telégrafo, Belém – PA");

    private String name;
    private String adress;
    private final List<Tent> tents = new ArrayList<>();

    Fair(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public List<Tent> getTents() {
        return tents;
    }
}
