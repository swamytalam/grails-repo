package com.test

class User {

	String userName
	String password

	static hasOne = [shipToAddress: Address, billToAddress:Address]

	static constraints = {
		userName (blank:false)
		password (blank:false)
	}
}
