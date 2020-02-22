package com.example.shomronsitesmemorygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Old_shilo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_old_shilo);
    }

    public void onClicked(View view)
    {
        Toast.makeText(getApplicationContext(), "שילה הקדומה!!", Toast.LENGTH_LONG).show();
        goToWebsite("https://www.a-shiloh.co.il/");
    }


    public void goToWebsite(String url)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url)) ;
        startActivity(intent);
    }
}
