package kulekhanipanaromaresort

class UserMapping {
    User user;
    String userName;
    String password;
    static  hasMany = [roles:Role];
    String createdBy;
    Date createDate;
    String updateBy;
    Date updatedDate = new Date();

    static constraints = {
        userName(blank: false , minSize: 5)
        password(blank: false , minSize: 5)
        user(nullable: false)
        createdBy(blank: false)
        createDate(nullable: false)
        updateBy(blank: false)
        updatedDate(nullable: false)

    }
}
