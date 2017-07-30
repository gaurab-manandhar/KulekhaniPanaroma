package kulekhanipanaromaresort

class Slider {
    String category;
    String image;
    String description;
    static hasMany = [users: User];

    static constraints = {
        category(blank: false ,minSize: 5)
        image(blank: false , minSize: 4)
        description(blank: true , minSize: 100)
    }
}
