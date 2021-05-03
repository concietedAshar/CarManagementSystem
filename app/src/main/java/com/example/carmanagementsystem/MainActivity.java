package com.example.carmanagementsystem;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity implements CarAdapter.CarSelected {

    TextView tvOName,tvOMobileNo,tvOInformation;
    Button btnCarInfo,btnOwnerInfo;
    ImageView imgOCar;

    ConstraintLayout constraintLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();


    }

    private void init() {
        tvOMobileNo = findViewById(R.id.tvOMobileNo);
        tvOName = findViewById(R.id.tvOName);
        btnOwnerInfo = findViewById(R.id.btnOwnerInfo);
        btnCarInfo  = findViewById(R.id.btnCarInfo);
        tvOInformation = findViewById(R.id.tvOInformation);
        imgOCar  = findViewById(R.id.imgOCar);
    }

    @Override
    public void onCarClicked(int index) {
        btnOwnerInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imgOCar.setVisibility(View.GONE);
                tvOName.setText(CarData.information.get(index).getName());
                tvOName.setVisibility(View.VISIBLE);
                tvOMobileNo.setText(CarData.information.get(index).getPhoneNo());
                tvOMobileNo.setVisibility(View.VISIBLE);
                tvOInformation.setVisibility(View.VISIBLE);
            }
        });

      btnCarInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOName.setVisibility(View.GONE);
                tvOMobileNo.setVisibility(View.GONE);
                tvOInformation.setVisibility(View.GONE);
                imgOCar.setImageResource(CarData.information.get(index).getImageId());
                imgOCar.setVisibility(View.VISIBLE);

                Toast.makeText(MainActivity.this, "Clicked Car Info", Toast.LENGTH_SHORT).show();
            }
        });

    }
}