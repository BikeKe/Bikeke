package fpt.edu.bikeke.dto;

import fpt.edu.bikeke.enums.EnumActive;
import fpt.edu.bikeke.enums.EnumGender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {
    private Long id;
    private String email;
    private String phone;
    private String name;
    private String password;
    private String img;
    private EnumGender gender;
    private Long roleId;
    private Timestamp createdDate;
    private EnumActive status;
}
