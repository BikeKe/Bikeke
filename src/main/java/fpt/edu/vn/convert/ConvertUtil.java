package fpt.edu.vn.convert;

import org.springframework.stereotype.Component;

import fpt.edu.vn.DTO.AccountDTO;
import fpt.edu.vn.DTO.BikeBrandDTO;
import fpt.edu.vn.DTO.CustomerDTO;
import fpt.edu.vn.DTO.CustomerRouteRateDTO;
import fpt.edu.vn.DTO.CustomerTripDTO;
import fpt.edu.vn.DTO.DriverDTO;
import fpt.edu.vn.DTO.DriverRouteRateDTO;
import fpt.edu.vn.DTO.DriverTripDTO;
import fpt.edu.vn.DTO.PaymentDTO;
import fpt.edu.vn.DTO.PaymentMethodDTO;
import fpt.edu.vn.DTO.RouteDTO;
import fpt.edu.vn.DTO.RouteSlotDTO;
import fpt.edu.vn.DTO.RouteStationDTO;
import fpt.edu.vn.DTO.StationDTO;
import fpt.edu.vn.DTO.TripDTO;
import fpt.edu.vn.DTO.TripStateDTO;
import fpt.edu.vn.DTO.VehicleTypeDTO;
import fpt.edu.vn.DTO.WalletDTO;
import fpt.edu.vn.entity.Account;
import fpt.edu.vn.entity.BikeBrand;
import fpt.edu.vn.entity.Customer;
import fpt.edu.vn.entity.CustomerRouteRate;
import fpt.edu.vn.entity.CustomerTrip;
import fpt.edu.vn.entity.Driver;
import fpt.edu.vn.entity.DriverRouteRate;
import fpt.edu.vn.entity.DriverTrip;
import fpt.edu.vn.entity.Payment;
import fpt.edu.vn.entity.PaymentMethod;
import fpt.edu.vn.entity.Role;
import fpt.edu.vn.entity.Route;
import fpt.edu.vn.entity.RouteSlot;
import fpt.edu.vn.entity.RouteStation;
import fpt.edu.vn.entity.Station;
import fpt.edu.vn.entity.Trip;
import fpt.edu.vn.entity.TripState;
import fpt.edu.vn.entity.VehicleType;
import fpt.edu.vn.entity.Wallet;

@Component
public class ConvertUtil {

	public Account toAccount(AccountDTO dto, Role role) {
		Account account = new Account();
		account.setId(dto.getId());
		account.setEmail(dto.getEmail());
		account.setPhone(dto.getPhone());
		account.setName(dto.getName());
		account.setImg(dto.getImg());
		account.setGender(dto.getGender());
		account.setPassword(dto.getPassword());
		account.setRole(role);
		account.setCreatedDate(dto.getCreatedDate());
		return account;
	}

	public AccountDTO toDTO(Account account, Role role) {
		AccountDTO dto = new AccountDTO();
		dto.setEmail(account.getEmail());
		dto.setPhone(account.getPhone());
		dto.setName(account.getName());
		dto.setImg(account.getImg());
		dto.setGender(account.getGender());
		dto.setPassword(account.getPassword());
		dto.setCreatedDate(account.getCreatedDate());
		return dto;
	}

	public Customer toCustomer(CustomerDTO dto, Account account) {
		Customer customer = new Customer();
		customer.setId(dto.getId());
		customer.setTotalTrip(dto.getTotalTrip());
		customer.setAccount(account);
		customer.setStatus(dto.getStatus());
		return customer;
	}

	public CustomerDTO toDTO(Customer customer, Account account) {
		CustomerDTO dto = new CustomerDTO();
		dto.setTotalTrip(customer.getTotalTrip());
		dto.setStatus(customer.getStatus());
		return dto;
	}

//-----------------------------------------------------driver------------------------------------------------
	public Driver toDriver(DriverDTO dto, Account account) {
		Driver driver = new Driver();
		driver.setId(dto.getId());
		driver.setAccount(account);
		driver.setIdNumber(dto.getIdNumber());
		driver.setIdImg(dto.getIdImg());
		driver.setStatus(dto.getStatus());
		return driver;
	}

	public DriverDTO toDTO(Driver driver) {
		DriverDTO dto = new DriverDTO();
//		driver.setAccountId(dto.getAccountId());
		dto.setIdNumber(driver.getIdNumber());
		dto.setIdImg(driver.getIdImg());
		dto.setStatus(driver.getStatus());
		return dto;
	}

//	---------------------------------------------route----------------------------------------
	public Route toRoute(RouteDTO dto) {
		Route route = new Route();
		route.setId(dto.getId());
		route.setPlaceFrom(dto.getPlaceFrom());
		route.setPlaceTo(dto.getPlaceTo());
		route.setDefaultCost(dto.getDefaultCost());
		route.setStatus(dto.getStatus());
		return route;
	}

	public RouteDTO toDTO(Route route) {
		RouteDTO dto = new RouteDTO();
		dto.setPlaceFrom(route.getPlaceFrom());
		dto.setPlaceTo(route.getPlaceTo());
		dto.setDefaultCost(route.getDefaultCost());
		dto.setStatus(route.getStatus());
		return dto;
	}

//	--------------------------------------------routeSlot----------------------------------------
	public RouteSlot toRouteSlot(RouteSlotDTO dto, Route route) {
		RouteSlot routeSlot = new RouteSlot();
		routeSlot.setId(dto.getId());
		routeSlot.setName(dto.getName());
		routeSlot.setRoute(route);
		routeSlot.setTimeBegin(dto.getTimeBegin());
		routeSlot.setTimeEnd(dto.getTimeEnd());
		routeSlot.setStatus(dto.getStatus());
		return routeSlot;
	}

	public RouteSlotDTO toDTO(RouteSlot routeSlot, Route route) {
		RouteSlotDTO dto = new RouteSlotDTO();
		dto.setName(routeSlot.getName());
//		dto.setRouteId(route);
		dto.setTimeBegin(routeSlot.getTimeBegin());
		dto.setTimeEnd(routeSlot.getTimeEnd());
		dto.setStatus(routeSlot.getStatus());
		return dto;
	}

//------------------------------------------------------brand----------------------------------------------
	public BikeBrand toBrand(BikeBrandDTO dto) {
		BikeBrand brand = new BikeBrand();
		brand.setId(dto.getId());
		brand.setName(dto.getName());
		brand.setStatus(dto.getStatus());
		return brand;
	}

	public BikeBrandDTO toDTO(BikeBrand bikeBrand) {
		BikeBrandDTO dto = new BikeBrandDTO();
		dto.setName(bikeBrand.getName());
		dto.setStatus(bikeBrand.getStatus());
		return dto;
	}

//	-------------------------------------------station------------------------------------------------
	public Station toStation(StationDTO dto) {
		Station station = new Station();
		station.setId(dto.getId());
		station.setName(dto.getName());
		station.setAddress(dto.getName());
		station.setImg(dto.getImg());
		station.setLatitude(dto.getLatitude());
		station.setLongtitude(dto.getLongtitude());
		station.setStatus(dto.getStatus());
		return station;
	}

	public StationDTO toDTO(Station station) {
		StationDTO dto = new StationDTO();
		dto.setName(station.getName());
		dto.setAddress(station.getName());
		dto.setImg(station.getImg());
		dto.setLatitude(station.getLatitude());
		dto.setLongtitude(station.getLongtitude());
		dto.setStatus(station.getStatus());
		return dto;
	}

//------------------------------------------vehicle------------------------------------------------
	public VehicleType toVehicle(VehicleTypeDTO dto) {
		VehicleType v = new VehicleType();
		v.setId(dto.getId());
		v.setName(dto.getName());
		v.setStatus(dto.getStatus());
		return v;
	}

	public VehicleTypeDTO toDTO(VehicleType v) {
		VehicleTypeDTO dto = new VehicleTypeDTO();
		dto.setName(v.getName());
		dto.setStatus(v.getStatus());
		return dto;
	}

//	------------------------------------routeStation---------------------------------
	public RouteStation toRouteStation(RouteStationDTO dto, Route route, Station station) {
		RouteStation routeStation = new RouteStation();
		routeStation.setId(dto.getId());
		routeStation.setRoute(route);
		routeStation.setStation(station);
		routeStation.setPreviousStationDistance(dto.getPreviousStationDistance());
		routeStation.setOrderIndex(dto.getOrderIndex());
		routeStation.setStatus(dto.getStatus());
		return routeStation;
	}

	public RouteStationDTO toDTO(RouteStation routeStation, Route route, Station station) {
		RouteStationDTO dto = new RouteStationDTO();
		dto.setPreviousStationDistance(routeStation.getPreviousStationDistance());
		dto.setOrderIndex(routeStation.getOrderIndex());
		dto.setStatus(routeStation.getStatus());
		return dto;
	}

//	---------------------------------Wallet----------------------------------

	public Wallet toWallet(WalletDTO dto, Account account) {
		Wallet wallet = new Wallet();
		wallet.setId(dto.getId());
		wallet.setAccount(account);
		wallet.setBalance(dto.getBalance());
		wallet.setCurrency(dto.getCurrency());
		wallet.setStatus(dto.getStatus());
		wallet.setCreatedDate(dto.getCreatedDate());
		return wallet;
	}

	public WalletDTO toDTO(Wallet wallet, Account account) {
		WalletDTO dto = new WalletDTO();
		dto.setBalance(wallet.getBalance());
		dto.setCurrency(wallet.getCurrency());
		dto.setStatus(wallet.getStatus());
		dto.setCreatedDate(wallet.getCreatedDate());
		return dto;
	}

//	-------------------------------------customer rate----------------------------

	public CustomerRouteRate toCusRate(CustomerRouteRateDTO dto, Customer customer, Route route) {
		CustomerRouteRate cusRate = new CustomerRouteRate();
		cusRate.setId(dto.getId());
		cusRate.setCustomer(customer);
		cusRate.setRoute(route);
		cusRate.setTotalTrip(dto.getTotalTrip());
		return cusRate;
	}

	public CustomerRouteRateDTO toDTO(CustomerRouteRate cusRate, Customer customer, Route route) {
		CustomerRouteRateDTO dto = new CustomerRouteRateDTO();
		dto.setTotalTrip(cusRate.getTotalTrip());
		return dto;
	}

//	----------------------------------------customerTrip-----------------------------------------
	public CustomerTrip toCusTrip(CustomerTripDTO dto, Customer customer, RouteSlot routeSlot, Station staion,
			PaymentMethod pay) {
		CustomerTrip cusTrip = new CustomerTrip();
		cusTrip.setId(dto.getId());
		cusTrip.setCustomer(customer);
		cusTrip.setRouteSlot(routeSlot);
		cusTrip.setPickupStation(staion);
		cusTrip.setHeadtoStation(staion);
		cusTrip.setAmount(dto.getAmount());
		cusTrip.setPaymentMethod(pay);
		cusTrip.setCreatedDate(dto.getCreatedDate());
		cusTrip.setStatus(dto.getStatus());
		return cusTrip;
	}

	public CustomerTripDTO toDTO(CustomerTrip cusTrip, Customer customer, RouteSlot routeSlot, Station staion,
			PaymentMethod pay) {
		CustomerTripDTO dto = new CustomerTripDTO();
		dto.setAmount(cusTrip.getAmount());
		dto.setCreatedDate(cusTrip.getCreatedDate());
		dto.setStatus(cusTrip.getStatus());
		return dto;
	}

//	---------------------------------driverRate---------------------------------------

	public DriverRouteRate toDriverRate(DriverRouteRateDTO dto, Driver driver, Route route) {
		DriverRouteRate driverRate = new DriverRouteRate();
		driverRate.setId(dto.getId());
		driverRate.setDriver(driver);
		driverRate.setRoute(route);
		driverRate.setTotalTrip(dto.getTotalTrip());
		return driverRate;
	}

	public DriverRouteRateDTO toDTO(DriverRouteRate driverRate, Driver driver, Route route) {
		DriverRouteRateDTO dto = new DriverRouteRateDTO();
		dto.setTotalTrip(driverRate.getTotalTrip());
		return dto;
	}

//	---------------------------------driverTrip--------------------------------------
	public DriverTrip toDriverTrip(DriverTripDTO dto, RouteSlot routeSlot) {
		DriverTrip driveTrip = new DriverTrip();
		driveTrip.setId(dto.getId());
		driveTrip.setRouteSlot(routeSlot);
		driveTrip.setCreatedDate(dto.getCreatedDate());
		driveTrip.setStatus(dto.getStatus());
		return driveTrip;
	}

	public DriverTripDTO toDTO(DriverTrip driveTrip, RouteSlot routeSlot) {
		DriverTripDTO dto = new DriverTripDTO();
		dto.setCreatedDate(driveTrip.getCreatedDate());
		dto.setStatus(driveTrip.getStatus());
		return dto;
	}

//--------------------------------------trip-----------------------------------
	public Trip toTrip(TripDTO dto, CustomerTrip customerTrip, DriverTrip driverTrip) {
		Trip trip = new Trip();
		trip.setId(dto.getId());
		trip.setCustomerTrip(customerTrip);
		trip.setDriverTrip(driverTrip);
		trip.setAmount(dto.getAmount());
		trip.setDriverComment(dto.getDriverComment());
		trip.setDriverRate(dto.getDriverRate());
		trip.setCustomerComment(dto.getCustomerComment());
		trip.setCustomerRate(dto.getCustomerRate());
		trip.setCreatedDate(dto.getCreatedDate());
		trip.setPickedUpTime(dto.getPickedUpTime());
		trip.setArrivedTime(dto.getArrivedTime());
		trip.setStatus(dto.getStatus());
		return trip;

	}

	public TripDTO toDTO(Trip trip, CustomerTrip customerTrip, DriverTrip driverTrip) {
		TripDTO dto = new TripDTO();
		dto.setAmount(trip.getAmount());
		dto.setDriverComment(trip.getDriverComment());
		dto.setDriverRate(trip.getDriverRate());
		dto.setCustomerComment(trip.getCustomerComment());
		dto.setCustomerRate(trip.getCustomerRate());
		dto.setCreatedDate(trip.getCreatedDate());
		dto.setPickedUpTime(trip.getPickedUpTime());
		dto.setArrivedTime(trip.getArrivedTime());
		dto.setStatus(trip.getStatus());
		return dto;
	}

//	-------------------------------------tripSate---------------------------------

	public TripState toTrip(TripStateDTO dto, Trip trip, Account account) {
		TripState tripState = new TripState();
		tripState.setId(dto.getId());
		tripState.setTrip(trip);
		tripState.setCreatedDate(dto.getCreatedDate());
		tripState.setStateFrom(dto.getStateFrom());
		tripState.setStateTo(dto.getStateTo());
		tripState.setAccount(account);
		return tripState;

	}

	public TripStateDTO toDTO(TripState tripState, Trip trip, Account account) {
		TripStateDTO dto = new TripStateDTO();
		dto.setCreatedDate(tripState.getCreatedDate());
		dto.setStateFrom(tripState.getStateFrom());
		dto.setStateTo(tripState.getStateTo());
		return dto;
	}

//	-----------------------------------paymentMethod----------------------------------------
	public PaymentMethod toMethod(PaymentMethodDTO dto) {
		PaymentMethod p = new PaymentMethod();
		p.setId(dto.getId());
		p.setName(dto.getName());
		p.setStatus(dto.getStatus());
		return p;
	}

	public PaymentMethodDTO toDTO(PaymentMethod paymentMethod) {
		PaymentMethodDTO dto = new PaymentMethodDTO();
		dto.setName(paymentMethod.getName());
		dto.setStatus(paymentMethod.getStatus());
		return dto;
	}

//	---------------------------------payment----------------------------------
	public Payment toPay(PaymentDTO dto, Trip trip, PaymentMethod paymentMethod) {
		Payment p = new Payment();
		p.setId(dto.getId());
		p.setTrip(trip);
		p.setAmount(dto.getAmount());
		p.setPaymentMethod(paymentMethod);
		p.setPaymentCode(dto.getPaymentCode());
		p.setCreatedDate(dto.getCreatedDate());
		p.setStatus(dto.getStatus());
		return p;
	}

	public PaymentDTO toDTO(Payment payment) {
		PaymentDTO dto = new PaymentDTO();
		dto.setAmount(payment.getAmount());
		dto.setPaymentCode(payment.getPaymentCode());
		dto.setCreatedDate(payment.getCreatedDate());
		dto.setStatus(payment.getStatus());
		return dto;
	}

}
