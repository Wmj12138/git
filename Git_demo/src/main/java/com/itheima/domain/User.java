package com.itheima.domain;

import java.io.Serializable;

public class User implements Serializable {
    private Integer id;

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                "username=" + username +
                '}';
    }
}
