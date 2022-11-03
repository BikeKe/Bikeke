package fpt.edu.bikeke.service;

import fpt.edu.bikeke.dto.RouteDto;
import fpt.edu.bikeke.entity.Route;
import fpt.edu.bikeke.enums.EnumActive;
import fpt.edu.bikeke.repository.RouteRepository;
import fpt.edu.bikeke.utils.MappingUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RouteService implements IRouteService {
    @Autowired
    private RouteRepository routeRepository;

    @Override
    public Boolean create(RouteDto routeDto) {
        Route route = MappingUtils.toRoute(routeDto);
        if (route != null) {
            if (routeRepository.save(route) != null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean delete(Long routeId) {
        Route route = routeRepository.findById(routeId).orElse(null);
        if (route != null) {
            route.setStatus(EnumActive.INACTIVE);
            if (routeRepository.save(route) != null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<RouteDto> findAll() {
        List<RouteDto> routeDtoList = null;
        List<Route> routeList = routeRepository.findAll();
        if (!routeList.isEmpty()) {
            routeDtoList = new ArrayList<>();
            for (Route route : routeList) {
                routeDtoList.add(MappingUtils.toRouteDto(route));
            }
        }
        return routeDtoList;
    }

    @Override
    public Boolean update(RouteDto routeDto) {
        Route route = MappingUtils.toRoute(routeDto);
        if(route != null){
            if(routeRepository.save(route) != null){
                return true;
            }
        }
        return false;
    }
}
