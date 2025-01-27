package org.napalabls.ru.JPA_homework.repository;

import org.napalabls.ru.JPA_homework.dto.Person;
import org.napalabls.ru.JPA_homework.dto.PersonId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, PersonId> {
}
