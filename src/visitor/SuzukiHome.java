package visitor;

public class SuzukiHome extends Home implements TeacherAcceptor {
	public Object praisedChild() {
		System.out.println("����A�搶�����炲��k��");
		return new Tea();
	}
	
	public Object reproveChild() {
		System.out.println("�����̎q�Ɍ����Ă���Ȃ��Ƃ́E�E");
		
		return null;
	}
	
	public void accept(Teacher teacher) {
		teacher.visit(this);
	}
}
