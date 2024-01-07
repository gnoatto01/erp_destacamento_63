package com.gnoatto.fernando.erp_destacamento_63.model.usuario;

import com.gnoatto.fernando.erp_destacamento_63.model.BaseCadastroAtivo;

public class Usuario extends BaseCadastroAtivo {

    private String usuario;
    private String senha;
    private String nomeCompleto;
    private String email; 
    private int idNivelAcesso;

    public Usuario() {

    }

    public Usuario(String usuario, String senha, String nomeCompleto, int idNivelAcesso) {
        this.usuario = usuario;
        this.senha = senha;
        this.nomeCompleto = nomeCompleto;
        this.idNivelAcesso = idNivelAcesso;
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

}
