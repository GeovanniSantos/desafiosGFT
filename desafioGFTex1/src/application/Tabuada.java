package application;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		int prod, dif;

		System.out.print("Digite o multiplicador, o inicio e um fim do intervalo: \n");

		Scanner a = new Scanner (System.in);
		Scanner b = new Scanner (System.in);
		Scanner c = new Scanner (System.in);

		int mult = a.nextInt();
		int ini = b.nextInt();
		int fim = c.nextInt();

		dif = fim - ini;

		if(mult>= 0 && mult<=3000 ){
			if(ini>=0 && fim>=0 && ini<=3000 && fim<=3000) {
				if(ini<fim) {
					if(dif<=10) {
						for (int i = ini; i <= fim; i++) {
							prod = mult * i;
							System.out.println(mult +" x " + i + " = " + prod);
						}
					}else{
						System.out.print("O intervalo não pode ter uma diferença maior que 10.");
					}
				}else{
					System.out.print("O inicio do intervalo deve ser menor que seu fim.");
				}
			}else {
				System.out.print("o início como o fim do intervalo, não podem ser números negativos e não podem ser maiores de 3000.");
			}
		}else {
			System.out.print("O multiplicando nao pode ser negativo e nao pode ser maior que 3000.");
		}
		a.close();
		b.close();
		c.close();
	}
}
