package com.segunfamisa.sample.xmlfonts;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView fontText = findViewById(R.id.text_programmatic);
        Typeface typeface = ResourcesCompat.getFont(this, R.font.app_font);
        fontText.setTypeface(typeface);
    }
}
