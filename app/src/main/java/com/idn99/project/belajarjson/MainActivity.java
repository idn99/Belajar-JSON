package com.idn99.project.belajarjson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView tv1,tv2,tv3;
    private ListView lv;
    private Person person;
    private ArrayList<Alamat> alamats = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.name);
        tv2 = findViewById(R.id.age);
        tv3 = findViewById(R.id.gender);

        lv = findViewById(R.id.lv_alamat);

        generalisasiJSON();

        AddressAdapter adapter = new AddressAdapter(this,person.getAlamats());
        lv.setAdapter(adapter);

    }

    public void generalisasiJSON(){
        String json = loadJSONFromRaw();
        try {
            JSONObject jsonObject = new JSONObject(json);

            JSONObject jsonPerson = jsonObject.getJSONObject("person");
            String nama = jsonPerson.getString("name");
            int age = jsonPerson.getInt("age");
            String gender = jsonPerson.getString("gender");

            JSONArray jsonArray = jsonPerson.getJSONArray("address");
            for (int j=0;j<jsonArray.length();j++){
                JSONObject jsonAddress = jsonArray.getJSONObject(j);
                String namaAlamat = jsonAddress.getString("nameAddress");
                String detailAlamat = jsonAddress.getString("addressDetail");
                String kota = jsonAddress.getString("city");

                Alamat alamat = new Alamat(namaAlamat,detailAlamat,kota);
                alamats.add(alamat);

            }

            person = new Person(nama,age,gender, alamats);

            tv1.setText("Nama   : "+person.getNamePerson());
            tv2.setText("Umur   : "+String.valueOf(person.getAgePerson()));
            tv3.setText("Gender : "+person.getGenderPerson());

        }catch (JSONException ex){
            ex.printStackTrace();
        }
    }

    public String loadJSONFromRaw() {
        String json = null;
        try {
            InputStream is = getResources().openRawResource(R.raw.data);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }
}
