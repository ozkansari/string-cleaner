package tr.edu.medipol.yova.string_cleaner;

import org.apache.commons.lang3.StringUtils;

public final class TextOperasyonlari {
	public static String formatla(String kaynak) {
		if(kaynak == null) return "";
		String bosluksuz = StringUtils.deleteWhitespace(kaynak);
		String bosluksuzKucukHarf = StringUtils.lowerCase(bosluksuz);
		String bosluksuzKucukHarfKisaltilmis = StringUtils.abbreviate(bosluksuzKucukHarf, "...", 13);
		String formatlanmis = bosluksuzKucukHarfKisaltilmis;
		return formatlanmis;
	}
}
