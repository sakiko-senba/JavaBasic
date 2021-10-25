package tosho;

public class User {

	private String userId; //利用者ID
	private String name; //氏名
	private String kana; //ふりがな
	private String address; //住所
	private String tel; //電話番号
	private int ｒeｎtCnt; //貸出中冊数 borrow

	public User() {

	}

	public User(String userId, String name, String kana, String address, String tel) {

		this.userId = userId;
		this.name = name;
		this.kana = kana;
		this.address = address;
		this.tel = tel;
		this.ｒeｎtCnt = 0;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhonetics() {
		return kana;
	}

	public void setPhonetics(String phonetics) {
		this.kana = phonetics;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getＲentCnt() {
		return ｒeｎtCnt;
	}

	public void setＲentCnt(int ｒentCnt) {
		this.ｒeｎtCnt = ｒentCnt;
	}

}
