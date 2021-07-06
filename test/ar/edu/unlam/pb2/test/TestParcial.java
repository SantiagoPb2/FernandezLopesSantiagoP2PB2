package ar.edu.unlam.pb2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.src.DirectorTecnico;
import ar.edu.unlam.pb2.src.Equipo;
import ar.edu.unlam.pb2.src.Jugadores;
import ar.edu.unlam.pb2.src.Miembros;

public class TestParcial {

	@Test
	public void queSePuedaCrearUnEquipoDeFutbol() {
		Equipo argentina = new Equipo ("Argentina");
		Miembro miembros = new Miembros(13);
		
		miembros.agregarJugador(new Jugadores(41399474,10,"Leo","Messi"));
		miembros.agregarDt(new DirectorTecnico(123,"Santiago","Fernandez","Argentina",31));
		
	}

}
