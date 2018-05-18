package com.qp.springboot.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * @Author Liubity
 * @Date 2018/5/17
 */
public class User extends BaseObject{

    private Long id;

    private String name;

    private Integer age;

    private Date birthday;

    public User(){}

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return id != null ? id.equals( user.id ) : user.id == null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + '}';
    }

    @Override
    public int compareTo(Object o) {
        User that = (User) o;
        if(this.id > that.id)
            return 1;
        else if (this.id < that.id)
            return -1;
        else
            return 0;
    }
}
