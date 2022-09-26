package fpt.edu.vn.bikeke.entity;

import fpt.edu.vn.bikeke.enums.UserStatusEnum;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "User")
public class User {
    @Id
    private long id;
    private String email, name, phone;
    private UserStatusEnum status;

    public User(){}

    public User(long id, String email, String name, String phone, UserStatusEnum status) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.phone = phone;
        this.status = status;
    }
}
