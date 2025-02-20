package services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Product;

public class ProductManagementService {

    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Produto adicionado: " + product.getName());
    }

    public void removeProduct(String productName) {
        products.removeIf(product -> product.getName().equalsIgnoreCase(productName));
        System.out.println("Produto removido: " + productName);
    }

    public List<Product> getAllProducts() {
        return new ArrayList<>(products);
    }
}
