package tr.edu.medipol.yova.string_cleaner;

public class App {

	public static void main(String[] args) {
		String ornekCumle = "Yazilim Ortam Ve Aracları";
		String formatlanmis = TextOperasyonlari.formatla(ornekCumle);
		System.out.println(ornekCumle + " -> " + formatlanmis);
	}
}
