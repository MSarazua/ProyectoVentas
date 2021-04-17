/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author MSarazua
 */
public class clsConexion {
    public static Connection getConexion(){
<<<<<<< HEAD
        String Conexion = "jdbc:sqlserver://localhost:1433;databaseName=BD_UMG "
                + "user=SA; password=Alfredo2000; loginTimeout=30";
=======
        String Conexion = "jdbc:sqlserver://172.17.0.2:1433;databaseName=BD_UMG; "
                + "user=sa; password=my-secret-pw; loginTimeout=30";
>>>>>>> 4e95ab4b81cb50627c50122f1c8344284d92362a
        try{
            Connection con = DriverManager.getConnection(Conexion);
            return con;
        }catch(SQLException ex){
            System.out.println(ex.toString());
            return null;
        }
    }
}
