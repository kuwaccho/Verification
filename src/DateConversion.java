import java.time.LocalDate;

public class DateConversion {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.of(0, 2, 29);
		System.out.println(localDate);

		LocalDate localDate2 = LocalDate.of(Integer.parseInt("1985"), Integer.parseInt("09"), Integer.parseInt("09"));
		System.out.println(localDate2);
	}

}
