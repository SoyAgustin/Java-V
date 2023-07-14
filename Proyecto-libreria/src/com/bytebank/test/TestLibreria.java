package com.bytebank.test;
//Se importan las librerias del jar que ya creamos
import mx.com.bytebank.modelo.Cuenta;
import mx.com.bytebank.modelo.CuentaCorriente;

public class TestLibreria {
	public static void main(String[] args) {
		//Se pueden implementar los metodos del jar que creamos
		Cuenta cuenta = new CuentaCorriente(12,12);
		cuenta.depositar(200.0);
	}
}
