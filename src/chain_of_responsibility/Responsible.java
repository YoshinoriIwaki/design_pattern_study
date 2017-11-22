package chain_of_responsibility;

public abstract class Responsible {
	private Responsible next = null;
	private String responsiblePerson = null;
	
	public Responsible setNext(Responsible next) {
		this.next = next;
		return next;
	}
	
	public final void putQuestion(Question question) {
		if(beAbleToJudge(question)) {
			judge(question);
		} else if(next != null) {
			next.putQuestion(question);
		} else {
			System.out.println("�N�ɂ����f�ł��܂���ł����B����Ă݂Ȃ����B");
		}
	}
	
	protected abstract boolean beAbleToJudge(Question question);
	protected abstract void judge(Question question);
}
