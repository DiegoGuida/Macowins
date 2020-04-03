package dds20_ej1.Macowins;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Macowins {

	private List<Venta> ventas = new ArrayList<Venta>();

	public void registarVenta (Venta venta) {
		venta.calcularPrecioDeVenta();
		ventas.add(venta);
	}

	public List<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}

	public float gananciasPorFecha(LocalDate fecha) {
		float precioTotal=0;
		List<Venta> ventasDelDia = ventas.stream().filter(x->x.getFecha().equals(fecha)).collect(Collectors.toList());
	    for (Venta venta : ventasDelDia){
	    	precioTotal = precioTotal + venta.getPrecioDeVenta();
	    }
	    return precioTotal;
	}

	public float precioDeVentaPorPrenda (Prenda prenda) {
		return prenda.calcularPrecioDePrenda();
	}



}
