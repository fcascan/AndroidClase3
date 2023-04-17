package com.fcascan.clase3.entities

class PlayerRepository {
    //Mock Players DB
    var players = mutableListOf<Player>()

    init{
        players.add(Player(-1, "Name", "LastName", 99, "Position", "Team", "AvatarLink"))
        players.add(Player(0, "Lionel", "Messi", 35, "MC", "Argentina", "https://www.fcbarcelona.com/photo-resources/2020/07/01/5f4a3b3b-0b1e-4b1f-9c1f-1f8b2b2b2b2b/MESSI_2020_21.jpg?width=1200&height=750"))
        players.add(Player(1, "Cristiano", "Ronaldo", 36, "MC", "Portugal", "https://www.fcbarcelona.com/photo-resources/2020/07/01/5f4a3b3b-0b1e-4b1f-9c1f-1f8b2b2b2b2b/MESSI_2020_21.jpg?width=1200&height=750"))
        players.add(Player(2, "Antoine", "Griezmann", 29, "MC", "Francia", "https://www.fcbarcelona.com/photo-resources/2020/07/01/5f4a3b3b-0b1e-4b1f-9c1f-1f8b2b2b2b2b/MESSI_2020_21.jpg?width=1200&height=750"))
        players.add(Player(3, "Neymar", "Junior", 29, "MC", "Brasil", "https://www.fcbarcelona.com/photo-resources/2020/07/01/5f4a3b3b-0b1e-4b1f-9c1f-1f8b2b2b2b2b/MESSI_2020_21.jpg?width=1200&height=750"))
        players.add(Player(4, "Kylian", "Mbappe", 22, "MC", "Francia", "https://www.fcbarcelona.com/photo-resources/2020/07/01/5f4a3b3b-0b1e-4b1f-9c1f-1f8b2b2b2b2b/MESSI_2020_21.jpg?width=1200&height=750"))
        players.add(Player(5, "Luis", "Suarez", 34, "MC", "Uruguay", "https://www.fcbarcelona.com/photo-resources/2020/07/01/5f4a3b3b-0b1e-4b1f-9c1f-1f8b2b2b2b2b/MESSI_2020_21.jpg?width=1200&height=750"))
        players.add(Player(6, "Sergio", "Ramos", 35, "MC", "España", "https://www.fcbarcelona.com/photo-resources/2020/07/01/5f4a3b3b-0b1e-4b1f-9c1f-1f8b2b2b2b2b/MESSI_2020_21.jpg?width=1200&height=750"))
        players.add(Player(7, "Robert", "Lewandowski", 32, "MC", "Polonia", "https://www.fcbarcelona.com/photo-resources/2020/07/01/5f4a3b3b-0b1e-4b1f-9c1f-1f8b2b2b2b2b/MESSI_2020_21.jpg?width=1200&height=750"))
        players.add(Player(8, "Mohamed", "Salah", 29, "MC", "Egipto", "https://www.fcbarcelona.com/photo-resources/2020/07/01/5f4a3b3b-0b1e-4b1f-9c1f-1f8b2b2b2b2b/MESSI_2020_21.jpg?width=1200&height=750"))
        players.add(Player(9, "Kevin", "De Bruyne", 29, "MC", "Bélgica", "https://www.fcbarcelona.com/photo-resources/2020/07/01/5f4a3b3b-0b1e-4b1f-9c1f-1f8b2b2b2b2b/MESSI_2020_21.jpg?width=1200&height=750"))
        players.add(Player(10, "Harry", "Kane", 27, "MC", "Inglaterra", "https://www.fcbarcelona.com/photo-resources/2020/07/01/5f4a3b3b-0b1e-4b1f-9c1f-1f8b2b2b2b2b/MESSI_2020_21.jpg?width=1200&height=750"))
        players.add(Player(11, "Sadio", "Mane", 29, "MC", "Senegal", "https://www.fcbarcelona.com/photo-resources/2020/07/01/5f4a3b3b-0b1e-4b1f-9c1f-1f8b2b2b2b2b/MESSI_2020_21.jpg?width=1200&height=750"))
        players.add(Player(12, "Eden", "Hazard", 29, "MC", "Bélgica", "https://www.fcbarcelona.com/photo-resources/2020/07/01/5f4a3b3b-0b1e-4b1f-9c1f-1f8b2b2b2b2b/MESSI_2020_21.jpg?width=1200&height=750"))
        players.add(Player(13, "Paul", "Pogba", 28, "MC", "Francia", "https://www.fcbarcelona.com/photo-resources/2020/07/01/5f4a3b3b-0b1e-4b1f-9c1f-1f8b2b2b2b2b/MESSI_2020_21.jpg?width=1200&height=750"))
        players.add(Player(14, "Karim", "Benzema", 33, "MC", "Francia", "https://www.fcbarcelona.com/photo-resources/2020/07/01/5f4a3b3b-0b1e-4b1f-9c1f-1f8b2b2b2b2b/MESSI_2020_21.jpg?width=1200&height=750"))
    }
}