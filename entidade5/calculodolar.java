package entidade5;

public class calculodolar {
 
	float dolar, qtdolar;

	public calculodolar( float dolar, float qtdolar) {
		this.dolar = dolar;
		this.qtdolar = qtdolar;
	
	}

	public float getDolar() {
		return dolar;
	}

	public void setDolar(float dolar) {
		this.dolar = dolar;
	}

	public float getQtdolar() {
		return qtdolar;
	}

	public void setQtdolar(float qtdolar) {
		this.qtdolar = qtdolar;
	}

	public float calculoTotal() {
	     qtdolar = qtdolar * dolar;
	     double imp = 0.06 * qtdolar;
	     qtdolar += imp;
		
		return qtdolar;
	}

	
	
	
}
