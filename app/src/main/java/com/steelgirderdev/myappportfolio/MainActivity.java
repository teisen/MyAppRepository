package com.steelgirderdev.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private Context context;
    private static int duration = Toast.LENGTH_SHORT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /** Called when the user touches the buttonSpotifyStreamer */
    public void clickButtonSpotifyStreamer(View view) {
        toastIt("This button will launch the Spotify Streamer App!");
    }
    /** Called when the user touches the clickButtonScores */
    public void clickButtonScores(View view) {
        toastIt("This button will launch the Scores App!");
    }
    /** Called when the user touches the clickButtonLibrary */
    public void clickButtonLibrary(View view) {
        toastIt("This button will launch the Library App!");
    }
    /** Called when the user touches the clickButtonBuildItBigger */
    public void clickButtonBuildItBigger(View view) {
        toastIt("This button will launch the Build It Bigger App!");
    }
    /** Called when the user touches the clickButtonXYZReader */
    public void clickButtonXYZReader(View view) {
        toastIt("This button will launch the XYZ Reader App!");
    }
    /** Called when the user touches the clickButtonCapstone */
    public void clickButtonCapstone(View view) {
        toastIt("This button will launch the Capstone App!");
    }

    private void toastIt(CharSequence text) {
        context = getApplicationContext();
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
