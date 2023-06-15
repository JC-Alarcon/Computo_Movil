package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
ListView lsvDish;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lsvDish= findViewById(R.id.lvsDish);
        ArrayList<Dish> arr= new ArrayList<>();

        Random r= new Random();

        arr.add(new Dish(R.drawable.cpu,10,"CPU"));
        arr.add(new Dish(R.drawable.gabinete,r.nextInt(10)*5,"Gabinete"));
        arr.add(new Dish(R.drawable.monitor,r.nextInt(10)*5,"Monitor"));
        arr.add(new Dish(R.drawable.mother,r.nextInt(10)*5,"Mother"));
        arr.add(new Dish(R.drawable.mouse,r.nextInt(10)*5,"Mouse"));
        arr.add(new Dish(R.drawable.power,r.nextInt(10)*5,"Power"));
        arr.add(new Dish(R.drawable.ram,r.nextInt(10)*5,"Ram"));
        arr.add(new Dish(R.drawable.ssd,r.nextInt(10)*5,"Ssd"));
        arr.add(new Dish(R.drawable.teclado,r.nextInt(10)*5,"Teclado"));


        DishAdapter adapter = new DishAdapter(this,0,arr);
        lsvDish.setAdapter(adapter);


    }

    public void irContenido1(View view){
        Intent i = new Intent(this, SegundaPantalla.class);
        startActivity(i);
    }

    public void irContenido2(View view){
        Intent i = new Intent(this, SegundaPantalla.class);
        startActivity(i);
    }

    public void irContenido3(View view){
        Intent i = new Intent(this, SegundaPantalla.class);
        startActivity(i);
    }

    public void irContenido4(View view){
        Intent i = new Intent(this, SegundaPantalla.class);
        startActivity(i);
    }

    public void irContenido5(View view){
        Intent i = new Intent(this, SegundaPantalla.class);
        startActivity(i);
    }

    public void irContenido6(View view){
        Intent i = new Intent(this, SegundaPantalla.class);
        startActivity(i);
    }

    public void irContenido7(View view){
        Intent i = new Intent(this, SegundaPantalla.class);
        startActivity(i);
    }

    public void irContenido8(View view){
        Intent i = new Intent(this, SegundaPantalla.class);
        startActivity(i);
    }

    public void irContenido9(View view){
        Intent i = new Intent(this, SegundaPantalla.class);
        startActivity(i);
    }

    public void irBack(View view){
        Intent j = new Intent(this, MainActivity.class);
        startActivity(j);
    }
}
