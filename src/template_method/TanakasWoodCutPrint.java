package template_method;

public class TanakasWoodCutPrint extends WoodCutPrint {
	public void draw(Cuttable hanzai) {
		System.out.println("hanzaiにマジックを使って大好きな女の子の絵を描く");
	}

	public void cut(Cuttable hanzai) {
		System.out.println("彫刻刀を使って細部まで丁寧にhanzaiを彫る");
	}

	public void print(Cuttable hanzai) {
		System.out.println("版画インクと馬簾を使って豪快にプリントする");
	}

}
