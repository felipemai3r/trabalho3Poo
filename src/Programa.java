import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int op;
		
		//Para definir e reaproveitar os codigos da tinta 
		Piramide piramide = new Piramide();
		Tinta t1 = new Tinta(); //  tipo 1 
		t1.setTipo(1);
		t1.setValor((double)127.90);
		t1.setRendimento(4.76);
		t1.setTamanhoLata(18);
		
		Tinta t2 = new Tinta(); //  tipo 2 
		t2.setTipo(2);
		t2.setValor((double)258.98);
		t2.setRendimento(4.76);
		t2.setTamanhoLata(18);
		
		Tinta t3 = new Tinta(); //  tipo 3 
		t3.setTipo(2);
		t3.setValor((double)344.34);
		t3.setRendimento(4.76);
		t3.setTamanhoLata(18);
		
		
		
		System.out.println("Digite a altura da piramide (metros):");
		piramide.setAltura(entrada.nextDouble());
		
		System.out.println("Digite a ab da piramide (metros):");
		piramide.setArestaB(entrada.nextDouble());
		
		System.out.println("------ Tipos de tinta ------");
		System.out.println("1 - Lata com "+ t1.getTamanhoLata() + " no valor de "+ t1.getValor());
		System.out.println("2 - Lata com "+ t2.getTamanhoLata() + " no valor de "+ t2.getValor());
		System.out.println("3 - Lata com "+ t3.getTamanhoLata() + " no valor de "+ t3.getValor());
		
		
		
		
		System.out.println("Digite a opição de tinta:");
		op = entrada.nextInt();
		
		
		
		System.out.println("------ Dados de tamanho ------");
		
		System.out.println("A area é " + piramide.areaTotal()); 
		System.out.println("Area do Triangulo: " + piramide.areaTriangulo());
		System.out.println("Area do base: " + piramide.areaBase());
		System.out.println("Volume: "+piramide.volume());
		
		System.out.println("------ Valores para Compra ------");
		
		switch(op) {
		
		case(1):
			System.out.println("\nLitros: "+ t1.litros(piramide.areaTotal()));
			System.out.println("Valor de latas: R$"+ t1.valorTotal(t1.quantiLatas(piramide.areaTotal())));
			System.out.println("Quantilatas de latas: "+ t1.quantiLatas(piramide.areaTotal()));
		break;
		case(2):
			System.out.println("\nLitros: "+ t2.litros(piramide.areaTotal()));
			System.out.println("Valor de latas: R$"+ t2.valorTotal(t2.quantiLatas(piramide.areaTotal())));
			System.out.println("Quantilatas de latas: "+ t2.quantiLatas(piramide.areaTotal()));
		break;
		case(3):
			System.out.println("\nLitros: "+ t3.litros(piramide.areaTotal()));
			System.out.println("Valor de latas: R$"+ t3.valorTotal(t3.quantiLatas(piramide.areaTotal())));
			System.out.println("Quantilatas de latas: "+ t3.quantiLatas(piramide.areaTotal()));
		break;
		default: 
			System.out.println("ERRO!!");
		}
		
		entrada.close();
	}

}
