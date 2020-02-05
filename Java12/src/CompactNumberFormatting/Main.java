package CompactNumberFormatting;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
        NumberFormat upvotes = NumberFormat
                .getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.SHORT);
        upvotes.setMaximumFractionDigits(1); // 소수점 아래 자리 수 표시

        System.out.println(upvotes.format(2592) + " upvotes");


        NumberFormat upvotes2 = NumberFormat
                .getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.LONG);
        upvotes2.setMaximumFractionDigits(2); // 소수점 아래 자리 수 표시
        System.out.println(upvotes2.format(2011) + " upvotes");

	}

}
