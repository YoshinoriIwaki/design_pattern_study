package chain_of_responsibility;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Responsible nakagawa = new Student("����Y��");
		Responsible rookie = new ClassTeacher("�V�l�搶");
		Responsible veteran = new ChiefTeacher("�x�e�����搶");
		Responsible staffMeeting = new StaffMeeting("�E����c");
		nakagawa.setNext(rookie).setNext(veteran).setNext(staffMeeting);
		nakagawa.judge(new Question("����͂�����܂�?", new Level(1)));
		nakagawa.judge(new Question("�g�ѓd�b�����čs���Ă悢?", new Level(3)));
	}
}
