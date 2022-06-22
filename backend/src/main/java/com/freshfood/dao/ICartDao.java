package com.freshfood.dao;

import java.util.List;

import com.freshfood.model.web.CartItem;

public interface ICartDao {
	/*
	 * get data cart by id cart
	 * input: id_cart
	 * output: a list cart item
	 */
	List<CartItem> getCart(Long id_cart);
	/*
	 * delete cart item from cart user
	 * input: id_cart_item: long
	 * ouput: none
	 */
	int deleteCartItem(long id_cart_item);
	/*
	 * edit quantity of cart item from cart
	 * input: id_cart_item, quantity product
	 * ouput: int row effect
	 */
	int updateCartItem(long id_cart_item, int quantity);
	
}
