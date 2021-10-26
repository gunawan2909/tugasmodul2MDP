package com.example.modul2_kel10;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter<Data> {
    private Context Mcontext;
    private int Mresourse;

    public Adapter(@NonNull Context context, int resource, @NonNull ArrayList<Data> objects) {
        super(context, resource, objects);
        this.Mcontext = context;
        this.Mresourse = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(Mcontext);
        convertView = layoutInflater.inflate(Mresourse,parent,false);

        TextView txNama = convertView.findViewById(R.id.NAMA);
        TextView txNim = convertView.findViewById((R.id.NIM));
        txNama.setText(getItem(position).getNama());
        txNim.setText(getItem(position).getNim());



        return convertView;
    }
}
