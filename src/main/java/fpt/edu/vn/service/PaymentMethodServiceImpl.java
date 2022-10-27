package fpt.edu.vn.service;

import fpt.edu.vn.DTO.PaymentMethodDTO;
public interface PaymentMethodServiceImpl {

	public boolean save(PaymentMethodDTO paymentMethodDTO);
	public PaymentMethodDTO createPaymentMethod(PaymentMethodDTO paymentMethodDTO);
	public boolean updatePaymentMethod(PaymentMethodDTO paymentMethodDTO);
	public boolean deletePaymentMethod(PaymentMethodDTO paymentMethodDTO);
}
