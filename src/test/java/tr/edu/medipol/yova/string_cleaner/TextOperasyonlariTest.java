package tr.edu.medipol.yova.string_cleaner;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TextOperasyonlariTest {

	@Test
	public void formatlaNullString() {
		// (GIVEN) On kosullar
		String kaynak = null;
		// (WHEN) Test etmek istedigimiz metodu cagiracagimiz kisim
		String sonuc = TextOperasyonlari.formatla(kaynak);
		// (THEN) Kontroller
		assertEquals("", sonuc, "bos sonuc vermeliydi");
	}

	@Test
	public void formatlaBosString() {
		// (GIVEN) On kosullar
		String kaynak = "";
		// (WHEN) Test etmek istedigimiz metodu cagiracagimiz kisim
		String sonuc = TextOperasyonlari.formatla(kaynak);
		// (THEN) Kontroller
		assertEquals("", sonuc, "bos sonuc vermeliydi");
	}
	
	@Test
	public void formatlaUzunString() {
		// (GIVEN) On kosullar
		String kaynak = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
		// (WHEN) Test etmek istedigimiz metodu cagiracagimiz kisim
		String sonuc = TextOperasyonlari.formatla(kaynak);
		// (THEN) Kontroller
		assertEquals("loremipsum...", sonuc, "10 karakter kucuk harf bosluksuz olmali");
	}
}
