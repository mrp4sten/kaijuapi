package kaijuapi

class BootStrap {

    def init = { servletContext ->
        Kaiju godzilla = new Kaiju(name: "Godzilla", img: "https://wikizilla.org/w/images/3/30/Godzilla_Minus_One_version.png", ability: "Atomic Breath", firstAppearance: 1954).save()
        Kaiju kong =new Kaiju(name: "Kong", img: "https://static.wikia.nocookie.net/legendary-monsterverse/images/9/9a/GvK_Kong.png", ability: "Battle Axe", firstAppearance: 1933).save()

        List<Kaiju> kaijus = [godzilla, kong]

        Movie movie = new Movie(title: "Godzilla Minus One", img: "https://upload.wikimedia.org/wikipedia/en/5/5a/Godzilla_%282014%29_poster.jpg", releaseYear: 2023, director: "Takashi Yamazaki")
        movie.addToKaijus(godzilla)
        movie.save()
        
        Battle battle = new Battle(location: "Tokyo", winner: godzilla, loser: kong)
        battle.addToKaijus(godzilla)
        battle.addToKaijus(kong)
        battle.save()

    }
    def destroy = {
    }
}