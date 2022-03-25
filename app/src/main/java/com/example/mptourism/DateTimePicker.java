package com.example.mptourism;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.DatePicker;
import android.widget.TextView;




import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Calendar;

public class DateTimePicker extends AppCompatActivity {

    FloatingActionButton btnDate;

    TextView dateView;

    WebView webView;

    DatePickerDialog.OnDateSetListener datePickerDialog = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker datePicker, int year, int month, int date) {
            dateView.setText(year+"/"+(month+1)+"/"+date);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_time_picker);



        webView = findViewById(R.id.webvidew);

        // enable the javascript to load the url
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

        // add the url of gif
        webView.loadUrl("https://freefrontend.com/assets/img/react-js-timepickers/react-timepicker.gif");

        btnDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Calendar calendar = Calendar.getInstance();

                        new DatePickerDialog(DateTimePicker.this,  datePickerDialog , calendar.get(Calendar.YEAR),
                                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DATE)).show();

            }
        });
    }
}