package com.addetal.top10colombia;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {

    TextView titleDescriptionTextView;
    TextView cityDescriptionTextView;
    TextView statusDescriptionTextView;
    TextView nameTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        ListElement element = (ListElement) getIntent().getSerializableExtra("ListElement");
        titleDescriptionTextView = findViewById(R.id.titleDescriptionTextView);
        cityDescriptionTextView = findViewById(R.id.cityDescriptionTextView);
        statusDescriptionTextView = findViewById(R.id.statusDescriptionTextView);
        nameTextView = findViewById(R.id.nameTextView);


        titleDescriptionTextView.setText(element.getName());
        titleDescriptionTextView.setTextColor(Color.parseColor(String.valueOf(element.getColor())));

        cityDescriptionTextView.setText(element.getCity());

        statusDescriptionTextView.setText(element.getStatus());
        statusDescriptionTextView.setTextColor(Color.GREEN);

        nameTextView.setText(element.getTop());
        nameTextView.setTextColor(Color.CYAN);
    }
}