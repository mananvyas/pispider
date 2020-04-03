package net.project.pispider.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;

@Entity
public class Address {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;

    private String line1;
    private String line2;
    private String landmark;
    private String postcode;
    private String state;
    private String country;

    @Enumerated(EnumType.STRING)
    private AddressType addressType;

    @ManyToOne
    @JoinColumn(name = "person_info", referencedColumnName = "personId")
    @JsonIgnore
    private Person person;

    public Address() {
    }

    public Address(Long addressId, String line1, String line2, String landmark, String postcode, String state, String country, AddressType addressType, Person person) {
        this.addressId = addressId;
        this.line1 = line1;
        this.line2 = line2;
        this.landmark = landmark;
        this.postcode = postcode;
        this.state = state;
        this.country = country;
        this.addressType = addressType;
        this.person = person;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public AddressType getAddressType() {
        return addressType;
    }

    public void setAddressType(AddressType addressType) {
        this.addressType = addressType;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
