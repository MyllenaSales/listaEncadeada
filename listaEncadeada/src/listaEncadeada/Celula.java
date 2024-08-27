package listaEncadeada;
public class Celula {
	
	private Object elemento;
	private Celula proxima;
	
	public Celula() {
		
	}

	public Celula(Object elemento, Celula proxima) {
		super();
		this.elemento = elemento;
		this.proxima = proxima;
	}
	
	public Celula(Object elemento) {
		this.elemento = elemento;
	}

	public Object getElemento() {
		return elemento;
	}

	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}

	public Celula getProxima() {
		return proxima;
	}

	public void setProxima(Celula proxima) {
		this.proxima = proxima;
	}

	@Override
	public String toString() {
		return "Celula [elemento=" + elemento+"]";
	}
	
	
}
