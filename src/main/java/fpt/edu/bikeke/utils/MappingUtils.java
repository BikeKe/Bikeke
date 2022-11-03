package fpt.edu.bikeke.utils;

import fpt.edu.bikeke.dto.*;
import fpt.edu.bikeke.entity.*;
import fpt.edu.bikeke.repository.RoleRepostiory;
import fpt.edu.bikeke.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MappingUtils {
    //    Role
    public static RoleDto toRoleDto(Role role) {
        if (role != null) {
            RoleDto roleDto = new RoleDto();
            roleDto.setId(role.getId());
            roleDto.setName(role.getName());
            roleDto.setStatus(role.getStatus());
            return roleDto;
        }
        return null;
    }

    //    Account
    public static Account toAccount(AccountDto accountDto, Role role) {
        Account account = new Account();
        account.setId(accountDto.getId());
        account.setEmail(accountDto.getEmail());
        account.setPassword(accountDto.getPassword());
        account.setPhone(accountDto.getPhone());
        account.setGender(accountDto.getGender());
        account.setImg(accountDto.getImg());
        account.setCreatedDate(accountDto.getCreatedDate());
        account.setStatus(accountDto.getStatus());
        account.setGender(accountDto.getGender());
        account.setRole(role);
        return account;
    }

    public static AccountDto toAccountDto(Account account) {
        if (account != null) {
            AccountDto accountDto = new AccountDto();
            accountDto.setId(account.getId());
            accountDto.setEmail(account.getEmail());
            accountDto.setPassword(account.getPassword());
            accountDto.setPhone(account.getPhone());
            accountDto.setRoleId(account.getRole().getId());
            accountDto.setImg(account.getImg());
            accountDto.setGender(account.getGender());
            accountDto.setName(account.getName());
            accountDto.setCreatedDate(account.getCreatedDate());
            accountDto.setStatus(account.getStatus());

            return accountDto;
        }
        return null;
    }

    //    Customer
    public static Customer toCustomer(CustomerDto customerDto, Account account) {
        if (customerDto != null) {
            Customer customer = new Customer();
            customer.setId(customerDto.getId());
            customer.setAccount(account);
            customer.setTotalTrip(customer.getTotalTrip());

            return customer;
        }
        return null;
    }

    //    Route
    public static Route toRoute(RouteDto routeDto) {
        if (routeDto != null) {
            Route route = new Route();
            route.setId(routeDto.getId());
            route.setPlaceFrom(routeDto.getPlaceFrom());
            route.setPlaceTo(routeDto.getPlaceTo());
            route.setDefaultCost(routeDto.getDefaultCost());
            route.setStatus(routeDto.getStatus());

            return route;
        }
        return null;
    }

    public static RouteDto toRouteDto(Route route) {
        if (route != null) {
            RouteDto routeDto = new RouteDto();
            routeDto.setId(route.getId());
            routeDto.setPlaceFrom(route.getPlaceFrom());
            routeDto.setPlaceTo(route.getPlaceTo());
            routeDto.setDefaultCost(route.getDefaultCost());
            routeDto.setStatus(route.getStatus());

            return routeDto;
        }
        return null;
    }

//    Station
    public static Station toStation(StationDto stationDto){
        if(stationDto != null){
            Station station = new Station();
            station.setId(stationDto.getId());
            station.setName(stationDto.getName());
            station.setAddress(stationDto.getAddress());
            station.setImg(stationDto.getImg());
            station.setLatitude(stationDto.getLatitude());
            station.setLongtitude(stationDto.getLongtitude());
            station.setStatus(stationDto.getStatus());

            return station;
        }
        return null;
    }

    public static StationDto toStationDto(Station station){
        if(station != null){
            StationDto stationDto = new StationDto();
            stationDto.setId(station.getId());
            stationDto.setName(station.getName());
            stationDto.setAddress(station.getAddress());
            stationDto.setImg(station.getImg());
            stationDto.setLatitude(station.getLatitude());
            stationDto.setLongtitude(station.getLongtitude());
            stationDto.setStatus(station.getStatus());

            return stationDto;
        }
        return null;
    }
}
