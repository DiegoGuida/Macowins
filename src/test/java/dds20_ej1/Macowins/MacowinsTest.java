package dds20_ej1.Macowins;

import static org.junit.Assert.assertSame;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import dds20_ej1.Macowins.Prenda.Estado;
import dds20_ej1.Macowins.Prenda.Tipo;
import junit.framework.Assert;

public class MacowinsTest {

	private Macowins macowins = new Macowins();

	private Prenda prenda1 = new Prenda( "prenda1" , 100 , Tipo.SACOS , Estado.NUEVA );
	private Prenda prenda2 = new Prenda( "prenda2" , 2000 , Tipo.CAMISAS , Estado.PROMOCION );
	private Efectivo efectivo = new Efectivo() ;
	private Tarjeta tarjeta = new Tarjeta();
	private Venta venta1 = new Venta(prenda1, 5, LocalDate.now(), efectivo);
	private Venta venta2 = new Venta(prenda2, 2, LocalDate.now().plusDays(1), efectivo);
	private Venta venta3 = new Venta(prenda1, 1, LocalDate.now().plusDays(2), tarjeta);

	@Before
	public void init() {

	macowins.registarVenta(venta1);

	prenda2.setValorARestar(100);
	macowins.registarVenta(venta2);

	tarjeta.setCoeficienteFijo(0.5f);
	tarjeta.setCuotas(4);
	macowins.registarVenta(venta3);
	}

	@Test
	public void gananciasPorFecha () {
		Assert.assertEquals(500, macowins.gananciasPorFecha(LocalDate.now()), 1);
	}
	@Test
	public void gananciasPorFecha2 () {
		Assert.assertEquals(3800, macowins.gananciasPorFecha(LocalDate.now().plusDays(1)), 1);
	}
	@Test
	public void gananciasPorFecha3 () {
		Assert.assertEquals(200, macowins.gananciasPorFecha(LocalDate.now().plusDays(2)), 1);
	}
	@Test
	public void precioDeVentaDePrenda() {
		Assert.assertEquals(100, macowins.precioDeVentaPorPrenda(prenda1), 1);
	}
	@Test
	public void tipoDePrenda() {
		assertSame(Tipo.SACOS, prenda1.getTipo());
	}
}
