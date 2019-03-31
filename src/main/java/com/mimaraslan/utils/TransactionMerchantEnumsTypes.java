package com.mimaraslan.utils;

public class TransactionMerchantEnumsTypes{

	public enum Status {APPROVED, WAITING, DECLINED, ERROR}
	public enum Operation {DIRECT, REFUND, _3D, _3DAUTH, STORED }
	public enum PaymentMethod {CREDITCARD, CUP, IDEAL, GIROPAY, MISTERCASH, STORED, PAYTOCARD, CEPBANK, CITADEL}
	public enum ErrorCode {DoNotHonor, InvalidTransaction, InvalidCard, NotSuffiCientFunds, IncorrectPIN, InvalidCountryAssociation, CurrencyNotAllowed, _3DSecureTransportError, TransactionNotPermittedtoCardholder}
	public enum FilterField {TransactionUUID, CustomerEmail, ReferenceNo, CustomData, CardPAN }

}