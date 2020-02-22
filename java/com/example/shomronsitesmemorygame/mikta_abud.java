package com.example.shomronsitesmemorygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class mikta_abud extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mikta_abud);
    }


    public void onClicked(View view)
    {
        Toast.makeText(getApplicationContext(), "מקטע עבוד!!", Toast.LENGTH_LONG).show();
        goToWebsite("https://danielventura.wikia.org/he/wiki/%D7%91%D7%99%D7%AA_%D7%90%D7%A8%D7%99%D7%94");
    }
    public void onVideoClicked(View view)
    {
        Toast.makeText(getApplicationContext(), "מקטע עבוד!!", Toast.LENGTH_LONG).show();
        goToWebsite("https://www.youtube.com/watch?v=UAySQAvDANk");
    }

    public void goToWebsite(String url)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url)) ;
        startActivity(intent);
    }
}
