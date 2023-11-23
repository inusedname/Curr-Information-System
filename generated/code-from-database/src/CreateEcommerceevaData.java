/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
public class CreateEcommerceevaData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = EcommerceevaPersistentManager.instance().getSession().beginTransaction();
		try {
			Account account = AccountDAO.createAccount();
			// Initialize the properties of the persistent object here
			AccountDAO.save(account);
			Book book = BookDAO.createBook();
			// Initialize the properties of the persistent object here
			BookDAO.save(book);
			Orders orders = OrdersDAO.createOrders();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : payment, orderEntrys, shipment, cartFee, ID, customer
			OrdersDAO.save(orders);
			Cart cart = CartDAO.createCart();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cartEntrys, customer
			CartDAO.save(cart);
			Payment payment = PaymentDAO.createPayment();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : productFee, shipFee, orders
			PaymentDAO.save(payment);
			Shipment shipment = ShipmentDAO.createShipment();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : orderAddress, isRabbit, order
			ShipmentDAO.save(shipment);
			Customer customer = CustomerDAO.createCustomer();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : address, order, cart
			CustomerDAO.save(customer);
			Authors authors = AuthorsDAO.createAuthors();
			// Initialize the properties of the persistent object here
			AuthorsDAO.save(authors);
			PaymentByCard paymentByCard = PaymentByCardDAO.createPaymentByCard();
			// Initialize the properties of the persistent object here
			PaymentByCardDAO.save(paymentByCard);
			PaymentCOD paymentCOD = PaymentCODDAO.createPaymentCOD();
			// Initialize the properties of the persistent object here
			PaymentCODDAO.save(paymentCOD);
			Cloth cloth = ClothDAO.createCloth();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : brand
			ClothDAO.save(cloth);
			ClothBrand clothBrand = ClothBrandDAO.createClothBrand();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cloth
			ClothBrandDAO.save(clothBrand);
			MobilePhoneBrand mobilePhoneBrand = MobilePhoneBrandDAO.createMobilePhoneBrand();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : phone
			MobilePhoneBrandDAO.save(mobilePhoneBrand);
			MobilePhone mobilePhone = MobilePhoneDAO.createMobilePhone();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : brand
			MobilePhoneDAO.save(mobilePhone);
			OrderEntry orderEntry = OrderEntryDAO.createOrderEntry();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : orders, product, quantity, ID
			OrderEntryDAO.save(orderEntry);
			CartEntry cartEntry = CartEntryDAO.createCartEntry();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : product, cart, quantity
			CartEntryDAO.save(cartEntry);
			Address address = AddressDAO.createAddress();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : customer
			AddressDAO.save(address);
			OrderAddress orderAddress = OrderAddressDAO.createOrderAddress();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : shipment
			OrderAddressDAO.save(orderAddress);
			Admin admin = AdminDAO.createAdmin();
			// Initialize the properties of the persistent object here
			AdminDAO.save(admin);
			ClothCategory clothCategory = ClothCategoryDAO.createClothCategory();
			// Initialize the properties of the persistent object here
			ClothCategoryDAO.save(clothCategory);
			BookCategory bookCategory = BookCategoryDAO.createBookCategory();
			// Initialize the properties of the persistent object here
			BookCategoryDAO.save(bookCategory);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateEcommerceevaData createEcommerceevaData = new CreateEcommerceevaData();
			try {
				createEcommerceevaData.createTestData();
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
