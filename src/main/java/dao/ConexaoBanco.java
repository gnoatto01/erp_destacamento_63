package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoBanco {
    private Connection conexaoBancoDeDados;
    private static ConexaoBanco instancia = null;
    private Logger logger = Logger.getLogger("ConexaoDao");

    public ConexaoBanco() {
        try {
            String url = "jdbc:postgresql://localhost:5432/erp_destacamento_63";
            String usuario = "postgres";
            String senha = "postgres";
            this.conexaoBancoDeDados = DriverManager.getConnection(url, usuario, senha);
            this.logger.info("Conexão com o banco de dados estabelicida com sucesso..");

        } catch (SQLException var4) {
            this.logger.log(Level.SEVERE, "Erro ao tentar estabelecer conexão com o banco de dados... {0}",
                    var4.getMessage());
        }
    }

    public Connection getConexao() {
        return conexaoBancoDeDados;
    }

    public static ConexaoBanco getInstance() {
        if (instancia == null) {
            instancia = new ConexaoBanco();
        }
        return instancia;
    }

    public void FecharConexao() {
        try {
            if (this.conexaoBancoDeDados != null) {
                this.conexaoBancoDeDados.close();
                this.logger.info("Conexão com banco de dados fechada.");
            }
        } catch (SQLException var2) {
            this.logger.log(Level.WARNING, "Erro ao fechar conexao com banco de dados: {0}", var2.getMessage());
        }
    }
}
