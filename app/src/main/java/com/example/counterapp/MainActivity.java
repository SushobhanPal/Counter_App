package com.example.counterapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout cl;
    private int countvar=0;
TextView countText;
Button resetbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        cl=findViewById(R.id.main);
        countText=findViewById(R.id.countTxt);
        resetbtn=findViewById(R.id.resetBtn);;

        cl.setOnClickListener(v->{
            countvar++;
            countText.setText(String.valueOf(countvar));
        });
        resetbtn.setOnClickListener(v -> {
                    countvar=0;
                    countText.setText(String.valueOf(countvar));
                }
        );
    }
}