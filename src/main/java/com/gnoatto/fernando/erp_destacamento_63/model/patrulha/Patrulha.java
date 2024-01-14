package com.gnoatto.fernando.erp_destacamento_63.model.patrulha;

import com.gnoatto.fernando.erp_destacamento_63.model.BaseCadastroAtivo;

public class Patrulha extends BaseCadastroAtivo {
    private String nomePatrulha;
    private String descricaoPatrulha;
    private int idComandante;
    private int idCandidato;
    private int idGrupo;
    private String genero;
    private String ativo;

    public Patrulha() {

    }

    public Patrulha(String nomePatrulha, String descricaoPatrulha, int idComandante, int idCandidato, int idGrupo,
            String genero, String ativo) {
        this.nomePatrulha = nomePatrulha;
        this.descricaoPatrulha = descricaoPatrulha;
        this.idComandante = idComandante;
        this.idCandidato = idCandidato;
        this.idGrupo = idGrupo;
        this.genero = genero;
        this.ativo = ativo;
    }

    public String getNomePatrulha() {
        return nomePatrulha;
    }

    public void setNomePatrulha(String nomePatrulha) {
        this.nomePatrulha = nomePatrulha;
    }

    public String getDescricaoPatrulha() {
        return descricaoPatrulha;
    }

    public void setDescricaoPatrulha(String descricaoPatrulha) {
        this.descricaoPatrulha = descricaoPatrulha;
    }

    public int getIdComandante() {
        return idComandante;
    }

    public void setIdComandante(int idComandante) {
        this.idComandante = idComandante;
    }

    public int getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

}
