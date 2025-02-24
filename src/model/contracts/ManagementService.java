package model.contracts;

public interface ManagementService<E> {

    void create(E entity);
    void remove(E entity);
    E getById(int id);
}
