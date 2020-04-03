package dds20_ej1.Macowins;

public class Tarjeta implements FormaDePago {


	private float coeficienteFijo;
	private float cuotas;

	@Override
	public float precioAdicional() {
		return cuotas * coeficienteFijo + 0.01f;
	}

	public float getCoeficienteFijo() {
		return coeficienteFijo;
	}

	public void setCoeficienteFijo(float coeficienteFijo) {
		this.coeficienteFijo = coeficienteFijo;
	}

	public float getCuotas() {
		return cuotas;
	}

	public void setCuotas(float cuotas) {
		this.cuotas = cuotas;
	}

}
