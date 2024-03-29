package com.gnoatto.fernando.erp_destacamento_63.controller.usuario;

import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gnoatto.fernando.erp_destacamento_63.dao.usuario.UsuarioDao;
import com.gnoatto.fernando.erp_destacamento_63.model.usuario.Usuario;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    UsuarioDao usuarioDao = new UsuarioDao();

    @GetMapping("/listar")
    public List<Usuario> listarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();

        usuarios = usuarioDao.listarTodos();

        return usuarios;
    }

    @PostMapping("/cadastrar")
    public boolean cadastrarUsuario(@RequestBody Usuario usuario) throws SQLException {
        usuarioDao.inserirDados(usuario);
        return true;
    }

    @GetMapping("/desativar/{id}")
    public boolean desativarUsuario(@PathVariable int id) throws SQLException {
        usuarioDao.desativarUsuario(id);
        return true;

    }

    @PostMapping("/editar/{id}")
    public boolean editarUsuario(@RequestBody Usuario usuario) throws SQLException {
        usuarioDao.alterarDados(usuario);
        return true;
    }

}
