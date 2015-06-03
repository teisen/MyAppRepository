package com.steelgirderdev.myappportfolio;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private Context context;
    private static int duration = Toast.LENGTH_SHORT;
    private Toast mAppToast;

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
        openApp(this, getString(R.string.apppackage_SpotifyStreamer));
    }
    /** Called when the user touches the clickButtonScores */
    public void clickButtonScores(View view) {
        toastIt(getString(R.string.appname_ScoresApp));
    }
    /** Called when the user touches the clickButtonLibrary */
    public void clickButtonLibrary(View view) {
        toastIt(getString(R.string.appname_LibraryApp));
    }
    /** Called when the user touches the clickButtonBuildItBigger */
    public void clickButtonBuildItBigger(View view) {
        toastIt(getString(R.string.appname_BuildItBigger));
    }
    /** Called when the user touches the clickButtonXYZReader */
    public void clickButtonXYZReader(View view) {
        toastIt(getString(R.string.appname_XYZReader));
    }
    /** Called when the user touches the clickButtonCapstone */
    public void clickButtonCapstone(View view) {
        toastIt(getString(R.string.appname_Capstone));
    }

    private void toastIt(CharSequence appname) {
        context = getApplicationContext();

        //Stop any previous toasts
        if(mAppToast != null) {
            mAppToast.cancel();
        }

        mAppToast = Toast.makeText(context, getString(R.string.toast_launchicon, appname), duration);
        mAppToast.show();
    }

    /** Open another app.
     * Source: http://stackoverflow.com/questions/2780102/open-another-application-from-your-own-intent/7596063#7596063
     * @param context current Context, like Activity, App, or Service
     * @param packageName the full package name of the app to open
     * @return true if likely successful, false if unsuccessful
     */
    public static boolean openApp(Context context, String packageName) {
        PackageManager manager = context.getPackageManager();
        try {
            Intent i = manager.getLaunchIntentForPackage(packageName);
            if (i == null) {
                throw new PackageManager.NameNotFoundException();
            }
            i.addCategory(Intent.CATEGORY_LAUNCHER);
            context.startActivity(i);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }
}
