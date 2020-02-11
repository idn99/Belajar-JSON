package com.idn99.project.belajarjson;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AddressAdapter extends ArrayAdapter {
    private Context mContext;
    private ArrayList<Alamat> alamats;

    public AddressAdapter(@NonNull Context context, ArrayList<Alamat> alamats) {
        super(context, 0, alamats);
        this.mContext = context;
        this.alamats = alamats;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(mContext).inflate(R.layout.isi_list_view,parent,false);

        Alamat alamat = alamats.get(position);

        TextView tva1,tva2,tva3;

        tva1 = convertView.findViewById(R.id.nama_alamat);
        tva2 = convertView.findViewById(R.id.detail_alamat);
        tva3 = convertView.findViewById(R.id.kota);

        tva1.setText(alamat.getNamaAddress());
        tva2.setText(alamat.getDetailAddress());
        tva3.setText(alamat.getCity());

        return convertView;
    }
}
