package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Guardia;

@Repository
@Transactional
public class GuardiaRepoImpl implements IGuardiaRepo{

	//@Autowired
	//private JdbcTemplate jdbcTemplate;
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void InsertarGuardia(Guardia guardia) {
		this.entityManager.persist(guardia);
	}

	@Override
	public Guardia buscarGuardia(Integer id) {

		return null;
	}

	@Override
	public void ActualizarGuardia(Guardia guardia) {
		this.entityManager.merge(guardia);
	}

	@Override
	public void borrarGuardia(Integer id) {
		
	}

	
	
}
