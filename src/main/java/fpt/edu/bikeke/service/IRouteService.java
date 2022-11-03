package fpt.edu.bikeke.service;

import fpt.edu.bikeke.dto.RouteDto;

import java.util.List;

public interface IRouteService {
    Boolean create(RouteDto routeDto);
    Boolean delete(Long routeId);
    List<RouteDto> findAll();
    Boolean update(RouteDto routeDto);
}
