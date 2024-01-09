package com.gnoatto.fernando.erp_destacamento_63.model.candidato;

import java.util.Date;

import com.gnoatto.fernando.erp_destacamento_63.model.BaseCadastroAtivo;

public class Candidato extends BaseCadastroAtivo {
    private String nomeCandidato;
    private Date dataNascimento;
    private String rg;
    private String cpf;
    private String nivelEscolar;
    private String instituicaoEnsino;
    private String religiao;
    private String igrejaFrequentada;
    private String nomePastor;
    private String telefone;
    private String email;
    private String alergias;
    private String disturbios;
    private String RestricaoAtividadeFisica;
    private String sabeNadar;
    private String medicamentoContinuo;
    private String tipoSanguineo;
    private String fatorRh;
    private String planoSaude;
    private String hospital;
    private String informacaoAdicional;
    private String cartaRecomendacao;
    private String autorizacaoAtivadadeExterna;
    private String autorizacaoAtivadadeInterna;

    public Candidato() {

    }

    public Candidato(String nomeCandidato, Date dataNascimento, String rg, String cpf, String nivelEscolar,
            String instituicaoDeEnsino, String religiao,
            String igrejaFrequentada, String nomePastor, String telefone, String email, String alergias,
            String disturbios, String RestricaoAtividadeFisica,
            String sabeNadar, String medicamentoContinuo, String tipoSanguineo, String fatorRh, String planoSaude,
            String hospital, String informacaoAdicional,
            String cartaRecomendacao, String autorizacaoAtivadeExterna, String autorizacaoAtividadeInterna) {

        this.nomeCandidato = nomeCandidato;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.nivelEscolar = nivelEscolar;
        this.instituicaoEnsino = instituicaoDeEnsino;
        this.religiao = religiao;
        this.igrejaFrequentada = igrejaFrequentada;
        this.nomePastor = nomePastor;
        this.telefone = telefone;
        this.email = email;
        this.alergias = alergias;
        this.sabeNadar = sabeNadar;
        this.medicamentoContinuo = medicamentoContinuo;
        this.tipoSanguineo = tipoSanguineo;
        this.fatorRh = fatorRh;
        this.planoSaude = planoSaude;
        this.hospital = hospital;
        this.informacaoAdicional = informacaoAdicional;
        this.cartaRecomendacao = cartaRecomendacao;
        this.autorizacaoAtivadadeExterna = autorizacaoAtivadeExterna;
        this.autorizacaoAtivadadeInterna = autorizacaoAtividadeInterna;
    }

    public String getNomeCandidato() {
        return nomeCandidato;
    }

    public void setNomeCandidato(String nomeCandidato) {
        this.nomeCandidato = nomeCandidato;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNivelEscolar() {
        return nivelEscolar;
    }

    public void setNivelEscolar(String nivelEscolar) {
        this.nivelEscolar = nivelEscolar;
    }

    public String getInstituicaoEnsino() {
        return instituicaoEnsino;
    }

    public void setInstituicaoEnsino(String instituicaoEnsino) {
        this.instituicaoEnsino = instituicaoEnsino;
    }

    public String getReligiao() {
        return religiao;
    }

    public void setReligiao(String religiao) {
        this.religiao = religiao;
    }

    public String getIgrejaFrequentada() {
        return igrejaFrequentada;
    }

    public void setIgrejaFrequentada(String igrejaFrequentada) {
        this.igrejaFrequentada = igrejaFrequentada;
    }

    public String getNomePastor() {
        return nomePastor;
    }

    public void setNomePastor(String nomePastor) {
        this.nomePastor = nomePastor;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getDisturbios() {
        return disturbios;
    }

    public void setDisturbios(String disturbios) {
        this.disturbios = disturbios;
    }

    public String getRestricaoAtividadeFisica() {
        return RestricaoAtividadeFisica;
    }

    public void setRestricaoAtividadeFisica(String restricaoAtividadeFisica) {
        RestricaoAtividadeFisica = restricaoAtividadeFisica;
    }

    public String getSabeNadar() {
        return sabeNadar;
    }

    public void setSabeNadar(String sabeNadar) {
        this.sabeNadar = sabeNadar;
    }

    public String getMedicamentoContinuo() {
        return medicamentoContinuo;
    }

    public void setMedicamentoContinuo(String medicamentoContinuo) {
        this.medicamentoContinuo = medicamentoContinuo;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getFatorRh() {
        return fatorRh;
    }

    public void setFatorRh(String fatorRh) {
        this.fatorRh = fatorRh;
    }

    public String getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(String planoSaude) {
        this.planoSaude = planoSaude;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getInformacaoAdicional() {
        return informacaoAdicional;
    }

    public void setInformacaoAdicional(String informacaoAdicional) {
        this.informacaoAdicional = informacaoAdicional;
    }

    public String getCartaRecomendacao() {
        return cartaRecomendacao;
    }

    public void setCartaRecomendacao(String cartaRecomendacao) {
        this.cartaRecomendacao = cartaRecomendacao;
    }

    public String getAutorizacaoAtivadadeExterna() {
        return autorizacaoAtivadadeExterna;
    }

    public void setAutorizacaoAtivadadeExterna(String autorizacaoAtivadadeExterna) {
        this.autorizacaoAtivadadeExterna = autorizacaoAtivadadeExterna;
    }

    public String getAutorizacaoAtivadadeInterna() {
        return autorizacaoAtivadadeInterna;
    }

    public void setAutorizacaoAtivadadeInterna(String autorizacaoAtivadadeInterna) {
        this.autorizacaoAtivadadeInterna = autorizacaoAtivadadeInterna;
    }

}
