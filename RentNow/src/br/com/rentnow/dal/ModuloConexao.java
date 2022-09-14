/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rentnow.dal;

import java.sql.*;
/**
 *
 * @author vinic
 */
public class ModuloConexao {
    //Metódo responsável por estabelecer a conexão com o banco de dados 
    public static Connection conector(){
        java.sql.Connection conexao = null; //Variável conexao, e o metodo conector
        
        //A linha abaixo "chama" o driver que eu importei aqui para biblioteca
        String driver = "com.mysql.cj.jdbc.Driver";
        
        //Armazenando informações referente ao banco de dados 
        String url = "jdbc:mysql://localhost:3306/recanto"; //Banco de dados que está conectado
        String user = "root";               //Usuário "root" do banco de dados
        String password = "Hangloose12";    //Senha do usuário root do banco de dados    
        
        //Estabelecendo a conexão com o banco de dados 
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            return null;
        }
    }
    
}
