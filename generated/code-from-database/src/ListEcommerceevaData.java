/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
public class ListEcommerceevaData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Account...");
		Account[] accounts = AccountDAO.listAccountByQuery(null, null);
		int length = Math.min(accounts.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(accounts[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Book...");
		Book[] books = BookDAO.listBookByQuery(null, null);
		length = Math.min(books.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(books[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Orders...");
		Orders[] orderses = OrdersDAO.listOrdersByQuery(null, null);
		length = Math.min(orderses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(orderses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Cart...");
		Cart[] carts = CartDAO.listCartByQuery(null, null);
		length = Math.min(carts.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(carts[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Payment...");
		Payment[] payments = PaymentDAO.listPaymentByQuery(null, null);
		length = Math.min(payments.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(payments[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Shipment...");
		Shipment[] shipments = ShipmentDAO.listShipmentByQuery(null, null);
		length = Math.min(shipments.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(shipments[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Customer...");
		Customer[] customers = CustomerDAO.listCustomerByQuery(null, null);
		length = Math.min(customers.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(customers[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Authors...");
		Authors[] authorses = AuthorsDAO.listAuthorsByQuery(null, null);
		length = Math.min(authorses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(authorses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing PaymentByCard...");
		PaymentByCard[] paymentByCards = PaymentByCardDAO.listPaymentByCardByQuery(null, null);
		length = Math.min(paymentByCards.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(paymentByCards[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing PaymentCOD...");
		PaymentCOD[] paymentCODs = PaymentCODDAO.listPaymentCODByQuery(null, null);
		length = Math.min(paymentCODs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(paymentCODs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Cloth...");
		Cloth[] cloths = ClothDAO.listClothByQuery(null, null);
		length = Math.min(cloths.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(cloths[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ClothBrand...");
		ClothBrand[] clothBrands = ClothBrandDAO.listClothBrandByQuery(null, null);
		length = Math.min(clothBrands.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(clothBrands[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing MobilePhoneBrand...");
		MobilePhoneBrand[] mobilePhoneBrands = MobilePhoneBrandDAO.listMobilePhoneBrandByQuery(null, null);
		length = Math.min(mobilePhoneBrands.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(mobilePhoneBrands[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing MobilePhone...");
		MobilePhone[] mobilePhones = MobilePhoneDAO.listMobilePhoneByQuery(null, null);
		length = Math.min(mobilePhones.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(mobilePhones[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing OrderEntry...");
		OrderEntry[] orderEntrys = OrderEntryDAO.listOrderEntryByQuery(null, null);
		length = Math.min(orderEntrys.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(orderEntrys[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing CartEntry...");
		CartEntry[] cartEntrys = CartEntryDAO.listCartEntryByQuery(null, null);
		length = Math.min(cartEntrys.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(cartEntrys[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Address...");
		Address[] addresses = AddressDAO.listAddressByQuery(null, null);
		length = Math.min(addresses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(addresses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing OrderAddress...");
		OrderAddress[] orderAddresses = OrderAddressDAO.listOrderAddressByQuery(null, null);
		length = Math.min(orderAddresses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(orderAddresses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Admin...");
		Admin[] admins = AdminDAO.listAdminByQuery(null, null);
		length = Math.min(admins.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(admins[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ClothCategory...");
		ClothCategory[] clothCategorys = ClothCategoryDAO.listClothCategoryByQuery(null, null);
		length = Math.min(clothCategorys.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(clothCategorys[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing BookCategory...");
		BookCategory[] bookCategorys = BookCategoryDAO.listBookCategoryByQuery(null, null);
		length = Math.min(bookCategorys.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bookCategorys[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public static void main(String[] args) {
		try {
			ListEcommerceevaData listEcommerceevaData = new ListEcommerceevaData();
			try {
				listEcommerceevaData.listTestData();
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
