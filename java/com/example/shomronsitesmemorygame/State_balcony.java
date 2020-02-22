package com.example.shomronsitesmemorygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class State_balcony extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state_balcony);
    }


    public void onClicked(View view)
    {
        Toast.makeText(getApplicationContext(), "נחל שילה - המרפסת של המדינה", Toast.LENGTH_LONG).show();
        goToWebsite("https://www.parks.org.il/reserve-park/%D7%A9%D7%9E%D7%95%D7%A8%D7%AA-%D7%A0%D7%97%D7%9C-%D7%A9%D7%99%D7%9C%D7%94-%D7%A2%D7%99%D7%9C%D7%99/");
    }


    public void goToWebsite(String url)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url)) ;
        startActivity(intent);
    }

}
