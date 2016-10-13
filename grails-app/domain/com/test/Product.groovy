package com.test

class Product {

	String sku
	Double price
	String image
	String uom

	static constraints = {
		sku (blank:false)
		price (nullable:false)
		image (blank:false)
		uom (blank:false)
	}
}
