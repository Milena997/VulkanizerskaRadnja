package auto_radnja.gume;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AutoGumaTest {
	AutoGuma guma = new AutoGuma();

	@BeforeEach
	void setUp() throws Exception {
		guma = new AutoGuma();
	}

	@AfterEach
	void tearDown() throws Exception {
		guma = null;
	}

	@Test
	final void testAutoGuma() {
		guma = new AutoGuma();
		assertNotNull(guma);

	}

	@Test
	final void testAutoGumaStringIntIntInt() {
		guma = new AutoGuma("Pirelli", 15, 255, 50);
		assertNotNull(guma);
		assertEquals("Pirelli", guma.getMarkaModel());
		assertEquals(15, guma.getPrecnik());
		assertEquals(255, guma.getSirina());
		assertEquals(50, guma.getVisina());
	}

	@Test
	final void testSetMarkaModel() {
		guma.setMarkaModel("Tigar");
		assertEquals("Tigar", guma.getMarkaModel());
	}

	@Test
	@DisplayName("Testiramo da li je uneto null umesto marke modela")
	void testSetMarkaModelaNull() {
		assertThrows(java.lang.RuntimeException.class, () -> guma.setMarkaModel(null));
	}

	@Test
	void testSetMarkaModelTooShort() {
		assertThrows(java.lang.RuntimeException.class, () -> guma.setMarkaModel("r"));
	}

	@Test
	final void testSetPrecnik() {
		guma.setPrecnik(15);
		assertEquals(15, guma.getPrecnik());
	}

	@Test
	@DisplayName("Proveravamo da li je unet precnik manji od donje granice")
	void testSetPrecnikNotInRange() {
		assertThrows(java.lang.RuntimeException.class, () -> guma.setPrecnik(5));
	}

	@Test
	@DisplayName("Proveravamo da li je unet precnik veci od gornje granice")
	void testSetPrecnikNotInRange2() {
		assertThrows(java.lang.RuntimeException.class, () -> guma.setPrecnik(30));
	}
	
	@Test
	final void testSetSirina() {
		guma.setSirina(255);
		assertEquals(255, guma.getSirina());
	}

	@Test
	@DisplayName("Proveravamo da li je uneta sirina manja od donje granice")
	void testSetSirinaNotInRange() {
		assertThrows(java.lang.RuntimeException.class, () -> guma.setSirina(100));
	}
	
	@Test
	@DisplayName("Proveravamo da li je uneta sirina veca od gornje granice")
	void testSetSirinaNotInRange2() {
		assertThrows(java.lang.RuntimeException.class, () -> guma.setSirina(400));
	}

	@Test
	final void testSetVisina() {
		guma.setVisina(50);
		assertEquals(50, guma.getVisina());
	}

	@Test
	@DisplayName("Proveravamo da li je uneta visina manja od donje granice")
     void testSetVisinaNotInRange() {
		assertThrows(java.lang.RuntimeException.class, () -> guma.setVisina(5));
	}
	
	@Test
	@DisplayName("Proveravamo da li je uneta visina veca od gornje granice")
     void testSetVisinaNotInRange2() {
		assertThrows(java.lang.RuntimeException.class, () -> guma.setVisina(150));
	}

	@Test
	final void testToString() {
		guma.setMarkaModel("Tigar");
		guma.setPrecnik(20);
		guma.setSirina(150);
		guma.setVisina(30);

		String s = guma.toString();

		assertTrue(s.contains("Tigar"));
		assertTrue(s.contains("20"));
		assertTrue(s.contains("150"));
		assertTrue(s.contains("30"));
	}

	@Test
	final void testEqualsObject() {
		guma.setMarkaModel("Tigar");
		guma.setVisina(30);
		guma.setSirina(150);
		guma.setPrecnik(20);

		AutoGuma guma2 = new AutoGuma();

		guma2.setMarkaModel("Tigar");
		guma2.setVisina(30);
		guma2.setSirina(150);
		guma2.setPrecnik(20);

		assertEquals(true, guma.equals(guma2));

	}

	@ParameterizedTest
	@CsvSource({ "15", "18", "20" })
	void testSetPrecnik(int param) {
		guma.setPrecnik(param);
		assertEquals(param, guma.getPrecnik());
	}

	@ParameterizedTest
	@CsvSource({ "35", "40", "50" })
	void testSetVisina(int param) {
		guma.setVisina(param);
		assertEquals(param, guma.getVisina());
	}

	@ParameterizedTest
	@CsvSource({ "150", "240", "320" })
	void testSetSirina(int param) {
		guma.setSirina(param);
		assertEquals(param, guma.getSirina());
	}

}