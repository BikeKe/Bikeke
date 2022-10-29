package fpt.edu.bikeke.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DriverDto {
    private Long id;
    private Long accountId;
    private String idNumber;
    private String idImg;
}
