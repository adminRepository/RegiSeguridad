package com.seguridad.seguridad.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import  com.seguridad.seguridad.Modelos.Usuario;

public interface RepositorioUsuario extends MongoRepository<Usuario,String> {

}
