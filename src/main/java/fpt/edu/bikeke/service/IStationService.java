package fpt.edu.bikeke.service;

import fpt.edu.bikeke.dto.StationDto;
import fpt.edu.bikeke.page.PageStation;

public interface IStationService {
    Boolean create(StationDto stationDto);
    Boolean update(StationDto stationDto);
    Boolean delete(Long stationId);
    PageStation findAll(int page);
}
