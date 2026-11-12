package org.iesch.ad.Bloque1_Ej1;

import org.iesch.ad.Bloque1_Ej1.Modelo.Perfil;
import org.iesch.ad.Bloque1_Ej1.Modelo.Usuario;
import org.iesch.ad.Bloque1_Ej1.Repositorio.PerfilRepositorio;
import org.iesch.ad.Bloque1_Ej1.Repositorio.UsuarioRepositorio;
import org.iesch.ad.Bloque1_Ej1.Service.PerfilService;
import org.iesch.ad.Bloque1_Ej1.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootApplication
public class Bloque1Ej1Application implements CommandLineRunner {
	@Autowired
	PerfilRepositorio perfilRepositorio;
	@Autowired
	UsuarioRepositorio usuarioRepositorio;
	@Override
	public void run(String... args) throws Exception {
		Usuario usuario = new Usuario();
		Perfil perfil = new Perfil();
		perfil.setFechanacimiento(LocalDate.of(1990, 1, 1));
		perfil.setDescripcion("Descripcion Juana");
		perfil.setFotoperfil("fotoperfil Juana");
		usuario.setNombre("Juana");
		usuario.setContrasena("123456789");
		perfil.setUsuario(usuario);
		usuario.setPerfil(perfil);
		usuarioRepositorio.save(usuario);
		perfilRepositorio.save(perfil);


	}

	public static void main(String[] args) {
		SpringApplication.run(Bloque1Ej1Application.class, args);
	}

}
