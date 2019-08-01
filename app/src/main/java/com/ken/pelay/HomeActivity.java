package com.ken.pelay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {

//    private static final String CLIENT_ID = "16e9f7ad5f164bd4a335060d2cab71de";
//    private static final String REDIRECT_URI = "http://com.example.pelay/callback";
//    private SpotifyAppRemote mSpotifyAppRemote;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageButton imageButton =(ImageButton) findViewById(R.id.artispopular);
        ImageButton imageButton1 =(ImageButton) findViewById(R.id.terakhirdiputar);
        ImageButton imageButton2 =(ImageButton) findViewById(R.id.paling);

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent paling = new Intent(HomeActivity.this, PalingActivity.class);
                startActivity(paling);
            }
        });
//
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent terakhirdiputar = new Intent(HomeActivity.this, terakhirdiputarActivity.class);
                startActivity(terakhirdiputar);
            }
        });
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artispopular = new Intent(HomeActivity.this, artispopulerActivity.class);
                startActivity(artispopular);
            }
        });
//
//    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//        ConnectionParams connectionParams =
//                new ConnectionParams.Builder(CLIENT_ID)
//                        .setRedirectUri(REDIRECT_URI)
//                        .showAuthView(true)
//                        .build();
//
//        SpotifyAppRemote.connect(this, connectionParams,
//                new Connector.ConnectionListener() {
//
//                    public void onConnected(SpotifyAppRemote spotifyAppRemote) {
//                        mSpotifyAppRemote = spotifyAppRemote;
//                        Log.d("MainActivity", "Connected! Yay!");
//
//                        // Now you can start interacting with App Remote
//                        connected();
//
//                    }

//                    public void onFailure(Throwable throwable) {
//                        Log.e("MyActivity", throwable.getMessage(), throwable);
//
//                        // Something went wrong when attempting to connect! Handle errors here
//                    }
//                });
//    }

//    @Override
//    protected void onStop() {
//        super.onStop();
//        SpotifyAppRemote.disconnect(mSpotifyAppRemote);
//    }

//    private void connected() {
//        // Play a playlist
//        mSpotifyAppRemote.getPlayerApi().play("spotify:playlist:37i9dQZF1DX2sUQwD7tbmL");
//
//        CallResult<LibraryState> tes = mSpotifyAppRemote.getUserApi().getLibraryState("spotify:playlist:37i9dQZF1DX2sUQwD7tbmL");

//        tes.setResultCallback(result -> {
////            for(int i=0;i<result. .length;i++) {
//                Log.e("tess", result.toString());
////            }
//        });

        // Subscribe to PlayerState
//        mSpotifyAppRemote.getPlayerApi()
//                .subscribeToPlayerState()
//                .setEventCallback(playerState -> {
//                    final Track track = playerState.track;
//                    if (track != null) {
//                        Log.d("MainActivity", track.name + " by " + track.artist.name);
//                    }
//                });
    }
}
