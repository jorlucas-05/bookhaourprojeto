package Testes;

import javax.swing.JOptionPane;

import br.com.ifpe.bookhour.Autor;
import br.com.ifpe.bookhour.Livro;
import br.com.ifpe.controller.LivroController;

public class Teste {

	public static void main(String[] args) {
		
		LivroController lc = new LivroController();
		Autor a = new Autor("Teste");
		Livro l = new Livro(1, "TesteTitulo", a);
		
		int x = 0;
		
		do {
			
			String opcaoStr = JOptionPane.showInputDialog("Digite um numero");
			int opcao = Integer.parseInt(opcaoStr);
			
			//Se 1 = Cadastrar livro
			if(opcao == 1) {
				lc.inserirLivroAction(l);
			}
			
			//Se 2 = Alterar livro
			//Se 3 = Recuperar livro
			//Se 4 = Deletar livro
			//Se 5 = Listar livros
			
		}while(x == 0);

	}

}
