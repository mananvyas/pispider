package net.project.pispider.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Person {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String mobileNumberPersonal;
    private String mobileNumberBusiness;

    @OneToMany(mappedBy = "person",  cascade = CascadeType.ALL)
    private List<Address> address;

    public Person() {
    }

    public Person(Long personId, String firstName, String middleName, String lastName, String mobileNumberPersonal, String mobileNumberBusiness, List<Address> address) {
        this.personId = personId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.mobileNumberPersonal = mobileNumberPersonal;
        this.mobileNumberBusiness = mobileNumberBusiness;
        this.address = address;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNumberPersonal() {
        return mobileNumberPersonal;
    }

    public void setMobileNumberPersonal(String mobileNumberPersonal) {
        this.mobileNumberPersonal = mobileNumberPersonal;
    }

    public String getMobileNumberBusiness() {
        return mobileNumberBusiness;
    }

    public void setMobileNumberBusiness(String mobileNumberBusiness) {
        this.mobileNumberBusiness = mobileNumberBusiness;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }
}