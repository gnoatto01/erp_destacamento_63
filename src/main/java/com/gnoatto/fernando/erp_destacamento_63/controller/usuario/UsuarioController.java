package com.gnoatto.fernando.erp_destacamento_63.controller.usuario;

import java.util.ArrayList;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gnoatto.fernando.erp_destacamento_63.dao.usuario.UsuarioDao;
import com.gnoatto.fernando.erp_destacamento_63.model.usuario.Usuario;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
    UsuarioDao usuarioDao = new UsuarioDao();

    @GetMapping("/listar")
    public List<Usuario> listarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();

        usuarios = usuarioDao.listarTodos();

        System.out.println(usuarios);
        return usuarios;
    }

}
