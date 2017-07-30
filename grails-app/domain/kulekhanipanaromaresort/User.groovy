package kulekhanipanaromaresort

class User {
    Role role;
    String userName;
    String password;
    String email;
    //static hasMany = [roles:Role]
    Date createdDate = new Date();
    String createdBy;
    Date updateDate = new Date();
    String updateBy;
    String toString() {"${this.role}"};
    static constraints = {
        userName(blank: false, minSize: 3);
        password(blank: false, minSize: 5);
        email(email: true, blank: false)
        role(nullable: false);
        createdBy(blank: false);
        createdDate(nullable: false);
        updateBy(blank: false);
        updateDate(nullable: false);


    }
}
