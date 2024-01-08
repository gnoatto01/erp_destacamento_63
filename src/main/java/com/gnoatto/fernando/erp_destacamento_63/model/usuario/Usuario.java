package com.gnoatto.fernando.erp_destacamento_63.model.usuario;

import com.gnoatto.fernando.erp_destacamento_63.model.BaseCadastroAtivo;

public class Usuario extends BaseCadastroAtivo {

    private String usuario;
    private String senha;
    private String salt;
    private String nomeCompleto;
    private String email;
    private int idNivelAcesso;
    private String ativo;

    public Usuario() {

    }

    public Usuario(String usuario, String senha, String salt, String nomeCompleto, String email, int idNivelAcesso, String ativo) {
        this.usuario = usuario;
        this.senha = senha;
        this.salt = salt;
        this.email = email;
        this.nomeCompleto = nomeCompleto;
        this.idNivelAcesso = idNivelAcesso;
        this.ativo = ativo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getIdNivelAcesso() {
        return idNivelAcesso;
    }

    public void setIdNivelAcesso(int idNivelAcesso) {
        this.idNivelAcesso = idNivelAcesso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }


}
