package fpt.edu.vn.service;

import fpt.edu.vn.DTO.BikeBrandDTO;
import fpt.edu.vn.DTO.RouteSlotDTO;

public interface BikeBrandServiceImpl {

	public boolean save(BikeBrandDTO bikeBrand);
	public BikeBrandDTO createBrand(BikeBrandDTO bikeBrand);
	public boolean updateBrand(BikeBrandDTO bikeBrand);
	public boolean deleteBrand(BikeBrandDTO bikeBrand);
}
