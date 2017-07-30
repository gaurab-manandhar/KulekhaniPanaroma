package kulekhanipanaromaresort

class Reservation {
    String name;
    String address;
    String contactNumber;
    String email;
    Date checkIn;
    Date checkOut;

    static constraints = {
        name(blank: false , minSize: 3)
        address(blank: false , minSize: 5)
        contactNumber(blank: false , minSize:10 )
        email(email: true , blank: false)
        checkIn(nullable: false)
        checkOut(nullable: false)
    }
}
