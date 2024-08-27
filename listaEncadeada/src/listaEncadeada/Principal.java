package listaEncadeada;

public class Principal {

	public static void main(String[] args) {
		
		Celula c1 = new Celula("encadeada");
		Celula c2 = new Celula("lista");
		Celula c3 = new Celula("teste");
		Celula c4 = new Celula("um");
		Celula c5 = new Celula("ola");
		Lista l = new Lista();
		l.adicionarNoInicio(c1);
		l.adicionarNoInicio(c2);
		l.adicionarNoInicio(c3);
		l.adicionarNoInicio(c4);
		
		l.listarElementos();
		l.cadastrarPorPosicao(3, c5);
		
		l.listarElementos();
		
		l.removerPorPosicao(2);
		l.listarElementos();

	}
	
}
