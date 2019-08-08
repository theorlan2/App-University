package com.example.danysantos.trabajofinalapp;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class otherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        Resources res = getResources();
        Bundle datos = this.getIntent().getExtras();
        //String id_select = datos.getString('id_select');
        String id_select = "js_title";

        int resId =  getResources().getIdentifier(id_select , "string", getPackageName());
        String text = String.format(res.getString(resId));

        TextView textTitle = (TextView) findViewById(R.id.TextViewTitle01);
        textTitle.setText(text);
    }
}
