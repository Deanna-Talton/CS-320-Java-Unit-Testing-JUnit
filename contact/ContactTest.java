package contact;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the Contact class.
 * These tests verify that the Contact requirements are enforced.
 */
public class ContactTest {
	 @Test
	    void testCreateValidContact() {
	        // This should create successfully because all values meet requirements
	        Contact c = new Contact("12345", "John", "Smith", "1234567890", "123 Main St");

	        assertEquals("12345", c.getContactId());
	        assertEquals("John", c.getFirstName());
	        assertEquals("Smith", c.getLastName());
	        assertEquals("1234567890", c.getPhone());
	        assertEquals("123 Main St", c.getAddress());
	    }

	    // Requirement 1: contactId not null and <= 10 characters
	    @Test
	    void testContactIdCannotBeNull() {
	        assertThrows(IllegalArgumentException.class, () ->
	                new Contact(null, "John", "Smith", "1234567890", "123 Main St"));
	    }

	    @Test
	    void testContactIdCannotBeTooLong() {
	        assertThrows(IllegalArgumentException.class, () ->
	                new Contact("12345678901", "John", "Smith", "1234567890", "123 Main St"));
	    }

	    // Requirement 2: firstName not null and <= 10 characters
	    @Test
	    void testFirstNameCannotBeNull() {
	        assertThrows(IllegalArgumentException.class, () ->
	                new Contact("1", null, "Smith", "1234567890", "123 Main St"));
	    }

	    @Test
	    void testFirstNameCannotBeTooLong() {
	        assertThrows(IllegalArgumentException.class, () ->
	                new Contact("1", "ABCDEFGHIJK", "Smith", "1234567890", "123 Main St"));
	    }

	    // Requirement 3: lastName not null and <= 10 characters
	    @Test
	    void testLastNameCannotBeNull() {
	        assertThrows(IllegalArgumentException.class, () ->
	                new Contact("1", "John", null, "1234567890", "123 Main St"));
	    }

	    @Test
	    void testLastNameCannotBeTooLong() {
	        assertThrows(IllegalArgumentException.class, () ->
	                new Contact("1", "John", "ABCDEFGHIJK", "1234567890", "123 Main St"));
	    }

	    // Requirement 4: phone not null and exactly 10 digits
	    @Test
	    void testPhoneCannotBeNull() {
	        assertThrows(IllegalArgumentException.class, () ->
	                new Contact("1", "John", "Smith", null, "123 Main St"));
	    }

	    @Test
	    void testPhoneMustBeExactlyTenDigits() {
	        assertThrows(IllegalArgumentException.class, () ->
	                new Contact("1", "John", "Smith", "12345", "123 Main St"));
	    }

	    @Test
	    void testPhoneMustBeOnlyDigits() {
	        assertThrows(IllegalArgumentException.class, () ->
	                new Contact("1", "John", "Smith", "12345abcde", "123 Main St"));
	    }

	    // Requirement 5: address not null and <= 30 characters
	    @Test
	    void testAddressCannotBeNull() {
	        assertThrows(IllegalArgumentException.class, () ->
	                new Contact("1", "John", "Smith", "1234567890", null));
	    }

	    @Test
	    void testAddressCannotBeTooLong() {
	        assertThrows(IllegalArgumentException.class, () ->
	                new Contact("1", "John", "Smith", "1234567890",
	                        "1234567890123456789012345678901"));
	    }

	    // Requirement 1 also states contactId cannot be updated (we enforce this by design)
	    @Test
	    void testContactIdDoesNotChangeWhenUpdatingOtherFields() {
	        Contact c = new Contact("abc", "John", "Smith", "1234567890", "123 Main St");
	        c.setFirstName("Jane"); // allowed update
	        assertEquals("abc", c.getContactId()); // ID stays the same
	    }
	    
	    /**
	     * Requirement Verification:
	     * After a contact is created, first name updates must still obey validation rules.
	     * This test confirms an invalid first name update is rejected.
	     */
	    @Test
	    void updateFirstName_invalid_throwsException() {
	        Contact c = new Contact("123", "John", "Smith", "1234567890", "123 Main St");
	        assertThrows(IllegalArgumentException.class, () -> {
	            c.setFirstName(null);
	        });
	    }

	    /**
	     * Requirement Verification:
	     * Last name updates must still obey validation rules after creation.
	     * This test confirms an invalid last name update is rejected.
	     */
	    @Test
	    void updateLastName_invalid_throwsException() {
	        Contact c = new Contact("123", "John", "Smith", "1234567890", "123 Main St");
	        assertThrows(IllegalArgumentException.class, () -> {
	            c.setLastName(null);
	        });
	    }

	    /**
	     * Requirement Verification:
	     * Phone number updates must remain exactly 10 digits.
	     * This test confirms invalid phone updates are rejected.
	     */
	    @Test
	    void updatePhone_invalid_throwsException() {
	        Contact c = new Contact("123", "John", "Smith", "1234567890", "123 Main St");
	        assertThrows(IllegalArgumentException.class, () -> {
	            c.setPhone("123");
	        });
	    }

	    /**
	     * Requirement Verification:
	     * Address updates must still obey the 30 character limit.
	     * This test confirms invalid address updates are rejected.
	     */
	    @Test
	    void updateAddress_invalid_throwsException() {
	        Contact c = new Contact("123", "John", "Smith", "1234567890", "123 Main St");
	        assertThrows(IllegalArgumentException.class, () -> {
	            c.setAddress(null);
	        });
	    }
	    
	    /**
	     * Requirement Verification:
	     * Contact fields must be updatable with valid values.
	     * This test confirms the setter methods accept valid updates and apply them correctly.
	     */
	    @Test
	    void updateContactFields_validValues_success() {
	        Contact c = new Contact("123", "John", "Smith", "1234567890", "123 Main St");

	        // Valid updates (should not throw)
	        assertDoesNotThrow(() -> c.setFirstName("Jane"));
	        assertDoesNotThrow(() -> c.setLastName("Doe"));
	        assertDoesNotThrow(() -> c.setPhone("0987654321"));
	        assertDoesNotThrow(() -> c.setAddress("456 Oak Ave"));

	        // Confirm values were updated
	        assertEquals("Jane", c.getFirstName());
	        assertEquals("Doe", c.getLastName());
	        assertEquals("0987654321", c.getPhone());
	        assertEquals("456 Oak Ave", c.getAddress());
	    }


	}



