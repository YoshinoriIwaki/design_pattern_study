package facade;

public class Visitor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Librarian nakamura = new Librarian();
		String location = nakamura.searchBook("�����}��");
		if(location.equals("�݂��o�����ł�")) {
			System.out.println("�݂��o��������..");
		} else if(location.equals("���̖{�͏������Ă��܂���")) {
			System.out.println("�Ȃ񂾁A�Ȃ��̂�?");
		} else {
			System.out.println("�T���L��!");
		}
	}
}
