package fpt.edu.vn.dto;

import fpt.edu.vn.enums.EnumGender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDTO {
    private Long id;
    private String email, phone, name;
    private EnumGender gender;
    private String img;
    private Timestamp createdDate;
}
