package fpt.edu.bikeke.entity;

import fpt.edu.bikeke.enums.EnumActive;
import fpt.edu.bikeke.enums.EnumGender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String phone;
    private String name;
    private String img;
    private String password;
    @Enumerated(EnumType.STRING)
    private EnumGender gender;
    @ManyToOne
    @JoinColumn(name = "roleId")
    private Role role;
    private Timestamp createdDate;
    @Enumerated(EnumType.STRING)
    private EnumActive status;
}
