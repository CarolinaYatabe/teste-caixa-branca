
package testecaixabranca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class User {
    //1
    public Connection conectarBD(){
        //2
        Connection conn = null;
        try{
            Class.forName("com.mysql.Driver.Manager").newInstance();
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            conn = DriverManager.getConnection(url);
        }catch (Exception e){ }
        return conn;}
    public String nome="";
    public boolean result = false;
    public boolean verificarUsuario(String login, String senha){
        //3
        String sql = "";
        //4
        Connection conn = conectarBD();
        //INSTRUÇÃO SQL
        //5
        sql += "select nome from usuários ";
        sql += "where login = " + "'" + login + "'";
        sql += "  and senha  = " + "'" + senha  + "';";
    //6    
    try{
    //7
        //8
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        if(rs.next()){
            //8
            result = true;
            //9
            nome = rs.getString("nome");}
            //10
        //11 - result = false
        //12 - fim do resultado
        //13
        }catch (Exception e){ }
        //14
        return result;}
    }
