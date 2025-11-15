package Login; // Pertence ao pacote Login

// Importação de classes para conexão ao Banco de Dados
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// Classe responsável pela conexão com o banco de dados e validação de usuário.
public class User {

    // Método que retorna uma conexão
    public Connection conectarBD() {
        Connection conn = null;
        try {
            // Carrega o driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver"); 

            // Conexão com o mesmo MySQL que o phpMyAdmin acessa
            String url = "jdbc:mysql://localhost:3306/login";
            String user = "root";     // Usuário do phpMyAdmin
            String password = "";   // Senha do usuário phpMyAdmin

            // Cria a conexão com o DriverManager
            conn = DriverManager.getConnection(url, user, password);
            
            // Mensagem de acesso ao Banco de Dados bem-sucedido
            System.out.println("Acesso ao Banco de dados permitido! \n==============================");
          
          // Exibe mensagem em caso de erro durante a conexão ao Banco de Dados
        } catch (Exception e) {
        	// Mensagem de acesso ao Banco de Dados mal-sucedido
        	System.out.println("Conexão inválida! Erro ao conectar na base de dados: " + e.getMessage()+"\n==============================");
        }

        return conn; // Retorna a conexão criada ou nula, se for o caso
    }

    // Método para validar login e senha 
    public boolean validarUsuario(String login, String senha) {
        boolean autenticado = false;
        // Busca o nome do usuário
        String sql = "SELECT nome FROM usuarios WHERE login = ? AND senha = ?";

        // Cria uma nova conexão e prepara os comandos SQL
        try (Connection conn = conectarBD();
             PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setString(1, login);
            pst.setString(2, senha);
           
            // Executa o SELECT e retorna um ResultSet
            try (ResultSet rs = pst.executeQuery()) {
                // Se encontrar um registro
            	if (rs.next()) {
                    String nome = rs.getString("nome"); // Puxa o nome do usuário
                    System.out.println("Usuário encontrado: " + nome +"\n------------------------------"); // Exibe o nome do usuário
                    autenticado = true; // Marca a autenticação como verdadeira
                } else {
                    System.out.println("Usuário não encontrado \n------------------------------"); // Caso não exista um registro no banco, conexão inválida
                }
            }
          // Exibe mensagem de erro na consulta.
        } catch (Exception e) {
            System.out.println("Erro ao verificar usuário: " + e.getMessage());
        }

        return autenticado; // Retorna true se o usuário existe, false se não existe
    }

    // Main que será exibido no console
    public static void main(String[] args) {
        User user = new User();
        // Chama o método passando o login e a senha
        boolean ok = user.validarUsuario("MateusBezerra", "123");
        
        // Exibe a última mensagem referente a conexão
        if (ok) {
            System.out.println("Conexão realizada com sucesso!");
        } else {
            System.out.println("Conexão inválida!");
        }
    }
}