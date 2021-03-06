package logic.loan_classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Represents a person who goes to the company to borrow some money. It's primary key its his ID. <br>
 * The client can have multiple loans until it reaches the limit given by the company.
 */
public class Client implements Serializable {
    private int id;
    private String name;
    private String homePhone;
    private String mobilePhone;
    private String address;
    private ArrayList<Loan> loans;

    Client() {

    }

    public Client(int id, String name, String homePhone, String mobilePhone, String address) {
        this.id = id;
        this.name = name;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.address = address;
    }

    public void setLoans(ArrayList<Loan> loans) {
        this.loans = loans;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getAddress() {
        return address;
    }

    private  ArrayList<Loan> getLoans() {
        return loans;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", homePhoneNumber='" + homePhone + '\'' +
                ", cellphoneNumber='" + mobilePhone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, homePhone, mobilePhone, address);
    }

}
