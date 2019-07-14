package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String str = "";
		for (int i =0;i<s.length();i++) {
			if (i%2==1)
				str+=s.substring(i, i+1).toUpperCase();
			else
				str+=s.substring(i, i+1).toLowerCase();
		}
		return str;
	}

}
