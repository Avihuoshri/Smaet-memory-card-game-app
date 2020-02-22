package com.example.shomronsitesmemorygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Meir_fountain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meir_fountain);
    }

    public void onClicked(View view)
    {
        Toast.makeText(getApplicationContext(), "הפסקת צהריים במעיין מאיר!!", Toast.LENGTH_SHORT).show();
        goToWebsite("https://www.sabresim.co.il/node/90468/%D7%9E%D7%A2%D7%99%D7%99%D7%9F-%D7%9E%D7%90%D7%99%D7%A8-%D7%91%D7%A0%D7%95%D7%95%D7%94-%D7%A6%D7%95%D7%A3");
    }

    public void hebrew_explenation(View view)
    {
        Toast.makeText(getApplicationContext(), "הסבר בעברית", Toast.LENGTH_SHORT).show();
        goToWebsite("http://www.masbiran.com/sites/default/files/%D7%AA%D7%97%D7%A0%D7%94%204.mp3");
    }

    public void english_explenation(View view)
    {
        Toast.makeText(getApplicationContext(), "הסבר באנגלית", Toast.LENGTH_SHORT).show();
        goToWebsite("http://www.masbiran.com/sites/default/files/station%204_0.mp3");
    }

    public void goToWebsite(String url)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url)) ;
        startActivity(intent);
    }
}
