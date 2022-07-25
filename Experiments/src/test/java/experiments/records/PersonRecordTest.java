package experiments.records;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonRecordTest {

	@Test
	void testGetters() {
		// Arrange
		String name = "My name is Slim Shady";
		String address = "8 Mile";
		
		// Act
		PersonRecord personOne = new PersonRecord(name, address);
		
		String nome			= personOne.name();
		String endereco		= personOne.address();
		
		// Assert
		assertEquals(name, nome);
		assertEquals(address, endereco);
	}
	
	@Test
	void testEquals() {
		// Arrange
		String name = "My name is Slim Shady";
		String address = "8 Mile";
		
		// Act
		PersonRecord personOne = new PersonRecord(name, address);
		PersonRecord personTwo = new PersonRecord(name, address);
		
		int hashOne = personOne.hashCode();
		int hashTwo = personTwo.hashCode();
		
		// Assert
		assertEquals(personOne, personTwo);
		assertTrue(personOne.equals(personTwo));
		assertEquals(hashOne, hashTwo);
	}
	
	@Test
	void testToString() {
		// Arrange
		String name = "My name is Slim Shady";
		String address = "8 Mile";
		
		// Act
		PersonRecord personOne = new PersonRecord(name, address);
		
		String one = personOne.toString();
		
		
		// Assert
		assertNotNull(one);
		assertFalse(one.isEmpty());
		assertFalse(one.isBlank());
	}
	
	@Test
	void testHashCode() {
		// Arrange
		String name = "My name is Slim Shady";
		String address = "8 Mile";
		
		// Act
		PersonRecord personOne = new PersonRecord(name, address);
		
		int hashCode = personOne.hashCode();
		
		
		// Assert
		assertTrue(hashCode > 0);
		assertTrue(hashCode > 1);
	}
	
}
