package com.test



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class CartController { 
	
	static scaffold = true
	
	
}
