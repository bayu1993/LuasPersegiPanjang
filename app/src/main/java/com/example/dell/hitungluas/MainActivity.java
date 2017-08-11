package com.example.dell.hitungluas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtPanjang, edtLebar;
    private Button btnHitung;
    private TextView txtLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Hitung Luas persegi Panjang");

        edtPanjang = (EditText)findViewById(R.id.edt_panjang);
        edtLebar = (EditText)findViewById(R.id.edt_lebar);
        btnHitung = (Button)findViewById(R.id.btn_hitung);
        txtLuas = (TextView)findViewById(R.id.txt_luas);

        btnHitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(TextUtils.isEmpty(edtPanjang.getText()) || TextUtils.isEmpty(edtLebar.getText())){

                    Toast.makeText(MainActivity.this,"Nilai yang dimasukkan tidak boleh kosong",Toast.LENGTH_SHORT).show();

                }else if(edtPanjang.getText().toString().equals(".") || edtLebar.getText().toString().equals('.')){
                   Toast.makeText(MainActivity.this,"Terdapat Kesalahan dalam memasukkan panjang atau lebar",Toast.LENGTH_SHORT).show();
                }
                else {
                    String panjang = edtPanjang.getText().toString().trim();
                    String lebar = edtLebar.getText().toString().trim();

                    double p = Double.parseDouble(panjang);
                    double l = Double.parseDouble(lebar);

                    double luas = p * l;

                    txtLuas.setText("Hasil peritungan luas persegi panjang = "+luas);

                }
            }
        });
    }
}
