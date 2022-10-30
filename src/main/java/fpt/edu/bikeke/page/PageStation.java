package fpt.edu.bikeke.page;

import fpt.edu.bikeke.dto.StationDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageStation {
    private int pageSize;
    private Long totalElements;
    private int totalPages;
    private List<StationDto> stationList;
}
