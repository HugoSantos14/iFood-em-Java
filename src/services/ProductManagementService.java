package services;

import java.util.ArrayList;
import java.util.List;

import model.contracts.ManagementService;
import model.entities.Product;

public class ProductManagementService implements ManagementService<Product> {

    private static final List<Product> products = new ArrayList<>();
    private static int idCounter = 0;

    @Override
    public void create(Product product) {
        product.setId(idCounter++);
        products.add(product);
        System.out.println("Produto cadastrado: " + product.getName());
    }

    @Override
    public void remove(Product product) {
        products.remove(product);
        System.out.println("Produto excluído: " + product.getName());
    }

    @Override
    public Product getById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }

        return null;
    }
}
