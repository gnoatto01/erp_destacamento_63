package com.gnoatto.fernando.erp_destacamento_63.model.comandante;

import com.gnoatto.fernando.erp_destacamento_63.model.BaseCadastro;

public class Comandante extends BaseCadastro {
    private String nomeComandante;
    private String contatoComandante;
    private String emailComandante;

    public Comandante() {

    }

    public Comandante(String nomeComandante, String contatoComandante, String emailComandante) {
        this.nomeComandante = nomeComandante;
        this.contatoComandante = contatoComandante;
        this.emailComandante = emailComandante;
    }

    public String getNomeComandante() {
        return nomeComandante;
    }

    public void setNomeComandante(String nomeComandante) {
        this.nomeComandante = nomeComandante;
    }

    public String getContatoComandante() {
        return contatoComandante;
    }

    public void setContatoComandante(String contatoComandante) {
        this.contatoComandante = contatoComandante;
    }

    public String getEmailComandante() {
        return emailComandante;
    }

    public void setEmailComandante(String emailComandante) {
        this.emailComandante = emailComandante;
    }

}
