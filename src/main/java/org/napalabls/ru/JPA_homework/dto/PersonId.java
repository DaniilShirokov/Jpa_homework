package org.napalabls.ru.JPA_homework.dto;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Entity
public class PersonId implements Serializable {

    private String name;
    private String surname;
    private Integer age;

    public PersonId() {}

    public PersonId(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonId)) return false;
        PersonId personId = (PersonId) o;
        return age == personId.age &&
                Objects.equals(name, personId.name) &&
                Objects.equals(surname, personId.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }
}
