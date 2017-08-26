package com.gym.modelo;

import java.util.Scanner;

public class Boxeadores {

	public String nombre;

	public double peso;

	public String categoria;

	public Boxeadores() {

	}

	public Boxeadores(String nombre, double peso, String categoria) {
		this.nombre = nombre;
		this.peso = peso;
		this.categoria = categoria;
	}

	// SETTERS Y GETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
