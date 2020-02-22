package com.example.shomronsitesmemorygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Huvalta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huvalta);
    }

    public void onClicked(View view)
    {
        Toast.makeText(getApplicationContext(), "אתר החובלתא!!", Toast.LENGTH_LONG).show();
        goToWebsite("https://www.nevetzuf.co.il/%D7%AA%D7%99%D7%99%D7%A8%D7%95%D7%AA/%D7%90%D7%AA%D7%A8-%D7%97%D7%95%D7%91%D7%9C%D7%AA%D7%90/");

    }


    public void goToWebsite(String url)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url)) ;
        startActivity(intent);
    }
}
