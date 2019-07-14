package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String str = "";
		for (int i = s.length();i>0;i--) {
			str+=s.substring(i-1,i);
		}
		return str;
	}

}
