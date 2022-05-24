import static org.junit.Assert.*;

import org.junit.Test;

public class CikarmaTest {

private Cikarma testEdilenSinif = new Cikarma();
	
	@Test
	public void testIkiSayiyiCikarma() {
		// GIVEN - On sartlar / Verilenler
		int sayi1 = 15;
		int sayi2 = 7;
		int beklenenSonuc = 8;
		
		// WHEN - Islem/Aksiyon gerceklestiginde
		int sonuc = testEdilenSinif.cikarma(sayi1, sayi2);
		
		// THEN - Islem sonrasi kontroller
		assertEquals(beklenenSonuc, sonuc);
	}

}
