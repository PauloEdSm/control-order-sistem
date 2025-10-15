package br.paulo_dev.control_order_sistem.model.order;

import br.paulo_dev.control_order_sistem.model.product.Product;
import br.paulo_dev.control_order_sistem.model.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Product product;
    private User user;
    private int quantity;
}
