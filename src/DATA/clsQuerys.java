/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author MSarazua
 */
public class clsQuerys {

    public clsQuerys() {
    }
    //Metodos
    public int fncLogin(String pUsuario, String pPass){
        int Resp = 0;
        try{
            Statement sql = clsConexion.getConexion().createStatement();
            String Query = "SELECT Usuario FROM TB_PERSONA WHERE Usuario = '" +  pUsuario 
                    + "'AND PASS = '" + pPass + "';";
            System.out.println(Query);
            ResultSet resultado = sql.executeQuery(Query);
            if(resultado!=null && resultado.next()){
                Resp = 1;
                System.out.println("Tiene Resultados.");
                
            }else{
                System.out.println("El usuario o contraseña no son correctos.");
            }
 
        }catch(SQLException Ex){
            System.out.println(Ex.getMessage());
        }

        return Resp;
    }  
    
    public int fncIngresoPersona(String pNombre ,String pApellido,char pSexo, int  pTIPO_PERSONA , String pUSUARIO, String pPASS)
    {
        int Resp = 0;
        try{
            Statement sql = clsConexion.getConexion().createStatement();
            String Query = "INSERT  INTO TB_PERSONA(NOMBRE,APELLIDO,SEXO,TIPO_PERSONA,USUARIO,PASS) VALUES ('"+ pNombre +"','"+ pApellido+"','"+pSexo+"','"+pTIPO_PERSONA+"','"+pUSUARIO+"','"+pPASS+"' );";
            System.out.println(Query);
            ResultSet resultado = sql.executeQuery(Query);
            if(resultado!=null && resultado.next()){
                Resp = 1;
                System.out.println("Ingreso correcto.");
                
            }else{
                System.out.println("Rellene bien los campos");
            }

        }catch(SQLException Ex){
            System.out.println(Ex.getMessage());
              Resp = 2;
            
        }

        return Resp;
    }
}
