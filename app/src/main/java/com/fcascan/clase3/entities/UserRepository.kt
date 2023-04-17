package com.fcascan.clase3.entities

class UserRepository {
    //Mock Users DB
    var usersList = mutableListOf<User>()

    init{
        usersList.add(User(0, "Fernando", "Castro", "fcc@gmail.com", "1234"))
        usersList.add(User(1, "Juan", "Garcia", "jg@mail.com", "7890"))
        usersList.add(User(2, "Pedro", "Perez", "pp@hotmail.com", "0000"))
        usersList.add(User(3, "Maria", "Gonzalez", "mg@outlook.com", "1111"))
        usersList.add(User(4, "Jose", "Lopez", "jl@yahoo.com.ar", "2222"))
    }
}
