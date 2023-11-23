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
public class Account implements Serializable {
	public Account() {
	}
	
	private int ID;
	
	private String email;
	
	private String username;
	
	private String password;
	
	private java.util.Date create;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setUsername(String value) {
		this.username = value;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setCreate(java.util.Date value) {
		this.create = value;
	}
	
	public java.util.Date getCreate() {
		return create;
	}
	
	public boolean login(int username, int password) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void create(int email, int username, int password) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void updateAccount(int account) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void deleteAccount() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void forgetPassword() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void changePassword() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
