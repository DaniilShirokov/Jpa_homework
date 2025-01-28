package org.napalabls.ru.JPA_homework.dto;

import jakarta.persistence.*;
import lombok.Data;
import org.napalabls.ru.JPA_homework.dto.PersonId;

@Data
@Entity
@Table(name = "PERSONS")
@IdClass(PersonId.class)
public class PersonCopy {
    @Id
    private String name;

    @Id
    private String surname;

    @Id
    private int age;

    private String phoneNumber;
    private String cityOfLiving;
}

