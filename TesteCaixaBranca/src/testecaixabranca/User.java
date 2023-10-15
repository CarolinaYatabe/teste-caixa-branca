
package testecaixabranca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class User {
    //Estabelecer uma conexão com o banco de dados
    public Connection conectarBD(){
        Connection conn = null;
        try{
            Class.forName("com.mysql.Driver.Manager").newInstance();
            //Define a url de conexão com o banco de dados
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            //Estabelece conexão com o banco de dados
            conn = DriverManager.getConnection(url);
        }catch (Exception e){ } //Tratamento de exceções
        return conn;}//Retorna a conexão
    public String nome="";//Variável que armazena o nome do usuário
    public boolean result = false; //Variável que armazena o resultado da verificação
    public boolean verificarUsuario(String login, String senha){
        String sql = "";
        Connection conn = conectarBD(); //Estabelece conexão com o bvanco de dados
        //Consulta DQL para verificar o usuário com base no login e senha
        sql += "select nome from usuários ";
        sql += "where login = " + "'" + login + "'";
        sql += "  and senha  = " + "'" + senha  + "';";  
    try{
        //Cria um Statement para executar a consulta no banco de dados
        Statement st = conn.createStatement();
        //Executa a  consulta SQL e obtém resultados (ResultSet)
        ResultSet rs = st.executeQuery(sql);
        if(rs.next()){
            //Se  houver resultados, ddefine o resultado com true
            result = true;
            //Obtém o nome do usuário
            nome = rs.getString("nome");}
        }catch (Exception e){ } //Trata exceções
        //retorna o resultado ad verificação do usuário
        return result;}
    }
