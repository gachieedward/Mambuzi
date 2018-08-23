package com.example.student.mambuzi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView quantity;
    Button numofCups;
    TextView price;
    int cups=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quantity=(TextView)findViewById(R.id.quantity_text_view);
        numofCups=(Button)findViewById(R.id.num_of_Cups);
        price=(TextView)findViewById(R.id.price);
    }
    public void addCups(View view){
        cups=cups+1;
        String strCups=String.valueOf(cups+"cups ordered");
        quantity.setText(strCups);
        setPrice(view);
    }
    public void setPrice(View view){
        int priceint=20*cups;
        String strPrice=String.valueOf(priceint);
        price.setText("The cost is"+ strPrice);

    }
    public void removecups(View view){
        if (cups >= 1) {
        cups=cups-1;
        String strcups=String.valueOf(cups+"cups ordered");
        quantity.setText(strcups);
        setPrice(view);
    }
    else{
            Toast.makeText(this,"You must order at least 1 cup",Toast.LENGTH_SHORT).show();
        }
    }
    public void feedback(View view){
        Toast.makeText(this,"Thank you customer",Toast.LENGTH_SHORT).show();
        openMessage(view);
    }
    public void openMessage(View view){
       Intent intent =new Intent( this,Message.class);
        startActivity(intent);
    }

}
