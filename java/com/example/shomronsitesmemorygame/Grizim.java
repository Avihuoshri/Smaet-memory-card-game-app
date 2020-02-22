package com.example.shomronsitesmemorygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Grizim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grizim);
    }

    public void onClicked(View view)
    {
        Toast.makeText(getApplicationContext(), "מצפה קידה!!", Toast.LENGTH_LONG).show();
        goToWebsite("https://www.parks.org.il/reserve-park/%D7%94%D7%A8-%D7%92%D7%A8%D7%99%D7%96%D7%99%D7%9D/");

    }


    public void shomronim_info(View view)
    {
        Toast.makeText(getApplicationContext(), "מצפה קידה!!", Toast.LENGTH_LONG).show();
        goToWebsite("https://www.youtube.com/watch?v=t_xby14mXuo");

    }
    public void goToWebsite(String url)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url)) ;
        startActivity(intent);
    }
}
