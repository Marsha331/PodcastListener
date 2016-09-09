package net.swallowsnest.podcastlistener;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        //Find the view that shows the category
        TextView buyMore = (TextView)findViewById(R.id.buyMore);

        //Set the onClick listener for that view
        buyMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buyMoreIntent = new Intent(NowPlaying.this, BuyMore.class);

                startActivity(buyMoreIntent);
            }
        });

        //Find the view that shows the category
        TextView search = (TextView)findViewById(R.id.search_podcasts);

        //Set the onClick listener for that view
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(NowPlaying.this, SearchActivity.class);

                startActivity(searchIntent);
            }
        });

        //Find the view that shows the category
        TextView available = (TextView)findViewById(R.id.available_podcasts);

        //Set the onClick listener for that view
        available.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent availableIntent = new Intent(NowPlaying.this, AvailablePodcasts.class);

                startActivity(availableIntent);
            }
        });
    }
    }

