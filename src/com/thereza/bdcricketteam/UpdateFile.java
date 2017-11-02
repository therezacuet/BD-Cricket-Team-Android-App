package com.thereza.bdcricketteam;

import android.content.Context;
import android.os.AsyncTask;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class UpdateFile extends AsyncTask<Void, Void, Void> {
	 
    private Context mCon;
     
    public UpdateFile(Context con)
    {
        mCon = con;
    }
     
    @Override
    protected Void doInBackground(Void... nope) {
        try {
            // Set a time to simulate a long update process.
            Thread.sleep(4000);
             
            return null;
             
        } catch (Exception e) {
            return null;
        }
    }
     
    @Override
    protected void onPostExecute(Void nope) {
        // Give some feedback on the UI.
        //Toast.makeText(mCon, "Finished complex background function!", Toast.LENGTH_LONG).show();
         
    	
        // Change the menu back
        ((LiveScore) mCon).resetUpdating();
    }
    
 
}
