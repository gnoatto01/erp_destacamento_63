package com.gnoatto.fernando.erp_destacamento_63.model.grupos;

import com.gnoatto.fernando.erp_destacamento_63.model.BaseCadastro;

public class Grupo extends BaseCadastro {
    private String nomeGrupo;
    private String descricao;

    public Grupo() {

    }

    public Grupo(String nomeGrupo, String descricao) {
        this.nomeGrupo = nomeGrupo;
        this.descricao = descricao;
    }

    public String getNomeGrupo() {
        return nomeGrupo;
    }

    public void setNomeGrupo(String nomeGrupo) {
        this.nomeGrupo = nomeGrupo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
