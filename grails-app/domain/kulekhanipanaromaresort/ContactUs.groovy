package kulekhanipanaromaresort

class ContactUs {
    String name;
    String phoneNumber;
    String email;
    String message;
    String date;
    static constraints = {
        name(blank: false, minSize:5);
        phoneNumber(blank: false, minSize: 10);
        email(blank: false, email: true, minSize:10)
        message(blank: false);
        date(blank: false);

    }
}
