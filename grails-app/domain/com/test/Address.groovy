package com.test

import com.sun.prism.impl.BaseMesh.FaceMembers;

class Address {

	String address1
	String address2
	String city
	String state
	String country

	static belongsTo = [user: User]
	static constraints = {
		address1 (blank:false)
		address2(blank:false)
		city(blank:false)
		state(blank:false)
		country(blank:false)
	}
}
