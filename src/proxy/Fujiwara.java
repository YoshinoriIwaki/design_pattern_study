package proxy;
import java.util.Calendar;

public class Fujiwara implements Teacher {
	private Teacher yamada = new Yamada();

	public void question1() {
		System.out.println("それは解答1です");
	}

	public void question2() {
		System.out.println("それは解答2です");
	}

	public void question3() {
		Calendar now = Calendar.getInstance();
		if(Calendar.AM == now.get(Calendar.AM_PM)) {
			System.out.print("答えは");
			yamada.question3();
			System.out.print("となります。");
		} else {
			System.out.println("明日、返答します。");
		}

	}

	public class Student() {
		public static void main(String[] arg) {
			Teacher fujiwara = new Fujiwara();

			fujiwara.question1();
			fujiwara.question2();
			fujiwara.question3();
		}
	}
}
