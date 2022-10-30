package fpt.edu.bikeke.service;

import fpt.edu.bikeke.dto.StationDto;
import fpt.edu.bikeke.entity.Station;
import fpt.edu.bikeke.enums.EnumActive;
import fpt.edu.bikeke.page.PageStation;
import fpt.edu.bikeke.repository.StationRepository;
import fpt.edu.bikeke.utils.MappingUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StationService implements IStationService {
    @Autowired
    private StationRepository stationRepository;

    @Override
    public Boolean create(StationDto stationDto) {
        Station station = MappingUtils.toStation(stationDto);
        if (station != null) {
            if (stationRepository.save(station) != null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean update(StationDto stationDto) {
        Station station = MappingUtils.toStation(stationDto);
        if (station != null) {
            if (stationRepository.save(station) != null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean delete(Long stationId) {
        Station station = stationRepository.findById(stationId).orElse(null);
        if (station == null) {
            station.setStatus(EnumActive.INACTIVE);
            if (stationRepository.save(station) != null)
                return true;
        }
        return false;
    }

    @Override
    public PageStation findAll(int page) {
        Page<Station> stationPage = stationRepository.findAll(PageRequest.of(page, 10));
        if (!stationPage.getContent().isEmpty()) {
            List<StationDto> stationDtoList = new ArrayList<>();
            for (Station station : stationPage.getContent()) {
                stationDtoList.add(MappingUtils.toStationDto(station));
            }
            return new PageStation(stationPage.getSize(), stationPage.getTotalElements(), stationPage.getTotalPages(), stationDtoList);
        }
        return null;
    }
}
