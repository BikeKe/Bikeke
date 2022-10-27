package fpt.edu.vn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fpt.edu.vn.DTO.BikeBrandDTO;
import fpt.edu.vn.DTO.CustomerDTO;
import fpt.edu.vn.DTO.PaymentMethodDTO;
import fpt.edu.vn.convert.ConvertUtil;
import fpt.edu.vn.entity.BikeBrand;
import fpt.edu.vn.entity.PaymentMethod;
import fpt.edu.vn.entity.Route;
import fpt.edu.vn.repository.BikeBrandRepository;
import fpt.edu.vn.repository.PaymentMethodRepository;

@Service
public class PaymentMethodService implements PaymentMethodServiceImpl {

	@Autowired
	private PaymentMethodRepository paymentMethodRepository;

	@Autowired
	private ConvertUtil convert;

	@Override
	public boolean save(PaymentMethodDTO paymentMethodDTO) {
		PaymentMethod p = new PaymentMethod();
		p = convert.toMethod(paymentMethodDTO);
		if (paymentMethodRepository.save(p) != null) {
			return true;
		}
		return false;
	}

	@Override
	public PaymentMethodDTO createPaymentMethod(PaymentMethodDTO paymentMethodDTO) {

		return paymentMethodDTO;
	}

	@Override
	public boolean updatePaymentMethod(PaymentMethodDTO paymentMethodDTO) {
		PaymentMethod p = new PaymentMethod();
		p = convert.toMethod(paymentMethodDTO);
		if (paymentMethodRepository.save(p) != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deletePaymentMethod(PaymentMethodDTO paymentMethodDTO) {
		PaymentMethod p = new PaymentMethod();
		p = convert.toMethod(paymentMethodDTO);
		p.setStatus("Inactive");
		if (paymentMethodRepository.save(p) != null) {
			return true;
		}
		return false;
	}

}
