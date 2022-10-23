package com.example.pm013p01.tablas;

public class Transacciones {
    //nombre de la base de datos.

    public static final String  NamedDatabase= "PM01DB";
    //cracion de la base de datos.
    public static final String TbContactos="Contactos";
    //campos de la tablas persona.
    public static final String id="id";
    public static final String pais ="pais";
    public static final String nombres="nombres";
    public static final String telefono ="telefono";
    public static final String nota="nota";


//ddl
public static final String CTContactos = "CREATE Table contactos (id INTEGER PRIMARY KEY AUTOINCREMENT, " +
        "pais TEXT, nombres TEXT, telefono TEXT, nota TEXT)";

    public static final String DropTContactos = "Drop Table IF EXISTS contactos";

    public static final String GetContactos = "SELECT * FROM" + Transacciones.TbContactos;
}
