package com.fcascan.clase3.entities;

class User(
        //Constructor
        var id: Int,
        var name: String,
        var lastName: String,
        var email: String,
        var password: String
){
        override fun toString(): String {
            return "User(id=$id, name='$name', lastName='$lastName', email='$email', password='$password')"
        }
}
