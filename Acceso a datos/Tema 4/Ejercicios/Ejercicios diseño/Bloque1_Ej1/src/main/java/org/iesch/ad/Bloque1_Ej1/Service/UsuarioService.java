package org.iesch.ad.Bloque1_Ej1.Service;

import org.iesch.ad.Bloque1_Ej1.Repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepositorio usuarioRepositorio;
}
