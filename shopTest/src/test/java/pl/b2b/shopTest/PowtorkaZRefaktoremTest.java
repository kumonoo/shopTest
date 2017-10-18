package pl.b2b.shopTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PowtorkaZRefaktoremTest {

	private List<Integer> lista = new ArrayList();

	@Before
	public void inicjalizacjaListy() {
		lista = new ArrayList<Integer>();
		lista.add(21);
		lista.add(31);
		lista.add(62);

	}

	@Test
	public void IloscElementowParzystychWZadanejLiscie() {
		Utils utils = new Utils(lista);
		int licznik = utils.zliczElementyParzyste();

		assertEquals(3, licznik);
	}

	@Test
	public void iloscElementowWZadanejLiscieKtorychSumaCyfrJestWiekszaOd4() {

		Utils utils = new Utils(lista);
		int licznik = utils.zliczSumeCyfrWiekszaOd4();

		assertEquals(2, licznik);

	}
}