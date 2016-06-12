package glory.serulingsimulator;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.io.IOException;

public class SerulingActivity extends AppCompatActivity {


    private  MediaPlayer mp;

    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seruling);


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();

         mp = new MediaPlayer();

    }

    public void btnDo(View view) {
        //ImageButton gbrA = (ImageButton) findViewById(R.id.buttonDo);
        //memanggil fiile do
        mp = MediaPlayer.create(this,R.raw.m_do);


        try {
            mp.prepare();

        }catch (IllegalStateException e){
            e.printStackTrace();

        }catch (IOException ex){
            ex.printStackTrace();



        }


        mp.start();


    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Seruling Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://glory.serulingsimulator/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Seruling Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://glory.serulingsimulator/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }

    public void btnRe(View view) {

        mp = MediaPlayer.create(this,R.raw.m_re);
        try {
            mp.prepare();

        }catch (IllegalStateException ea){
            ea.printStackTrace();

        }catch (IOException ea){
            ea.printStackTrace();

        }

        mp.start();



    }

    public void btnMi(View view) {

        mp = MediaPlayer.create(this,R.raw.m_mi);
        try {
            mp.prepare();

        }catch (IllegalStateException eb){
            eb.printStackTrace();

        }catch (IOException eb){
            eb.printStackTrace();

        }
        mp.start();

    }

    public void btnFa(View view) {

        mp = MediaPlayer.create(this,R.raw.m_fa);
        try {
            mp.prepare();

        }catch (IllegalStateException eb){
            eb.printStackTrace();

        }catch (IOException eb){
            eb.printStackTrace();

        }

        mp.start();

    }

    public void btnSol(View view) {
        mp = MediaPlayer.create(this,R.raw.m_sol);
        try {
            mp.prepare();

        }catch (IllegalStateException eb){
            eb.printStackTrace();

        }catch (IOException eb){
            eb.printStackTrace();

        }
        mp.start();

    }

    public void btnLa(View view) {

        mp = MediaPlayer.create(this,R.raw.m_la);

        try {
            mp.prepare();

        }catch (IllegalStateException eb){
            eb.printStackTrace();

        }catch (IOException eb){
            eb.printStackTrace();

        }
        mp.start();


    }

    public void btnSi(View view) {
        mp = MediaPlayer.create(this,R.raw.m_si);
        try {
            mp.prepare();

        }catch (IllegalStateException eb){
            eb.printStackTrace();

        }catch (IOException eb){
            eb.printStackTrace();

        }

        mp.start();
    }

    public void btnDotinggi(View view) {


        mp = MediaPlayer.create(this,R.raw.m_dotinggi);
        try {
            mp.prepare();

        }catch (IllegalStateException eb){
            eb.printStackTrace();

        }catch (IOException eb){
            eb.printStackTrace();

        }
        mp.start();
    }
}
