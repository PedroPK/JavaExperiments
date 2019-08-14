package experiments.staticMethods;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SuperclassWithStaticMethodTest {

	@Test
	void testStaticMethod() {
		// Arrange 
		SuperclassWithStaticMethod superIsSub = 
			new SubclassOverridingStaticMethod();
		
		// Act
		int superclassResult = SuperclassWithStaticMethod.staticMethod();
		int subclassResult = SubclassOverridingStaticMethod.staticMethod();
		
		// Here, normally the result should be the Subclass behavior
		int superIsSubResult = superIsSub.staticMethod();
		
		// Assert
		assertNotEquals(subclassResult, superclassResult);
			// Tricky behavior here
		assertEquals(	subclassResult, superIsSubResult);
	}
	
}