package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.primero);
    }

    public void irActividad2(View v)
    {
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }

    public void abrirWeb(View v)
    {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tiktok.com/"));
        startActivity(i);
    }

    public void abrirMapa(View v)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("geo: -31.417, -64.183"));
        startActivity(i);
    }

    public void mostrarContactos(View v)
    {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people/"));
        startActivity(i);
    }

    public void abrirCamara(View v)
    {
        Intent i = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivity(i);
    }

    public void abrirTelefono(View v)
    {
        Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: 8714344865"));
        startActivity(i);
    }

    public void enviarSMS(View v)
    {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("sms: 8714344865"));
        startActivity(i);
    }
}