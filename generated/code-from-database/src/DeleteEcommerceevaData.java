/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
public class DeleteEcommerceevaData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = EcommerceevaPersistentManager.instance().getSession().beginTransaction();
		try {
			Account account = AccountDAO.loadAccountByQuery(null, null);
			// Delete the persistent object
			AccountDAO.delete(account);
			Book book = BookDAO.loadBookByQuery(null, null);
			// Delete the persistent object
			BookDAO.delete(book);
			Orders orders = OrdersDAO.loadOrdersByQuery(null, null);
			// Delete the persistent object
			OrdersDAO.delete(orders);
			Cart cart = CartDAO.loadCartByQuery(null, null);
			// Delete the persistent object
			CartDAO.delete(cart);
			Payment payment = PaymentDAO.loadPaymentByQuery(null, null);
			// Delete the persistent object
			PaymentDAO.delete(payment);
			Shipment shipment = ShipmentDAO.loadShipmentByQuery(null, null);
			// Delete the persistent object
			ShipmentDAO.delete(shipment);
			Customer customer = CustomerDAO.loadCustomerByQuery(null, null);
			// Delete the persistent object
			CustomerDAO.delete(customer);
			Authors authors = AuthorsDAO.loadAuthorsByQuery(null, null);
			// Delete the persistent object
			AuthorsDAO.delete(authors);
			PaymentByCard paymentByCard = PaymentByCardDAO.loadPaymentByCardByQuery(null, null);
			// Delete the persistent object
			PaymentByCardDAO.delete(paymentByCard);
			PaymentCOD paymentCOD = PaymentCODDAO.loadPaymentCODByQuery(null, null);
			// Delete the persistent object
			PaymentCODDAO.delete(paymentCOD);
			Cloth cloth = ClothDAO.loadClothByQuery(null, null);
			// Delete the persistent object
			ClothDAO.delete(cloth);
			ClothBrand clothBrand = ClothBrandDAO.loadClothBrandByQuery(null, null);
			// Delete the persistent object
			ClothBrandDAO.delete(clothBrand);
			MobilePhoneBrand mobilePhoneBrand = MobilePhoneBrandDAO.loadMobilePhoneBrandByQuery(null, null);
			// Delete the persistent object
			MobilePhoneBrandDAO.delete(mobilePhoneBrand);
			MobilePhone mobilePhone = MobilePhoneDAO.loadMobilePhoneByQuery(null, null);
			// Delete the persistent object
			MobilePhoneDAO.delete(mobilePhone);
			OrderEntry orderEntry = OrderEntryDAO.loadOrderEntryByQuery(null, null);
			// Delete the persistent object
			OrderEntryDAO.delete(orderEntry);
			CartEntry cartEntry = CartEntryDAO.loadCartEntryByQuery(null, null);
			// Delete the persistent object
			CartEntryDAO.delete(cartEntry);
			Address address = AddressDAO.loadAddressByQuery(null, null);
			// Delete the persistent object
			AddressDAO.delete(address);
			OrderAddress orderAddress = OrderAddressDAO.loadOrderAddressByQuery(null, null);
			// Delete the persistent object
			OrderAddressDAO.delete(orderAddress);
			Admin admin = AdminDAO.loadAdminByQuery(null, null);
			// Delete the persistent object
			AdminDAO.delete(admin);
			ClothCategory clothCategory = ClothCategoryDAO.loadClothCategoryByQuery(null, null);
			// Delete the persistent object
			ClothCategoryDAO.delete(clothCategory);
			BookCategory bookCategory = BookCategoryDAO.loadBookCategoryByQuery(null, null);
			// Delete the persistent object
			BookCategoryDAO.delete(bookCategory);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteEcommerceevaData deleteEcommerceevaData = new DeleteEcommerceevaData();
			try {
				deleteEcommerceevaData.deleteTestData();
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
