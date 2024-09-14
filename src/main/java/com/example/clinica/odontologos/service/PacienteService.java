import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class PacienteService {

    private static final Logger logger = LoggerFactory.getLogger(PacienteService.class);

    @Autowired
    private PacienteRepository pacienteRepository;

    public List<Paciente> listarTodos() {
        logger.info("Listando todos los pacientes");
        return pacienteRepository.findAll();
    }

    public Optional<Paciente> buscarPorId(Long id) {
        logger.info("Buscando paciente con id {}", id);
        return pacienteRepository.findById(id);
    }

    public Paciente guardar(Paciente paciente) {
        logger.info("Guardando paciente {}", paciente);
        return pacienteRepository.save(paciente);
    }

    public void eliminar(Long id) {
        logger.info("Eliminando paciente con id {}", id);
        pacienteRepository.deleteById(id);
    }
}
