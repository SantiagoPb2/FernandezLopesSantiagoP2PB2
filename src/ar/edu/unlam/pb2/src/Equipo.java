package ar.edu.unlam.pb2.src;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
	
	private List<Miembros> miembros;
	private String nombreEquipo;
	
	public Equipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
		this.miembros = new ArrayList<Miembro>();
	}

	public List<Miembros> getMiembros() {
		return miembros;
	}

	public void setMiembros(List<Miembro> miembros) {
		this.miembros = miembros;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	
}
