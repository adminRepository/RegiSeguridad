package com.seguridad.seguridad.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.seguridad.seguridad.Modelos.Permiso;

public interface RepositorioPermiso extends MongoRepository<Permiso,String> {
}