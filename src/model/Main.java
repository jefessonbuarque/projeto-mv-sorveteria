package model;

import java.util.ArrayList;
import java.util.List;

public class Main {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		List<Sorvete> listaSorvetes = new ArrayList<Sorvete>();

		Sorvete sp1 = new Sorvete("Morango", "picolé", 4.50, 59);
		Sorvete sp2 = new Sorvete("Amendoim", "picolé", 4.50, 58);
		Sorvete sp3 = new Sorvete("Chocolate", "picolé", 4.50, 59);
		Sorvete sp4 = new Sorvete("Acerola", "picolé", 4.50, 58);
		Sorvete sp5 = new Sorvete("Iorgute", "picolé", 4.50, 59);
		Sorvete sp6 = new Sorvete("Napolitano", "massa", 12.99, 80);
		Sorvete sp7 = new Sorvete("Toffe", "massa", 14.99, 90);
		Sorvete sp8 = new Sorvete("Delicia de Abacaxi", "massa", 10.99, 70);

		listaSorvetes.add(sp1);
		listaSorvetes.add(sp2);
		listaSorvetes.add(sp3);
		listaSorvetes.add(sp4);
		listaSorvetes.add(sp5);
		listaSorvetes.add(sp6);
		listaSorvetes.add(sp7);
		listaSorvetes.add(sp8);

		int opcaoMenu = 0;
		while (opcaoMenu < 3) {

			System.out.println("################ SEJAM BEM VINDOS!!! ###############");
			System.out.println("-------------  SORVETERIA KERO MAIS --------------\n\n");
			for (Sorvete sorvete : listaSorvetes) {

				System.err.println("Código: " + listaSorvetes.indexOf(sorvete) + "  Sabor: " + sorvete.getSabor()
						+ "  Tipo: " + sorvete.getTipo() + "  R$:  " + sorvete.getValor() + "0  Peso: "
						+ sorvete.getPeso() + "g");
			}

			opcaoMenu = Sorvete.selecionarOpcao();

			if (opcaoMenu == 1) {
				Sorvete novoSorvete = new Sorvete(null, null, 0, 0);
				novoSorvete.adicionar();

				int cod = 0;
				boolean adicionar = false;
				for (Sorvete sorvete : listaSorvetes) {

					adicionar = novoSorvete.equals(sorvete);

					if (adicionar) {
						cod = listaSorvetes.indexOf(sorvete);
						break;
					}

				}

				if (adicionar) {
					Sorvete.limpaTela();
					System.err.println("\nItem já existe na posição: [" + cod + "]. Favor adicionar outro sabor.");

				} else {
					Sorvete.limpaTela();
					System.err.println("\nNovo Sorvete adicionado com SUCESSO!");

					listaSorvetes.add(novoSorvete);

				}

			}
			if (opcaoMenu == 2) {

				int opcao = Sorvete.removerOpcao();

				listaSorvetes.remove(opcao);
				Sorvete.limpaTela();
				System.err.println("\nSorvete removido com SUCESSO!");

			}

		}
		System.err.println("\nPrograma encerrado, até mais!");
	}

}
