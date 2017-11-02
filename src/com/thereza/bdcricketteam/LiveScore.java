package com.thereza.bdcricketteam;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.json.JSONArray;
import org.json.JSONObject;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

@SuppressLint("NewApi")
public class LiveScore extends Activity {

	
	ArrayList<String>name=new ArrayList<String>(); 
	ArrayList<String>target=new ArrayList<String>(); 
	ArrayList<String>nowbatting=new ArrayList<String>(); 
	ArrayList<String>nowbowling=new ArrayList<String>(); 
	
	ArrayList<String>over=new ArrayList<String>(); 
	ArrayList<String>bat1=new ArrayList<String>(); 
	ArrayList<String>bat2=new ArrayList<String>(); 
	ArrayList<String>blr=new ArrayList<String>(); 
	ArrayList<String>palystatus=new ArrayList<String>(); 
	ArrayList<String>match_tatus=new ArrayList<String>(); 
	JSONParser jParser = new JSONParser();
	Button btn;
	private Menu mymenu;
	TextView teamname,targetScore,nowBatting,nowBowling,overScore,batsman1,batsman2,bowler,status,matchstatus,total_over;
	boolean availableProduct=false;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_live_score);
		teamname=(TextView)findViewById(R.id.teamName);
		nowBowling=(TextView)findViewById(R.id.bollingTeam);
		nowBatting=(TextView)findViewById(R.id.battingTeam);
		overScore=(TextView)findViewById(R.id.over);
		batsman1=(TextView)findViewById(R.id.batsman1);
		batsman2=(TextView)findViewById(R.id.batsman2);
		bowler=(TextView)findViewById(R.id.bowler);
		status=(TextView)findViewById(R.id.batsman1);
		matchstatus=(TextView)findViewById(R.id.match_status);
		targetScore=(TextView)findViewById(R.id.target);
		//total_over=(TextView)findViewById(R.id.total_over);
		new AsyncTaskRunnerCurrent().execute();
		
			
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.live_score, menu);
		mymenu = menu;
		return true;
	}
	
	@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
        case R.id.action_refresh:
            Intent refresh = new Intent(this,LiveScore.class);
        	startActivity(refresh);//Start the same Activity
        	finish(); //finish Activity.
        }
        
        
        return super.onOptionsItemSelected(item);
    }
     
	
	 
	    
	
     
    @SuppressLint("NewApi")
	public void resetUpdating()
    {
        // Get our refresh item from the menu
        MenuItem m = mymenu.findItem(R.id.action_refresh);
        if(m.getActionView()!=null)
        {
            // Remove the animation.
            m.getActionView().clearAnimation();
            m.setActionView(null);
        }
        
        
        
    }
	
	
	
	
   
    

	//----------- Fetching Current Project
	class AsyncTaskRunnerCurrent extends AsyncTask<String, String, String>
	{
		 ProgressDialog progressDialog = new ProgressDialog(LiveScore.this);
		
		String error="";
		
		
		@Override
		protected String doInBackground(String... params) {
			// TODO Auto-generated method stub

			try
			{
				
			

				List<NameValuePair> pair= new ArrayList<NameValuePair>();
				
				
			//JSONObject json=jParser.makeHttpRequest("http://everestdiners.com/market/get_product_name.php", "GET", pair)	;
				JSONObject json=jParser.makeHttpRequest("http://dovanasoft.com/api/index.php", "GET", pair)	;
	
				name.clear();
				target.clear();
				nowbowling.clear();
				nowbatting.clear();
				over.clear();
				bat1.clear();
				bat2.clear();
				blr.clear();
				palystatus.clear();
				match_tatus.clear();
				
				
				int success=json.getInt("success");
				
				if(success==1)
				{
					
					
				JSONArray	 product= json.getJSONArray("live");
					
					
					for(int i=0;i<product.length();i++)
					{
						JSONObject item=product.getJSONObject(i);
						
						
						name.add(item.getString("vs"));
						
						target.add(item.getString("target"));
						nowbatting.add(item.getString("score"));
						nowbowling.add(item.getString("balling"));
						over.add(item.getString("over"));
						bat1.add(item.getString("bat1"));
						bat2.add(item.getString("bat2"));
						blr.add(item.getString("blr"));
				        palystatus.add(item.getString("status"));
				        match_tatus.add(item.getString("match_status"));
				        
						
					
						
					}
					
					
			         availableProduct=true;		
					
					
				}
				else
				{
					//Toast.makeText(getApplicationContext(), "Sorry a problem occured", Toast.LENGTH_LONG).show();
				Log.d("NOOOOOOOOOOOOOOOOOOOOOOOOOOO", "NOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
				 availableProduct=false;
				}
				
				
				
				
			}
			catch(Exception e)
			{
				//Toast.makeText(getApplicationContext(),"A problem occured. Please restart the application once again", Toast.LENGTH_LONG).show();
			
			  Log.d("Problemasdddddddddddddd", e+"");
			  error =e+"";
			}
			return null;
		}
		
		
		
		protected void onPostExecute(String string)
		{
			
			progressDialog.dismiss();
			Intent intent=null;
			if(availableProduct==true)
			{
				
					//Toast.makeText(getApplicationContext(), name.get(0),Toast.LENGTH_LONG).show();
				if(palystatus.get(0).equals("1")){
				teamname.setText(name.get(0));
				nowBowling.setText("Fielding      : "+nowbowling.get(0));
				nowBatting.setText("Batting       : "+nowbatting.get(0));
				 overScore.setText("Over           : "+over.get(0));
				 
				 if(bat1.get(0).equals("null")){
					 batsman1.setText("Batsman1 :");
				 }
				 else{
					 batsman1.setText("Batsman1 :"+bat1.get(0));
				 }
				 
				 if(bat2.get(0).equals("null")){
					 batsman2.setText("Batsman2 :");
				 }
				 else{
					 batsman2.setText("Batsman2 :"+bat2.get(0));
				 }
				
				batsman2.setText("Batsman2 :"+bat2.get(0));
				bowler.setText("Bowler       :"+blr.get(0));
				
				if(match_tatus.get(0).equals("null")){
					matchstatus.setText("");
				 }
				 else{
					 matchstatus.setText("Match Status : "+match_tatus.get(0));
				 }
				
				
				
				
				 if(target.get(0).equals("")){
					 targetScore.setText("");
				 }
				 else{
					 targetScore.setText("Target         : "+target.get(0));
				 }
				
				//total_over.setText("Total Over : 50");
			
				}
				
				else {
					matchstatus.setText("There is no available matches.");
				}
				
			}
			
			else
			{
				AlertDialog.Builder dialog = new AlertDialog.Builder(LiveScore.this);
				dialog.setMessage("Please Cheack Your Internet Connection and try again."
	        		   );
	           dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
				
	        	   @Override
	        	   public void onClick(DialogInterface dialog, int which) {
	        		   dialog.cancel();
					
	        	   }
	           });
	           dialog.show();	           
				//Toast.makeText(getApplicationContext(), "There is no available project "+error, Toast.LENGTH_LONG).show();
			}
		
		}
		
		protected void onPreExecute()
		{
			
			progressDialog.setMessage("Please wait. Loading..");
			progressDialog.setCancelable(false);
			progressDialog.show();
		}
		
		
		
		
			}
	
	
	
	//------------------------------------------------------------------


	
	
	
	

}
