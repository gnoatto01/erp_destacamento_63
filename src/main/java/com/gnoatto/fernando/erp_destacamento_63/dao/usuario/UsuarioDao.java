package com.gnoatto.fernando.erp_destacamento_63.dao.usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.gnoatto.fernando.erp_destacamento_63.dao.ConexaoBanco;
import com.gnoatto.fernando.erp_destacamento_63.dao.DaoGenerico;
import com.gnoatto.fernando.erp_destacamento_63.model.usuario.Usuario;
import com.gnoatto.fernando.util.HashUtil;

public class UsuarioDao extends DaoGenerico<Usuario> {

    ResultSet rs;
    private static final Logger logger = Logger.getLogger("UsuarioDao");
    PreparedStatement stmt;
    private Connection conexaoBanco;

    public UsuarioDao() {
        conexaoBanco = ConexaoBanco.getInstance().getConexao();
    }

    @Override
    protected Usuario mapearParaAEntidade(ResultSet rs) {
        try {
            Usuario usuario = new Usuario();
            usuario.setId(rs.getInt("id"));
            usuario.setUsuario(rs.getString("usuario"));
            usuario.setSenha(rs.getString("senha"));
            usuario.setSalt(rs.getString("salt"));
            usuario.setNomeCompleto(rs.getString("nome_completo")); 
            usuario.setEmail(rs.getString("email"));
            usuario.setIdNivelAcesso(rs.getInt("id_nivel_acesso"));
            usuario.setAtivo(rs.getString("ativo"));
            return usuario;
        } catch (SQLException e) {

            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Usuario> listarTodos() {
        String sql = " select * from usuario ";
        List<Usuario> listaRetorno = new ArrayList<>();

        try {
            stmt = conexaoBanco.prepareStatement(sql);
            logger.info(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Usuario usuario = mapearParaAEntidade(rs);
                listaRetorno.add(usuario);
            }

        } catch (SQLException ex) {
            logger.log(Level.SEVERE, "Erro ao executar a consulta ao banco de dados: {0}", ex.getMessage());
        } finally {
            try {
                stmt.close();
                rs.close();
            } catch (SQLException ex) {
                logger.log(Level.SEVERE, "Erro ao fechar conexão com o banco de dados: {0}", ex.getMessage());
            }
        }

        return listaRetorno;
    }

    @Override
    public boolean inserirDados(Usuario entidade) {
        String sql = " insert into usuario (usuario,senha,salt,nome_completo,email,id_nivel_acesso,ativo) values (?,?,?,?,?,?,?) ";

        try {
            stmt = conexaoBanco.prepareStatement(sql);
            stmt.setString(1, entidade.getUsuario());
            stmt.setString(2, HashUtil.stringToMd5(entidade.getSenha() + entidade.getSalt()));
            stmt.setString(3, Calendar.getInstance().getTime().toString() + "#$%@");
            stmt.setString(4, entidade.getNomeCompleto());
            stmt.setString(5, entidade.getEmail());
            stmt.setInt(6, entidade.getIdNivelAcesso());
            stmt.setString(7, entidade.getAtivo());
            stmt.execute();
            logger.info("Dados gravados com sucesso...");
            return true;

        } catch (SQLException ex) {
            logger.log(Level.SEVERE, "Erro ao inserir dados no banco de dados... {0}", ex.getMessage());
            return false;
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                logger.log(Level.SEVERE, "Erro ao fechar conexão com bando de dados... {0}", ex.getMessage());
            }
        }
    }

    @Override
    protected boolean removerDados(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removerDados'");
    }

    @Override
    protected boolean alterarDados(Usuario entidade) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alterarDados'");
    }

}
