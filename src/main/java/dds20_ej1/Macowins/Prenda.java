package dds20_ej1.Macowins;

public class Prenda {

	private String nombre;
	private float precioBase;
	private Tipo tipo;
	private Estado estado;
	private float valorARestar = 0; //se corresponde al valor fijo a resetar en el caso de una prenda en PROMOCION

	public enum Tipo {
		SACOS, PANTALONES, CAMISAS
	}
	public enum Estado {
		NUEVA, PROMOCION, LIQUIDACION
	}

	public Prenda(String nombre, float precioBase, Tipo tipo, Estado estado) {
		super();
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.setTipo(tipo);
		this.estado = estado;

	}

	public float getValorARestar() {
		return valorARestar;
	}

	public void setValorARestar(float valorARestar) {
		this.valorARestar = valorARestar;
	}

	public float calcularPrecioDePrenda() {

		switch(estado) {
		case NUEVA:
			return precioBase;
		case PROMOCION:
			return precioBase - valorARestar;
		case LIQUIDACION:
			return precioBase * 0.5f ;
		default:
			return -1;

		}
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

}
