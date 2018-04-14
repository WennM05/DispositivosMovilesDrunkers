package com.example.general.listalicor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

public class CatalogoLicor {

        private String titulo;
        private String catalogoId;
        private String descripcion;
        private int precio;
        private Drawable imagenLicor;



        public CatalogoLicor(String catalogoId, String titulo, String descripcion, int precio, Drawable imagenLicor) {
            this.titulo= titulo;
            this.descripcion = descripcion;
            this.imagenLicor = imagenLicor;
            this.catalogoId = catalogoId;
            this.precio= precio;
        }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescription(String descripcion) {
        this.descripcion = descripcion;
    }

    public Drawable getImagenLicor() {
        return imagenLicor;
    }

    public void setImagenLicor(Drawable imagenLicor) {
        this.imagenLicor = imagenLicor;
    }

    public String getCatalogoId(){
    return catalogoId;
        }

    public void setCatalogoId(String catalogoId){
        this.catalogoId = catalogoId;
    }
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

  /*
        ArrayAdapter<String> adaptador;
        ArrayList<CatalogoLicor> catalogo = new ArrayList<catalogo>();
        ListView listaLicor = (ListView) findViewById(R.id.listView);
        adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);
        listaLicor.setAdapter(adaptador);


    }*/
}
