package fpt.edu.vn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fpt.edu.vn.DTO.BikeBrandDTO;
import fpt.edu.vn.DTO.CustomerDTO;
import fpt.edu.vn.convert.ConvertUtil;
import fpt.edu.vn.entity.BikeBrand;
import fpt.edu.vn.entity.Route;
import fpt.edu.vn.repository.BikeBrandRepository;

@Service
public class BikeBrandService implements BikeBrandServiceImpl {

	@Autowired
	private BikeBrandRepository bikeBrandRepository;

	@Autowired
	private ConvertUtil convert;

	@Override
	public boolean save(BikeBrandDTO bikeBrand) {
		BikeBrand brand = new BikeBrand();
		brand = convert.toBrand(bikeBrand);
		if (bikeBrandRepository.save(brand) != null) {
			return true;
		}
		return false;
	}

	@Override
	public BikeBrandDTO createBrand(BikeBrandDTO bikeBrand) {
		return bikeBrand;
	}

	@Override
	public boolean updateBrand(BikeBrandDTO bikeBrandDTO) {
		BikeBrand brand = new BikeBrand();
		brand = convert.toBrand(bikeBrandDTO);
		if (bikeBrandRepository.save(brand) != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteBrand(BikeBrandDTO bikeBrandDTO) {
		BikeBrand brand = new BikeBrand();
		brand = convert.toBrand(bikeBrandDTO);
		brand.setStatus("Inactive");
		brand = bikeBrandRepository.save(brand);
		if (bikeBrandRepository.save(brand) != null) {
			return true;
		}
		return false;
	}

}
