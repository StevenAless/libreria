
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    
    public static String url="jdbc:mysql://localhost/login_bd";
    public static String usuario="root";
    public static String contraseña = "";
    public static String clase = "com.mysql.jdbc.Driver";
    
    public static Connection conectar(){
        Connection conexion =null;
        try {
            Class.forName(clase);
            conexion = (Connection) DriverManager.getConnection(url,usuario,contraseña);
            System.out.println("conexion establecida");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
            
        }
    return conexion;
    }
    
    
    
}
