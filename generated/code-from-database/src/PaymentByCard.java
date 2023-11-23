/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
import java.io.Serializable;
public class PaymentByCard extends Payment implements Serializable {
	public PaymentByCard() {
	}
	
	private String cardNumber;
	
	private Integer bank;
	
	public void setCardNumber(String value) {
		this.cardNumber = value;
	}
	
	public String getCardNumber() {
		return cardNumber;
	}
	
	public void setBank(int value) {
		setBank(Integer.valueOf(value));
	}
	
	public void setBank(Integer value) {
		this.bank = value;
	}
	
	public Integer getBank() {
		return bank;
	}
	
	public void verify() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void purchase() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return super.toString();
	}
	
}
