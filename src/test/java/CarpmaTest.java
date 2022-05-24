import static org.junit.Assert.*;

import org.junit.Test;

public class CarpmaTest {

private Carpma testEdilenSinif = new Carpma();
	
	@Test
	public void testIkiSayiyiCarpma() {
		// GIVEN - On sartlar / Verilenler
		int sayi1 = 8;
		int sayi2 = 9;
		int beklenenSonuc = 72;
		
		// WHEN - Islem/Aksiyon gerceklestiginde
		int sonuc = testEdilenSinif.carpma(sayi1, sayi2);
		
		// THEN - Islem sonrasi kontroller
		assertEquals(beklenenSonuc, sonuc);
	}

}
