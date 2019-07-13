package utpl.ec.service;

import java.util.List;

import utpl.ec.model.Paciente;

public interface IPacienteService {

	void registrar(Paciente paciente);
	void modificar(Paciente paciente);
	List<Paciente> listar();
	Paciente leerPorId(Integer id);
	void eliminar(Integer id);
	
}
