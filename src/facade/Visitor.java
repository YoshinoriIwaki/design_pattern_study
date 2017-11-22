package facade;

public class Visitor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Librarian nakamura = new Librarian();
		String location = nakamura.searchBook("昆虫図鑑");
		if(location.equals("貸し出し中です")) {
			System.out.println("貸し出し中かよ..");
		} else if(location.equals("その本は所蔵していません")) {
			System.out.println("なんだ、ないのか?");
		} else {
			System.out.println("サンキュ!");
		}
	}
}
