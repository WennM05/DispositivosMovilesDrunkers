package com.example.general.listalicor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ListView;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<CatalogoLicor> listaLicor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaLicor = new ArrayList<CatalogoLicor>();

            listaLicor.add(new CatalogoLicor("0", " Don Melchor", " No. 9 DEL MUNDO.",100000,
                    getResources().getDrawable(R.drawable.pag1)));
            listaLicor.add(new CatalogoLicor("1", " Terrunio", " Marques Casa Concha", 150000,
                    getResources().getDrawable(R.drawable.pag2)));
            listaLicor.add(new CatalogoLicor("2", " Trio Reserva", " Felicita el 2016 desde tu estado",200000,
                    getResources().getDrawable(R.drawable.pag3)));
            listaLicor.add(new CatalogoLicor("3", " Casillero del diablo", " Wine Legend",250000,
                    getResources().getDrawable(R.drawable.pag4)));
            listaLicor.add(new CatalogoLicor("4", " Concha y toro", " Ligera y simplemente delicioso",300000,
                    getResources().getDrawable(R.drawable.pag5)));
            AdaptadorLicor adaptador = new AdaptadorLicor(this);
            ListView licores = (ListView)findViewById(R.id.listViewlicores);
            licores.setAdapter(adaptador);

    }

    public class AdaptadorLicor extends ArrayAdapter<CatalogoLicor> {
        AppCompatActivity appCompatActivity;

        AdaptadorLicor(AppCompatActivity context) {
            super(context, R.layout.activity_catalogo_licor, listaLicor);
            appCompatActivity = context;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = appCompatActivity.getLayoutInflater();
            View item = inflater.inflate(R.layout.activity_catalogo_licor, null);

            TextView catalogoId = (TextView) item.findViewById(R.id.catalogoIdtxt);
            catalogoId.setText(listaLicor.get(position).getCatalogoId());

            TextView titulo = (TextView) item.findViewById(R.id.titulotxt);
            titulo.setText(listaLicor.get(position).getTitulo());

            TextView descripcion= (TextView) item.findViewById(R.id.descripciontxt);
            descripcion.setText(listaLicor.get(position).getDescripcion());

            TextView precio= (TextView) item.findViewById(R.id.preciotxt);
            precio.setText(listaLicor.get(position).getPrecio());

            ImageView licor1 = (ImageView) item.findViewById(R.id.Licor1);

            int id= getResources().getIdentifier(String.valueOf(listaLicor.get(position).getImagenLicor()),"drawable", getPackageName());
            licor1.setImageResource(id);
            return (item);

        }
    }
}
