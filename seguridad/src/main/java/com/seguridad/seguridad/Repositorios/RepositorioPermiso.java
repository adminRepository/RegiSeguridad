package tutorial.FUP.seguridad.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import tutorial.FUP.seguridad.Modelos.Permiso;

public interface RepositorioPermiso extends MongoRepository<Permiso,String> {
}