package com.example.shomronsitesmemorygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Metzuda_britit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metzuda_britit);
    }

    public void onClicked(View view)
    {
        Toast.makeText(getApplicationContext(), "מצודה בריטית!!", Toast.LENGTH_LONG).show();
        goToWebsite("https://www.hamichlol.org.il/%D7%94%D7%9E%D7%A6%D7%95%D7%93%D7%94_%D7%94%D7%91%D7%A8%D7%99%D7%98%D7%99%D7%AA_%D7%91%D7%A0%D7%95%D7%95%D7%94_%D7%A6%D7%95%D7%A3");
    }


    public void goToWebsite(String url)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url)) ;
        startActivity(intent);
    }
}
