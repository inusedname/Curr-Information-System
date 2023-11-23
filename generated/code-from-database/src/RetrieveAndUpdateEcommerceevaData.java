/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
public class RetrieveAndUpdateEcommerceevaData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = EcommerceevaPersistentManager.instance().getSession().beginTransaction();
		try {
			Account account = AccountDAO.loadAccountByQuery(null, null);
			// Update the properties of the persistent object
			AccountDAO.save(account);
			Book book = BookDAO.loadBookByQuery(null, null);
			// Update the properties of the persistent object
			BookDAO.save(book);
			Orders orders = OrdersDAO.loadOrdersByQuery(null, null);
			// Update the properties of the persistent object
			OrdersDAO.save(orders);
			Cart cart = CartDAO.loadCartByQuery(null, null);
			// Update the properties of the persistent object
			CartDAO.save(cart);
			Payment payment = PaymentDAO.loadPaymentByQuery(null, null);
			// Update the properties of the persistent object
			PaymentDAO.save(payment);
			Shipment shipment = ShipmentDAO.loadShipmentByQuery(null, null);
			// Update the properties of the persistent object
			ShipmentDAO.save(shipment);
			Customer customer = CustomerDAO.loadCustomerByQuery(null, null);
			// Update the properties of the persistent object
			CustomerDAO.save(customer);
			Authors authors = AuthorsDAO.loadAuthorsByQuery(null, null);
			// Update the properties of the persistent object
			AuthorsDAO.save(authors);
			PaymentByCard paymentByCard = PaymentByCardDAO.loadPaymentByCardByQuery(null, null);
			// Update the properties of the persistent object
			PaymentByCardDAO.save(paymentByCard);
			PaymentCOD paymentCOD = PaymentCODDAO.loadPaymentCODByQuery(null, null);
			// Update the properties of the persistent object
			PaymentCODDAO.save(paymentCOD);
			Cloth cloth = ClothDAO.loadClothByQuery(null, null);
			// Update the properties of the persistent object
			ClothDAO.save(cloth);
			ClothBrand clothBrand = ClothBrandDAO.loadClothBrandByQuery(null, null);
			// Update the properties of the persistent object
			ClothBrandDAO.save(clothBrand);
			MobilePhoneBrand mobilePhoneBrand = MobilePhoneBrandDAO.loadMobilePhoneBrandByQuery(null, null);
			// Update the properties of the persistent object
			MobilePhoneBrandDAO.save(mobilePhoneBrand);
			MobilePhone mobilePhone = MobilePhoneDAO.loadMobilePhoneByQuery(null, null);
			// Update the properties of the persistent object
			MobilePhoneDAO.save(mobilePhone);
			OrderEntry orderEntry = OrderEntryDAO.loadOrderEntryByQuery(null, null);
			// Update the properties of the persistent object
			OrderEntryDAO.save(orderEntry);
			CartEntry cartEntry = CartEntryDAO.loadCartEntryByQuery(null, null);
			// Update the properties of the persistent object
			CartEntryDAO.save(cartEntry);
			Address address = AddressDAO.loadAddressByQuery(null, null);
			// Update the properties of the persistent object
			AddressDAO.save(address);
			OrderAddress orderAddress = OrderAddressDAO.loadOrderAddressByQuery(null, null);
			// Update the properties of the persistent object
			OrderAddressDAO.save(orderAddress);
			Admin admin = AdminDAO.loadAdminByQuery(null, null);
			// Update the properties of the persistent object
			AdminDAO.save(admin);
			ClothCategory clothCategory = ClothCategoryDAO.loadClothCategoryByQuery(null, null);
			// Update the properties of the persistent object
			ClothCategoryDAO.save(clothCategory);
			BookCategory bookCategory = BookCategoryDAO.loadBookCategoryByQuery(null, null);
			// Update the properties of the persistent object
			BookCategoryDAO.save(bookCategory);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateEcommerceevaData retrieveAndUpdateEcommerceevaData = new RetrieveAndUpdateEcommerceevaData();
			try {
				retrieveAndUpdateEcommerceevaData.retrieveAndUpdateTestData();
			}
			finally {
				EcommerceevaPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
