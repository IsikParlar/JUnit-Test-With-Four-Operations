import static org.junit.Assert.*;

import org.junit.Test;

public class BolmeTest {

private Bolme testEdilenSinif = new Bolme();
	
	@Test
	public void testIkiSayiyiBolme() {
		// GIVEN - On sartlar / Verilenler
		int sayi1 = 20;
		int sayi2 = 5;
		int beklenenSonuc = 4;
		
		// WHEN - Islem/Aksiyon gerceklestiginde
		int sonuc = testEdilenSinif.bolme(sayi1, sayi2);
		
		// THEN - Islem sonrasi kontroller
		assertEquals(beklenenSonuc, sonuc);
	}

}
