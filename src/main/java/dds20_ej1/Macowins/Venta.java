package dds20_ej1.Macowins;

import java.time.LocalDate;

public class Venta {

	private Prenda prenda;
	private int cantidad;
	private LocalDate fecha;
	private float precioDeVenta;
	private FormaDePago formaDePago;
//	private float coeficienteTarjeta;

/*	private enum FormaDePago {
		EFECTIVO, TARJETA
	}

	public void calcularPrecioDeVenta() {
		switch(formaDePago) {
		case EFECTIVO:
			precioDeVenta = prenda.calcularPrecioDePrenda();
			break;
		case TARJETA:
			precioDeVenta = prenda.calcularPrecioDePrenda() * coeficienteTarjeta + 0.01f;
			break;
		default:
			precioDeVenta = -1;
		}
	}
*/

	public Venta(Prenda prenda, int cantidad, LocalDate fecha, FormaDePago formaDePago) {
		super();
		this.prenda = prenda;
		this.cantidad = cantidad;
		this.fecha = fecha;
		this.formaDePago = formaDePago;
	}

	public void calcularPrecioDeVenta() {
		precioDeVenta = prenda.calcularPrecioDePrenda() * cantidad * formaDePago.precioAdicional();
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public float getPrecioDeVenta() {
		return precioDeVenta;
	}

	public void setPrecioDeVenta(float precioDeVenta) {
		this.precioDeVenta = precioDeVenta;
	}


}
