package com.gnoatto.fernando.erp_destacamento_63.model.nivelAcesso;

import com.gnoatto.fernando.erp_destacamento_63.model.BaseCadastro;

public class NivelAcesso extends BaseCadastro {
    private String privilegio;
    private String descricao;

    public String getPrivilegio() {
        return privilegio;
    }

    public void setPrivilegio(String privilegio) {
        this.privilegio = privilegio;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
