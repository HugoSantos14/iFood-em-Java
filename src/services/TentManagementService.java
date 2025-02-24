package services;

import model.contracts.ManagementService;
import model.entities.Tent;

import java.util.ArrayList;
import java.util.List;

public class TentManagementService implements ManagementService<Tent> {

    private static final List<Tent> tents = new ArrayList<>();
    private static int idCounter = 0;

    @Override
    public void create(Tent tent) {
        tent.setId(idCounter++);
        tents.add(tent);
        System.out.println("Barraca cadastrada: " + tent.getName());
    }

    @Override
    public void remove(Tent tent) {
        tents.remove(tent);
        System.out.println("Barraca excluída: " + tent.getName());
    }

    @Override
    public Tent getById(int id) {
        for (Tent tent : tents) {
            if (tent.getId() == id) {
                return tent;
            }
        }

        return null;
    }
}
