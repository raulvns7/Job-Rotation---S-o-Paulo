package Atividades;

public class atividadeNumeroIV {



	public static void main(String[] args) {
		
		/*SP – R$67.836,43
		RJ – R$36.678,66
		MG – R$29.22988
		ES – R$27.165,48
		Outros – R$19.849,538*/
		
		float sp = 67.83643f;
		float rj = 36.83643f;
		float mg= 29.22988f;
		float es= 27.16548f;
		float outros = 19.849538f;
		float valorTotal;
		
		float valorSp;
		float valorRj;
		float valorMg;
		float valorEs;
		float valorOut;
		
		valorTotal = (sp + rj + mg + es + outros);
		System.out.println(valorTotal);
		
		valorSp = (sp * valorTotal) / 100;
		valorRj = (rj * valorTotal) / 100;
		valorMg = (mg * valorTotal) / 100;
		valorEs = (es * valorTotal) / 100;
		valorOut = (outros * valorTotal) / 100;
		
		System.out.println("VALOR DE SP É: " + valorSp + "%");
		System.out.println("VALOR DE RJ É: " + valorRj + "%");
		System.out.println("VALOR DE MG É: " + valorMg + "%");
		System.out.println("VALOR DE ES É: " + valorEs + "%");
		
		
		
	}

}
