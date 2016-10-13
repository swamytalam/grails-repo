package com.test

class Cart {

	Double amount
	static hasMany = [items: CartItem]

	static constraints = {
		amount(nullable:false)
		items (blank:false)
	}
}
