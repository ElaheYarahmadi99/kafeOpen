package model.entity.person;

import model.entity.Entities;
import org.hibernate.annotations.Polymorphism;
import org.hibernate.annotations.PolymorphismType;

import javax.persistence.*;
import java.util.Date;

/*(name = "person_ID")*/
/*
@PrimaryKeyJoinColumn(name = "person_ID", referencedColumnName ="entities_ID")
*/

@Entity
@Table(name= "person")
public class Person extends Entities {


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


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
