package fpt.edu.vn.dto;

import fpt.edu.vn.enums.EnumAccountStatus;
import fpt.edu.vn.enums.EnumRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminDTO {
    private Long id;
    private boolean isSuper;
    private EnumAccountStatus status;
    private final EnumRole ROLE = EnumRole.ADMIN;
}
