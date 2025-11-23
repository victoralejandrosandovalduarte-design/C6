
package com.example.P3.Servicio;

import com.example.P3.Model.Usuario;
import com.example.P3.Repositorio.UsuarioRepositorio;
import java.util.List;
import org.springframework.stereotype.Service;


@Service

public class UsuarioServicio {
    
    private final UsuarioRepositorio usuarioRepo;
    
    public UsuarioServicio(UsuarioRepositorio usuarioRepo) {
        
        this.usuarioRepo = usuarioRepo;
        
    }
    
    public void guardar(Usuario usuario){
        usuarioRepo.save(usuario);
        
    }
    public List<Usuario>listar(){
        return usuarioRepo.findAll();
    }
    
}
