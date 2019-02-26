/*package com.example.alumno_fp.ejercicio_listas1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import java.util.List;

public class TravelAdapter extends Travel {
    public TravelAdapter(String place, String city, String country) {
        super(place, city, country);
    }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) getTravel()
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            if (null == convertView) {
                convertView = inflater.inflate(
                        R.layout.list_item_user,
                        parent,
                        false);
            }
            EditText place = convertView.findViewById(R.id.nombre_lugar);
            EditText city = convertView.findViewById(R.id.nombre_ciudad);
            EditText country = convertView.findViewById(R.id.nombre_pais);

            Travel item = getTravel (place);

            place.setText(item.getPlace());
            city.setText(item.getCity());
            country.setText(item.getCountry());

            return convertView;
        }


}*/