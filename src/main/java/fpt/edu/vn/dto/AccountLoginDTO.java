package fpt.edu.vn.dto;

import fpt.edu.vn.enums.EnumRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountLoginDTO {
    private String email;
    private String password;
    private String role;
}
