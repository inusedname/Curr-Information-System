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
public class MobilePhone extends Product implements Serializable {
	public MobilePhone() {
	}
	
	private String hardwareSpecs;
	
	private String ram;
	
	private String cpu;
	
	private String memory;
	
	private MobilePhoneBrand brand;
	
	public void setHardwareSpecs(String value) {
		this.hardwareSpecs = value;
	}
	
	public String getHardwareSpecs() {
		return hardwareSpecs;
	}
	
	public void setRam(String value) {
		this.ram = value;
	}
	
	public String getRam() {
		return ram;
	}
	
	public void setCpu(String value) {
		this.cpu = value;
	}
	
	public String getCpu() {
		return cpu;
	}
	
	public void setMemory(String value) {
		this.memory = value;
	}
	
	public String getMemory() {
		return memory;
	}
	
	public void setBrand(MobilePhoneBrand value) {
		if (this.brand != value) {
			MobilePhoneBrand lbrand = this.brand;
			this.brand = value;
			if (value != null) {
				brand.setPhone(this);
			}
			if (lbrand != null && lbrand.getPhone() == this) {
				lbrand.setPhone(null);
			}
		}
	}
	
	public MobilePhoneBrand getBrand() {
		return brand;
	}
	
	public void updateBrand() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return super.toString();
	}
	
}
