package fpt.edu.bikeke.dto;

import fpt.edu.bikeke.enums.EnumActive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RouteDto {
    private Long id;
    private String placeFrom;
    private String placeTo;
    private float defaultCost;
    private EnumActive status;
}
