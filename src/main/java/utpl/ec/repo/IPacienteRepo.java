package utpl.ec.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import utpl.ec.model.Paciente;


public interface IPacienteRepo extends JpaRepository<Paciente,Integer> {

	
	
}
