/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
public class CreateEcommerceevaDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(EcommerceevaPersistentManager.instance());
			EcommerceevaPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
