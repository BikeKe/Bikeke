package fpt.edu.vn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fpt.edu.vn.DTO.BikeBrandDTO;
import fpt.edu.vn.DTO.CustomerDTO;
import fpt.edu.vn.DTO.PaymentDTO;
import fpt.edu.vn.DTO.PaymentMethodDTO;
import fpt.edu.vn.convert.ConvertUtil;
import fpt.edu.vn.entity.BikeBrand;
import fpt.edu.vn.entity.Payment;
import fpt.edu.vn.entity.PaymentMethod;
import fpt.edu.vn.entity.Route;
import fpt.edu.vn.entity.Trip;
import fpt.edu.vn.repository.BikeBrandRepository;
import fpt.edu.vn.repository.PaymentMethodRepository;
import fpt.edu.vn.repository.PaymentRepository;
import fpt.edu.vn.repository.TripRepository;

@Service
public class PaymentService implements PaymentServiceImpl {

	@Autowired
	private PaymentRepository paymentRepository;

	@Autowired
	private PaymentMethodRepository paymentMethodRepository;

	@Autowired
	private TripRepository tripRepository;

	@Autowired
	private ConvertUtil convert;

	@Override
	public boolean save(PaymentDTO paymentDTO) {
		Payment p = new Payment();
		PaymentMethod paymentMethod = paymentMethodRepository.findById(paymentDTO.getPaymentMethodId()).get();
		Trip trip = tripRepository.findById(paymentDTO.getTripId()).get();
		p = convert.toPay(paymentDTO, trip, paymentMethod);
		if (paymentRepository.save(p).getId() != null) {
			return true;
		}
		return false;
	}

	@Override
	public PaymentDTO createPayment(PaymentDTO paymentDTO) {
		return paymentDTO;
	}

	@Override
	public boolean updatePayment(PaymentDTO paymentDTO) {
		Payment p = new Payment();
		PaymentMethod paymentMethod = paymentMethodRepository.findById(paymentDTO.getPaymentMethodId()).get();
		Trip trip = tripRepository.findById(paymentDTO.getTripId()).get();
		p = convert.toPay(paymentDTO, trip, paymentMethod);
		if (paymentRepository.save(p).getId() != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deletePayment(PaymentDTO paymentDTO) {
		Payment p = new Payment();
		PaymentMethod paymentMethod = paymentMethodRepository.findById(paymentDTO.getPaymentMethodId()).get();
		Trip trip = tripRepository.findById(paymentDTO.getTripId()).get();
		p = convert.toPay(paymentDTO, trip, paymentMethod);
		p.setStatus("Inactive");
		if (paymentRepository.save(p) != null) {
			return true;
		}
		return false;
	}

}
