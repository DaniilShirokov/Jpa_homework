package org.napalabls.ru.JPA_homework.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@Entity
@Table(name = "persons")
//@IdClass(PersonId.class)
@AllArgsConstructor
@NoArgsConstructor

public class Person {

    @EmbeddedId
    private PersonId personId;
    @JsonProperty("phone_number")
    private String phoneNumber;
    @JsonProperty("city_of_living")
    private String cityOfLiving;

    public PersonId getPersonId() {
        return personId;
    }

    public void setPersonId(PersonId personId) {
        this.personId = personId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCityOfLiving() {
        return cityOfLiving;
    }

    public void setCityOfLiving(String cityOfLiving) {
        this.cityOfLiving = cityOfLiving;
    }
}