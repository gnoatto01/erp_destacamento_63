package com.gnoatto.fernando.erp_destacamento_63.model.usuario;

import com.gnoatto.fernando.erp_destacamento_63.model.BaseCadastroAtivo;

public class Usuario extends BaseCadastroAtivo {

    private String usuario;
    private String senha;
    private String nomeCompleto;
    private int idNivelAcesso;

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public int getIdNivelAcesso() {
        return idNivelAcesso;
    }

}
