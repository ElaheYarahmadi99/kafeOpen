package model.entity.person;

import model.entity.Entities;

import javax.persistence.*;

@Table(name = "person")
@Entity(name = "person")
public class Person extends Entities {


    private String name;
    @Column(columnDefinition = "VARCHAR2(20)")
    private String lastName;
    @Column(columnDefinition = "VARCHAR2(20)")
    private String phone;


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
