package com.example.pm013p01;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.pm013p01.configuracion.SQLiteConexion;
import com.example.pm013p01.tablas.Contactos;
import com.example.pm013p01.tablas.Transacciones;

import java.util.ArrayList;

public class ActivityList extends AppCompatActivity {

    SQLiteConexion conexion;
    ListView listperson;
    ArrayList<Contactos> lista;
    ArrayList<String> listaconcatenada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        conexion = new SQLiteConexion(this, Transacciones.NamedDatabase, null, 1);

        listperson = (ListView) findViewById(R.id.listperson);
        GetListPerson();
        ArrayAdapter adp = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listaconcatenada);
        listperson.setAdapter(adp);

    }

    private void GetListPerson() {
        SQLiteDatabase db = conexion.getReadableDatabase();
        Contactos listcontactos = null;
        lista = new ArrayList<Contactos>();//lista objeto tipo contacto.

        //Cursor cursor = db.rawQuery(Transacciones.GetPersona, null);//
        Cursor cursor = db.rawQuery("SELECT * FROM " + Transacciones.TbContactos, null);

        while (cursor.moveToNext()) {
            listcontactos = new Contactos();
            listcontactos.setId(cursor.getInt(0));
            listcontactos.setPais(cursor.getString(2));
            listcontactos.setNombres(cursor.getString(1));
            listcontactos.setTelefono(cursor.getInt(3));
            listcontactos.setNota(cursor.getString(4));

            lista.add(listcontactos);
        }
        cursor.close();//para cerrar la base de datos
        llenarlista();
    }

    private void llenarlista() {

        listaconcatenada = new ArrayList<String>();
        for (int i = 0; i < lista.size(); i++) {

            listaconcatenada.add(lista.get(i).getNombres() + " | " +
                    lista.get(i).getPais() + " | " +
                    lista.get(i).getTelefono() + " | " +
                    lista.get(i).getNota());
        }

    }
}


