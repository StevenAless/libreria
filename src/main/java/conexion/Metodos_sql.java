package conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

public class Metodos_sql {

    public static ConexionBD conexion = new ConexionBD();
    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero = 0;
    public static int busqueda_id;

    public int guardar(String nombre, String apellidos, String correo, String contraseña) {
        int result = 0;
        Connection conection = null;

        String sentencia_guardar = ("INSERT INTO usuarios (nombre,apellidos,correo,contraseña,permisos) VALUES (?,?,?,?,0)");
        try {
            conection = ConexionBD.conectar();
            sentencia_preparada = conection.prepareStatement(sentencia_guardar);
            sentencia_preparada.setString(1, nombre);
            sentencia_preparada.setString(2, apellidos);
            sentencia_preparada.setString(3, correo);
            sentencia_preparada.setString(4, contraseña);

            result = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conection.close();

        } catch (Exception e) {
            System.out.println(e);
            
        }
        return result;
    }

    public static Map<String,String> buscarNombre(String correo) {
        String busqueda_nombre = null;
        Connection conection = null;
        Map<String, String> dato  = new HashMap();
        try {
            conection = ConexionBD.conectar();
            String sentencia_buscar = ("SELECT id_usuario,nombre,apellidos, permisos FROM usuarios WHERE correo = '" + correo + "'");
            sentencia_preparada = conection.prepareStatement(sentencia_buscar);
            resultado = sentencia_preparada.executeQuery();
            if (resultado.next()) {
                int id_usuario = resultado.getInt("id_usuario");
                String nombre = resultado.getString("nombre");
                String apellidos = resultado.getString("apellidos");
                int permisos = resultado.getInt("permisos");
                busqueda_nombre = (nombre + " " + apellidos);
                busqueda_id = id_usuario;
                dato.put("nombre", busqueda_nombre);
                dato.put("id",String.valueOf(id_usuario));
                dato.put("permisos",String.valueOf(permisos));
            }
            conection.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return dato;
    }

    public static String buscarUsuarioRegistrado(String correo, String contraseña) {
        String busqueda_usuario = null;
        Connection conection = null;

        try {
            conection = ConexionBD.conectar();
            String sentencia_buscar_usuario = ("SELECT nombre,correo,contraseña FROM usuarios WHERE correo = '" + correo + "' && contraseña = '" + contraseña + "'");
            sentencia_preparada = conection.prepareStatement(sentencia_buscar_usuario);
            resultado = sentencia_preparada.executeQuery();
            if (resultado.next()) {
                busqueda_usuario = "Usuario encontrado";
            } else {
                busqueda_usuario = "Usuario no encontrado";
            }
            conection.close();

        } catch (Exception e) {
            System.out.println(e);

        }
        return busqueda_usuario;
    }

}
