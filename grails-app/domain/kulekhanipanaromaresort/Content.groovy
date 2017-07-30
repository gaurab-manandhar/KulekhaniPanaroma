package kulekhanipanaromaresort

class Content {
    User user;
    String category;
    String description;
   // static hasMany = [users:User];

    static constraints = {
        category(blank: false , minSize: 3)
        description(blank: false, minSize: 100)
        user(nullable: false)
    }
}
