package fpt.edu.vn.service;

import fpt.edu.vn.DTO.PaymentDTO;

public interface PaymentServiceImpl {

	public boolean save(PaymentDTO paymentDTO);

	public PaymentDTO createPayment(PaymentDTO paymentDTO);

	public boolean updatePayment(PaymentDTO paymentDTO);

	public boolean deletePayment(PaymentDTO paymentDTO);
}
