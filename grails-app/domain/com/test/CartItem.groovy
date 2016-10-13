package com.test

class CartItem {

	String sku
	Integer quantity
	Double price
	String image;
	Cart cart;

	static belongsTo = Cart
	static constraints = {
		sku (blank:false)
		quantity (nullable:false)
		price (blank:false)
		image (blank:false)
		cart (blank:false)
	}
}
