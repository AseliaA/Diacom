package com.example.demo.model;

import com.example.demo.enums.SugarType;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Data
@Table(name = "user")
public class User {


    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Long id;

    @Column(name = "user_name", nullable = false, length = 20)
    private String name;

    @Column(name = "user_surname", nullable = false, length = 20)
    private String surname;

    @Column(name = "user_age", nullable = false)
    private int age;

    @Column(name = "number", nullable = false, length = 13)
    private long number;

    @Column(name = "login", nullable = false, length = 50, unique = true)
    private String login;

    @Column(name = "password", nullable = false, length = 50)
    private String password;

    @Column(name = "sugarStage")
    @Enumerated(EnumType.STRING)
    private SugarType sugarType;

    public static class Builder {
        private Long id;
        private String name;
        private String surname;
        private int age;
        private long number;
        private String login;
        private String password;
        private SugarType sugarType;

        public Builder(String name, String surname, int age, long number, String login,
                       String password) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.number = number;
            this.login = login;
            this.password = password;
        }

        public Builder withSugarType(SugarType sugarType){
            this.sugarType =sugarType;
            return this;
        }

        public User build() {
            User user = new User();
            user.name = name;
            user.surname = surname;
            user.age = age;
            user.number = number;
            user.login = login;
            user.password = password;
            user.sugarType = sugarType;
            return user;
        }

    }

}
