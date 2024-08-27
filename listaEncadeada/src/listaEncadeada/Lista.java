package listaEncadeada;

public class Lista {
	
	private Celula cabeca;
	private Celula cauda;
	private int totalDeElementos=0;
	
	public void adicionarNoInicio(Object elemento) {
		
		if(totalDeElementos==0) {
			Celula nova = new Celula(elemento);
			this.cabeca = nova;
			this.cauda = nova;
		}
		else {
			Celula nova = new Celula(elemento, this.cabeca);
			
			this.cabeca = nova;
			
			
		}
		totalDeElementos ++;
	}
	
	public void adicionarNoFinal(Object elemento) {
		if(totalDeElementos==0) {
			adicionarNoInicio(elemento);
			
		}else {
			Celula nova = new Celula(elemento, null);
			this.cauda.setProxima(nova);
			this.cauda = nova;
			
		}
		totalDeElementos++;
	}
	
	public void listarElementos() {
		
		Celula aux = this.cabeca;
		for(int i =0;i<totalDeElementos;i++) {
			System.out.println(aux.getElemento());
			
			aux = aux.getProxima();
		}
	}
	
	public void cadastrarPorPosicao(int posicao, Object elemento) {
		
		if(posicao==0) {
			adicionarNoInicio(elemento);
		}
		if(posicao==totalDeElementos) {
			adicionarNoFinal(elemento);
		}
		if(posicao>0 && posicao<totalDeElementos) {
			Celula aux = this.cabeca;
			for(int i =0; i<posicao-1;i++) {
				aux = aux.getProxima();
			}
			
			Celula nova = new Celula(elemento, aux.getProxima());
			aux.setProxima(nova);
		}
		totalDeElementos++;
	}

	public void removerDoInicio() {
	    this.cabeca = this.cabeca.getProxima();
		totalDeElementos--;
		
	}
	public void removerDoFinal() {
		Celula aux = this.cabeca;
		for(int i=0; i<totalDeElementos-2;i++) {
			aux = aux.getProxima();
		}
		aux.setProxima(null);
		this.cauda = aux;
		
	}

	public void removerPorPosicao(int posicao) {
		
		if(posicao==0) {
			removerDoInicio();
		}
		if(posicao==totalDeElementos) {
			removerDoFinal();
		}
		if(posicao>0 && posicao<totalDeElementos) {
			
			Celula aux = this.cabeca;
		
		for(int i =0; i<posicao-2;i++) {
			aux = aux.getProxima();
		}
		
		Celula remover = aux.getProxima();
		aux.setProxima(remover.getProxima());
		
		
		}
		totalDeElementos--;
	}
	
}