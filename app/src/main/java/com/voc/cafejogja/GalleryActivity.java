package com.voc.cafejogja;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class GalleryActivity extends AppCompatActivity {
    ImageView imgPreviewCafe;
    TextView tvNamaCafe, tvLokasiCafe, tvDetailCafe, tvJamBukaCafe;
    ArrayList<Cafe> listCafe = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        listCafe.addAll(CafeData.getListData());
        imgPreviewCafe = findViewById(R.id.photoCafe);
        tvNamaCafe = findViewById(R.id.titleCafe);
        tvLokasiCafe= findViewById(R.id.descriptionLokasi);
        tvDetailCafe = findViewById(R.id.description);
        tvJamBukaCafe = findViewById(R.id.descriptionJamBuka);

        getSupportActionBar().setTitle("Detail Cafe");

        respondIntent();
    }

    private void respondIntent() {
        if (getIntent().hasExtra("idCafe")) {
            Log.d("LISTMU", "tes cuk");
            int id = getIntent().getIntExtra("idCafe", 0);
            tvNamaCafe.setText(listCafe.get(id).getNama());
            tvLokasiCafe.setText(listCafe.get(id).getLokasi());
            tvDetailCafe.setText(listCafe.get(id).getDetail());
            tvJamBukaCafe.setText(listCafe.get(id).getJamBuka());
            Glide.with(this)
                    .asDrawable()
                    .load(listCafe.get(id).getFoto())
                    .into(imgPreviewCafe);
        }
    }
}
