package visitor;

public class SuzukiHome extends Home implements TeacherAcceptor {
	public Object praisedChild() {
		System.out.println("あら、先生ったらご冗談を");
		return new Tea();
	}
	
	public Object reproveChild() {
		System.out.println("うちの子に限ってそんなことは・・");
		
		return null;
	}
	
	public void accept(Teacher teacher) {
		teacher.visit(this);
	}
}
