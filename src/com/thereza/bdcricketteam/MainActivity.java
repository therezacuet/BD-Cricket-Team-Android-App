package com.thereza.bdcricketteam;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
Button btn1,btn2,btn3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn1=(Button) findViewById(R.id.button1);
		btn2=(Button)findViewById(R.id.history);
		btn3=(Button)findViewById(R.id.button3);
		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
                Intent intent=new Intent(MainActivity.this,ProfileList.class);
				
				startActivity(intent);
	            overridePendingTransition(R.anim.slide_right_in, R.anim.slide_out_up);
				
			}
		});
		
		btn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
               Intent intent=new Intent(MainActivity.this,History.class);
				
				startActivity(intent);
				 overridePendingTransition(R.anim.slide_left_in, R.anim.slide_out_up);
			}
		});
		
		btn3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				 Intent intent=new Intent(MainActivity.this,LiveScore.class);
					
					startActivity(intent);
			}
		});
		
		btn1.setOnTouchListener(new OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    //Button Pressed
                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                     //finger was lifted
                }
                return false;
            }
        });
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	 @Override
	    public boolean onOptionsItemSelected(MenuItem item) {
	    	switch (item.getItemId()) {
		    case R.id.menu_about:
		          
		           AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
		           dialog.setTitle("About");
		           dialog.setMessage("Rejaul Islam \n\n" +"Chittagong University of Engineering and Technology(CUET)\n\n"+"Dept. of Computer Science and Engineering(CSE)"+
		           			"\n\nrejaul_cse12@yahoo.com"
		        		   );
		           dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					
		        	   @Override
		        	   public void onClick(DialogInterface dialog, int which) {
		        		   dialog.cancel();
						
		        	   }
		           });
		           dialog.show();	           
		           return true;
		        
		        default:
		            return super.onOptionsItemSelected(item);
		        }
	    }

}
