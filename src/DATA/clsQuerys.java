/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import BACKEND.clsProducto;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
            String Query = "SELECT USUARIO FROM TB_PERSONA WHERE USUARIO = '" +  pUsuario 
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
    
     public int fncIngresoProducto( String prNombre, String prDescripcion, int prCantidad, double prPrecio, String prEstatus){
        int retorno=0; 
        try{
            Connection Con = clsConexion.getConexion();
            String consulta = "INSERT INTO TB_INVENTARIO (PRODUCTO,DESCRIPCION,CANTIDAD, PRECIO, ESTATUS) VALUES (?,?,?,?,?)";
            PreparedStatement P = Con.prepareStatement(consulta);
            P.setString(1, prNombre);
            P.setString(2, prDescripcion);
            P.setInt(3, prCantidad);
            P.setDouble(4, prPrecio);
            P.setString(5, prEstatus);
            P.executeUpdate();
            retorno = 1;
            
        }catch(SQLException Ex){
            System.out.println(Ex.getMessage());
        }
        return retorno;
    }
     public int fncIngresoProducto2( clsProducto objProducto  ){
        int retorno=0; 
        try{
            Connection Con = clsConexion.getConexion();
            String consulta = "INSERT INTO TB_INVENTARIO (PRODUCTO,DESCRIPCION,CANTIDAD, PRECIO, ESTATUS) VALUES (?,?,?,?,'S')";
            PreparedStatement P = Con.prepareStatement(consulta);
            P.setString(1, objProducto.getNombre());
            P.setString(2, objProducto.getDescripcion());
            P.setInt(3, objProducto.getCantidad());
            P.setDouble(4, objProducto.getPrecio());
           
           
            P.executeUpdate();
            retorno = 1;
            
        }catch(SQLException Ex){
            System.out.println(Ex.getMessage());
        }
        return retorno;
    }
     
    public ResultSet fncConsultaInventario(int cod){
        ResultSet rs = null;
        try{
            Connection Con = clsConexion.getConexion();  //CONEXION
            String consulta = "SELECT COD_PRODUTO, PRODUCTO, DESCRIPCION, CANTIDAD, PRECIO, ESTATUS FROM TB_INVENTARIO";
            if(cod != 0){
                consulta = consulta + " WHERE COD_PRODUTO =" + cod;
            }
            PreparedStatement ps = Con.prepareStatement(consulta);
            rs = ps.executeQuery();
            
            
        }catch(SQLException Ex){
            System.out.println(Ex.getMessage());
        } 
        
        
        return rs;
    }
    
      public int fncEliminar(int COD){
        int Resp=0; 
        try{
            Connection Con = clsConexion.getConexion(); 
            String consulta = "DELETE FROM TB_INVENTARIO WHERE COD_PRODUTO = " + COD;
            PreparedStatement ps = Con.prepareStatement(consulta);
            ps.executeUpdate(); 
            Resp = 1;
            
        }catch(SQLException Ex){
            System.out.println(Ex.getMessage());
        }
        return Resp;
    }
      
    public int fncModificar( clsProducto objProducto){
        int Resp=0; // 0 no se ingreso.
        try{
            Connection Con = clsConexion.getConexion();  //CONEXION A BD
            String consulta = "UPDATE TB_INVENTARIO SET PRODUCTO = ?, DESCRIPCION = ?, CANTIDAD = ?, PRECIO = ?, ESTATUS = ? WHERE COD_PRODUTO = ?";
            PreparedStatement ps = Con.prepareStatement(consulta);
            ps.setString(1, objProducto.getNombre());
            ps.setString(2, objProducto.getDescripcion());
            ps.setInt(3, objProducto.getCantidad() );
            ps.setDouble(4, objProducto.getPrecio());  
            ps.setString(5, objProducto.getEstatus());
            ps.setInt(6, objProducto.getCOD_PRODUTO());
       
            
            
            ps.executeUpdate(); //EJECUTA LA SENTENCIA EN LA BASE DE DATOS
            Resp = 1;
            
        }catch(SQLException Ex){
            System.out.println(Ex.getMessage());
        }
        return Resp;
    }  
}
