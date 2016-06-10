package com.ecomm.service;

import com.ecomm.model.Cart;

public interface CartService {

    Cart getCartById(int cartId);

    void update(Cart cart);
}
