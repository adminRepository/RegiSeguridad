package com.seguridad.seguridad.Repositorios;


import org.springframework.data.mongodb.repository.MongoRepository;
import com.seguridad.seguridad.Modelos.PermisosRoles;

public interface RepositorioPermisosRoles extends MongoRepository<PermisosRoles,String> {
}

