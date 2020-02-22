package com.example.shomronsitesmemorygame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView curView = null;
    private int countPair = 0;
    private int picIndex ;
    final int[] drawable = new int[]
            {       R.drawable.shilo_hakduma, R.drawable.atar_hachavalta,
                    R.drawable.british_metsuda, R.drawable.maayan_meir,
                    R.drawable.mikta_abud, R.drawable.miktspe_kida,
                    R.drawable.shilo_stream
            };

    int[] pos = {0, 1, 2, 3, 4, 5, 6, 7, 0, 1, 2, 3, 4, 5, 6, 7};
    int currentPos = -1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = (GridView) findViewById(R.id.gridView);
        ImageAdapter imageAdapter = new ImageAdapter(this);
        gridView.setAdapter(imageAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                picIndex = pos[position];

                if (currentPos < 0)
                {
                    currentPos = position;
                    curView = (ImageView) view;
                    ((ImageView) view).setImageResource(drawable[pos[position]]);
                }
                else
                {
                        if (currentPos == position)
                        {
                            ((ImageView) view).setImageResource(R.drawable.hidden);
                        }
                        else if (pos[currentPos] != pos[position])
                        {
                            curView.setImageResource(R.drawable.hidden);
                            Toast.makeText(getApplicationContext(), "אין התאמה בין האתרים", Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            ((ImageView) view).setImageResource(drawable[pos[position]]);
                            switch (picIndex)
                            {
                                case 0 :
                                    Intent shilo_intent = new Intent(getBaseContext(),   Old_shilo.class);
                                    startActivity(shilo_intent);

                                    break;
                                case 1 :
                                    Intent huvalta_intent = new Intent(getBaseContext(),   Huvalta.class);
                                    startActivity(huvalta_intent);

                                    break;

                                case 2 :
                                    Intent metzuda_intent = new Intent(getBaseContext(), Metzuda_britit.class);
                                    startActivity(metzuda_intent);

                                    break;

                                case 3 :
                                    Intent meir_intent = new Intent(getBaseContext(), Meir_fountain.class);
                                    startActivity(meir_intent);
                                    break;

                                case 4 :
                                    Intent abud_intent = new Intent(getBaseContext(),   mikta_abud.class);
                                    startActivity(abud_intent);
                                    break;

                                case 5 :
                                    Intent grizim_intent = new Intent(getBaseContext(),   Grizim.class);
                                    startActivity(grizim_intent);
                                    break;

                                case 6 :
                                    Intent balcony_intent = new Intent(getBaseContext(),   State_balcony.class);
                                    startActivity(balcony_intent);

                                    break;



                            }

                            countPair++;

                            if (countPair == 0)
                            {
                                Toast.makeText(getApplicationContext(), "You win!!", Toast.LENGTH_LONG).show();
                            }
                        }
                        currentPos = -1;
                }
            }
        });
    }

    public void goToWebsite(String url)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url)) ;
        startActivity(intent);
    }

}
