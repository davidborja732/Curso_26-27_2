package org.iesch.ad.Bloque1_Ej1.Service;

import org.iesch.ad.Bloque1_Ej1.Repositorio.PerfilRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerfilService {
    @Autowired
    PerfilRepositorio perfilRepositorio;
}
