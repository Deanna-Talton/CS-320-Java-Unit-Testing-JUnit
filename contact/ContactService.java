package contact;
import java.util.HashMap;
import java.util.Map;

/**
 * The ContactService class manages Contact objects.
 * It allows adding, deleting, and updating contacts using a unique contact ID.
 */
public class ContactService {
	// In-memory storage for contacts (no database required)
    private final Map<String, Contact> contacts = new HashMap<>();

    /**
     * Adds a new contact to the service.
     * The contact ID must be unique.
     */
    public void addContact(Contact contact) {
        if (contact == null) {
            throw new IllegalArgumentException("Contact cannot be null");
        }

        if (contacts.containsKey(contact.getContactId())) {
            throw new IllegalArgumentException("Duplicate contactId");
        }

        contacts.put(contact.getContactId(), contact);
    }

    /**
     * Deletes a contact based on the contact ID.
     */
    public void deleteContact(String contactId) {
        if (!contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact not found");
        }

        contacts.remove(contactId);
    }

    /**
     * Updates the first name of a contact.
     */
    public void updateFirstName(String contactId, String firstName) {
        if (!contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact not found");
        }

        contacts.get(contactId).setFirstName(firstName);
    }

    /**
     * Updates the last name of a contact.
     */
    public void updateLastName(String contactId, String lastName) {
        if (!contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact not found");
        }

        contacts.get(contactId).setLastName(lastName);
    }

    /**
     * Updates the phone number of a contact.
     */
    public void updatePhone(String contactId, String phone) {
        if (!contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact not found");
        }

        contacts.get(contactId).setPhone(phone);
    }

    /**
     * Updates the address of a contact.
     */
    public void updateAddress(String contactId, String address) {
        if (!contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact not found");
        }

        contacts.get(contactId).setAddress(address);
    }

    /**
     * Returns a contact based on contact ID.
     * This method is mainly used for testing.
     */
    public Contact getContact(String contactId) {
        return contacts.get(contactId);
    }
}




