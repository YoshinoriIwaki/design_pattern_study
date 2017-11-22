package chain_of_responsibility;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Responsible nakagawa = new Student("中川雄介");
		Responsible rookie = new ClassTeacher("新人先生");
		Responsible veteran = new ChiefTeacher("ベテラン先生");
		Responsible staffMeeting = new StaffMeeting("職員会議");
		nakagawa.setNext(rookie).setNext(veteran).setNext(staffMeeting);
		nakagawa.judge(new Question("おやつはいくらまで?", new Level(1)));
		nakagawa.judge(new Question("携帯電話持って行ってよい?", new Level(3)));
	}
}
