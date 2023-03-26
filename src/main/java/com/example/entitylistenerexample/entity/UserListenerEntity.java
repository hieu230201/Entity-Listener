package com.example.entitylistenerexample.entity;

import jakarta.persistence.*;

/**
 * Description:
 *
 * @author: hieu
 * @since: 25/03/2023
 * Project_name: com.example.entitylistenerexample.entity
 */
@Entity
@Table(name = "user_listener", schema = "entity_listener", catalog = "")
public class UserListenerEntity {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "AGE")
    private String age;
    @Column(name = "ADDRESS")
    private String address;

    public UserListenerEntity() {
    }

    public UserListenerEntity(Long id, String name, String age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
