package com.example.suniapunya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    ImageView imageView;
    TextView name, desc;
    String playername,playerdesc;
    int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        imageView=findViewById(R.id.image);
        name=findViewById(R.id.name);
        desc=findViewById(R.id.desc);

        playername=getIntent().getStringExtra("name");
        playerdesc=getIntent().getStringExtra("desc");
        image=getIntent().getIntExtra("image",0);

        name.setText(playername);
        desc.setText(playerdesc);
        imageView.setImageResource(image);
    }
}