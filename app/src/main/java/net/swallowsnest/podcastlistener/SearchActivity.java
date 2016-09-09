package net.swallowsnest.podcastlistener;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        //Find the view that shows the category
        TextView nowPlaying = (TextView)findViewById(R.id.nowPlaying);

        //Set the onClick listener for that view
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(SearchActivity.this, NowPlaying.class);

                startActivity(nowPlayingIntent);
            }
        });
        //Find the view that shows the category
        TextView buyMore = (TextView)findViewById(R.id.buyMore);

        //Set the onClick listener for that view
        buyMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buyMoreIntent = new Intent(SearchActivity.this, BuyMore.class);

                startActivity(buyMoreIntent);
            }
        });

        //Find the view that shows the category
        TextView available = (TextView)findViewById(R.id.available_podcasts);

        //Set the onClick listener for that view
        available.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent availableIntent = new Intent(SearchActivity.this, AvailablePodcasts.class);

                startActivity(availableIntent);
            }
        });
    }
}
