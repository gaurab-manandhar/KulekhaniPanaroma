package kulekhanipanaromaresort

class Gallery {
    Date date = new Date();
    String image;
    String folder;
    String description;
    static hasMany = [users:User];

    static constraints = {
        image(blank: false, minSize: 3)
        folder(blank: false, minSize: 3)
        description(blank: true , minSize: 100)
    }
}
