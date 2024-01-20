package kaijuapi

class BootStrap {

    def init = { servletContext ->
        new Kaiju(name: "Godzilla", img: "https://upload.wikimedia.org/wikipedia/en/2/2a/Godzilla_%282014%29_poster.jpg", ability: "Atomic Breath", firstAppearance: 1954).save()
    }
    def destroy = {
    }
}