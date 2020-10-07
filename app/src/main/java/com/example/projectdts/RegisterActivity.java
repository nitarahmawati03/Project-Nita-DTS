package com.example.projectdts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class RegisterActivity extends AppCompatActivity {

    private EditText edtNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        edtNama = findViewById(R.id.edtTxtNama);
    }

    public void Mulai(View view) {
        if(TextUtils.isEmpty(edtNama.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Nama tidak boleh kosong!",
                    Toast.LENGTH_LONG).show();
        }else{
            startActivity(new Intent(RegisterActivity.this,MainActivity.class));
            Nama.nama_user = edtNama.getText().toString();
            finish();
        }
    }
}