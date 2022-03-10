package Hashtables;

public class PhoneBookEntry {
    public final String fullname;
    public final String email;
    public final String Homeaddress;

    public PhoneBookEntry(String fullname, String email, String homeaddress) {
        this.fullname = fullname;
        this.email = email;
        Homeaddress = homeaddress;
    }

    @Override
    public String toString() {
        return "PhoneBookEntry{" +
                "fullname='" + fullname + '\'' +
                ", email='" + email + '\'' +
                ", Homeaddress='" + Homeaddress + '\'' +
                '}';
    }
}
