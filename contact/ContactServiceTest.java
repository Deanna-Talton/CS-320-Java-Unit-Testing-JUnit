package contact;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the Contact class.
 * These tests verify that the Contact requirements are enforced.
 */
public class ContactServiceTest {
	@Test
    void testAddContactWithUniqueId() {
        ContactService service = new ContactService();
        Contact contact = new Contact("1", "John", "Smith", "1234567890", "123 Main St");

        service.addContact(contact);

        // Verify the contact was added
        assertNotNull(service.getContact("1"));
        assertEquals("John", service.getContact("1").getFirstName());

        // Adding another contact with the same ID should fail
        Contact duplicate = new Contact("1", "Jane", "Doe", "0987654321", "456 Oak St");
        assertThrows(IllegalArgumentException.class, () -> service.addContact(duplicate));
    }

    @Test
    void testDeleteContactById() {
        ContactService service = new ContactService();
        Contact contact = new Contact("2", "John", "Smith", "1234567890", "123 Main St");

        service.addContact(contact);
        service.deleteContact("2");

        // Verify contact was removed
        assertNull(service.getContact("2"));

        // Deleting a non-existent contact should fail
        assertThrows(IllegalArgumentException.class, () -> service.deleteContact("2"));
    }

    @Test
    void testUpdateContactFieldsById() {
        ContactService service = new ContactService();
        Contact contact = new Contact("3", "John", "Smith", "1234567890", "123 Main St");

        service.addContact(contact);

        // Update fields
        service.updateFirstName("3", "Jane");
        service.updateLastName("3", "Doe");
        service.updatePhone("3", "0987654321");
        service.updateAddress("3", "456 Oak St");

        Contact updated = service.getContact("3");

        // Verify updates
        assertEquals("Jane", updated.getFirstName());
        assertEquals("Doe", updated.getLastName());
        assertEquals("0987654321", updated.getPhone());
        assertEquals("456 Oak St", updated.getAddress());

        // Updating a contact that does not exist should fail
        assertThrows(IllegalArgumentException.class,
                () -> service.updateFirstName("999", "Test"));

        // Invalid updates should fail due to Contact validation
        assertThrows(IllegalArgumentException.class,
                () -> service.updatePhone("3", "123"));
    }
    
    /**
     * Requirement Verification:
     * The contact service must delete contacts by contactId.
     * This test confirms the service handles an invalid (nonexistent) contactId appropriately.
     */
    @Test
    void deleteContact_nonexistentId_throwsException() {
        ContactService service = new ContactService();
        assertThrows(IllegalArgumentException.class, () -> service.deleteContact("nope"));
    }

}

