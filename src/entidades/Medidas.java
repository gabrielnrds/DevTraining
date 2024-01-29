package entidades;

public class Medidas {
	private Avaliacao avaliacao;
	private double altura, peso;
	private double braço_e, braço_d, peitoral, barriga, quadril, cocha_e, cocha_d, panturrilha_e, panturrilha_d;
	
	public Medidas(){
	}
	
	public Medidas(double altura, double peso, double braço_e, double braço_d, 
				  double peitoral, double barriga, double quadril, double cocha_e, double cocha_d, 
				  double panturrilha_e, double panturrilha_d) {
		setAltura(altura);
		setPeso(peso);
		setBraço_e(braço_e);
		setBraço_d(braço_d);
		setPeitoral(peitoral);
		setBarriga(barriga);
		setQuadril(quadril);
		setCocha_e(cocha_e);
		setCocha_d(cocha_d);
		setPanturrilha_e(panturrilha_e);
		setPanturrilha_d(panturrilha_d);	
	}
	
	//imprimir medidas
	public String toString() {
		String resultado = "";
		resultado += "Altura: " + altura + "cm | Peso: " + peso + "kg \n";
		resultado += "Braço esquerdo: " + braço_e + "cm \n";
		resultado += "Braço direito: " + braço_d + "cm \n";
		resultado += "Peitoral: " + peitoral + "cm \n";
		resultado += "Barriga: " + barriga + "cm \n";
		resultado += "Quadril: " + quadril + "cm \n";
		resultado += "Cocha esquerda: " + cocha_e + "cm \n";
		resultado += "Cocha direita: " + cocha_d + "cm \n";
		resultado += "Panturrilha esquerda: " + panturrilha_e + "cm \n";
		resultado += "Panturrilha direita: " + panturrilha_d + "cm";
		
		return resultado;
	}

	//Setters
	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void setBraço_e(double braço_e) {
		this.braço_e = braço_e;
	}
	
	public void setBraço_d(double braço_d) {
		this.braço_d = braço_d;
	}
	
	public void setPeitoral(double peitoral) {
		this.peitoral = peitoral;
	}
	
	public void setBarriga(double barriga) {
		this.barriga = barriga;
	}
	
	public void setQuadril(double quadril) {
		this.quadril = quadril;
	}
	
	public void setCocha_e(double cocha_e) {
		this.cocha_e = cocha_e;
	}
	
	public void setCocha_d(double cocha_d) {
		this.cocha_d = cocha_d;
	}
	
	public void setPanturrilha_e(double panturrilha_e) {
		this.panturrilha_e = panturrilha_e;
	}
	
	public void setPanturrilha_d(double panturrilha_d) {
		this.panturrilha_d = panturrilha_d;
	}
	
	//Getters
	public Avaliacao getAvaliacao() {
		return this.avaliacao;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public double getBraço_e() {
		return this.braço_e;
	}
	
	public double getBraço_d() {
		return this.braço_d;
	}
	
	public double getPeitoral() {
		return this.peitoral;
	}
	
	public double getBarriga() {
		return this.barriga;
	}
	
	public double getQuadril() {
		return this.quadril;
	}
	
	public double getCocha_e() {
		return this.cocha_e;
	}
	
	public double getCocha_d() {
		return this.cocha_d;
	}
	
	public double getPanturrilha_e() {
		return this.panturrilha_e;
	}
	
	public double getPanturrilha_d() {
		return this.panturrilha_d;
	}
}