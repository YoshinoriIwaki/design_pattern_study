package composite;

public class SymbolicLink implements DirectoryEntry {
	private String name = null;
	public symbolicLink(String name) {
		this.name = name;
	}
	
	public void remove() {
		System.out.println(name + "���폜���܂���");
	}
}
