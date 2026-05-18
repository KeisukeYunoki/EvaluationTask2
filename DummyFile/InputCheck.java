package DummyFile;

class InputCheck {

	private String str;

	public InputCheck(String str){
		if(str == null) {
			str = "";
		}
		this.str = str;

	}

	protected boolean isNumeric()
	{
		if (this.str == "") {
			return false;
		}
		for (int i = 0; i < this.str.length(); i++)
		{
			char c = this.str.charAt(i);
			if (c < '0' || c > '9') {
				return false;
			}
		}
		return true;
	}

	protected boolean checkSize() {
		/*
		*不具合：intより大きい整数値を入れたところ、checkSize()が機能しなかった
		*修正:longを使いより大きな整数でもチェックできるようにした。
		*/
		Long value = Long.parseLong(this.str);
		if(value <= 1024*1024*100) {
			return true;
		}
		return false;
	}
}
