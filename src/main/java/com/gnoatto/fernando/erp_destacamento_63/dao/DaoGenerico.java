package com.gnoatto.fernando.erp_destacamento_63.dao;

import java.sql.ResultSet;
import java.util.List;

public abstract class DaoGenerico<T> {

    protected abstract T mapearParaAEntidade(ResultSet rs);

    protected abstract List<T> listarTodos();

    protected abstract boolean inserirDados(T entidade);

    protected abstract boolean removerDados(int id);

    protected abstract boolean alterarDados(T entidade);

}
