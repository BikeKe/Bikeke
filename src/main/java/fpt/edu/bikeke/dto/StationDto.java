package fpt.edu.bikeke.dto;

import fpt.edu.bikeke.enums.EnumActive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StationDto {
    private Long id;
    private String name;
    private String address;
    private String img;
    private float latitude;
    private float longtitude;
    private EnumActive status;
}
