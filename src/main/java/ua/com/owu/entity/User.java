package ua.com.owu.entity;

import lombok.*;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Setter
@Getter
@NoArgsConstructor
//@AllArgsConstructor
@ToString

@Eager
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private  String name;
    private int age;


    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
