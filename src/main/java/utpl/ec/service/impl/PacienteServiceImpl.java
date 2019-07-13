package utpl.ec.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import utpl.ec.model.Paciente;
import utpl.ec.repo.IPacienteRepo;
import utpl.ec.service.IPacienteService;


@Service
public class PacienteServiceImpl implements IPacienteService {
	
	@Autowired
	private IPacienteRepo repo;
	
	public void registrar(Paciente paciente) {
		// TODO Auto-generated method stub
		
		System.out.println("nombre"+ paciente.getNombre());
		
		 repo.save(paciente);
	}

	public void modificar(Paciente paciente) {
		// TODO Auto-generated method stub
		repo.save(paciente);
	}

	public List<Paciente> listar() {
		// TODO Auto-generated method stub
		//List<Paciente> pacientes = repo.findAll();
		
		return repo.findAll();
	}

	@Override
	public Paciente leerPorId(Integer id) {//Spring boot 2 habra cambios en este método
		// TODO Auto-generated method stub
		return repo.findOne(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repo.delete(id);
	}

}
