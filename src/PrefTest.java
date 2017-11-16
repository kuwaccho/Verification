import util.Pref;

public class PrefTest {

	public static void main(String[] args) {

		String code = "02";
		String name = "青森県";

		Pref prefByCode = Pref.getByCode(code);
		if (prefByCode != null) {
			System.out.println("(･ω･`U)code:" + prefByCode.getCode() + " (･ω･`U)name:" + prefByCode.getName());
		}

		Pref prefByName = Pref.getByName(name);
		if (prefByName != null) {
			System.out.println("(･ω･`U)code:" + prefByName.getCode() + " (･ω･`U)name:" + prefByName.getName());
		}

		Pref prefByName2 = Pref.getByName("青森都");
		if (prefByName2 != null) {
			System.out.println("(･ω･`U)code:" + prefByName2.getCode() + " (･ω･`U)name:" + prefByName2.getName());
		} else {
			System.out.println("(･ω･`U)そんなのないよ");
		}
	}

}
