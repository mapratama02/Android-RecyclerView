package com.mapratama02.www.recyclerviewdicoding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.Objects;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int id = getIntent().getIntExtra("id", 1);
        String name = getIntent().getStringExtra("name");
        String desc = getIntent().getStringExtra("desc");
        String img = getIntent().getStringExtra("img");

        getSupportActionBar().setTitle(name);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        TextView tv_desc = findViewById(R.id.tv_desc_detail);
        tv_desc.setText(desc);

        ImageView img_detail = findViewById(R.id.img_detail);
        Glide.with(this).asBitmap().load(img).into(img_detail);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
