package com.thereza.bdcricketteam;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.Window;

public class Profile extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
	    String selectedItem=getIntent().getExtras().getString("item_name");
	    requestWindowFeature(Window.FEATURE_NO_TITLE);
         if(selectedItem.equals("1")){
			
        	 setContentView(R.layout.profile1);
		}
         
         if(selectedItem.equals("2")){
 			
        	 setContentView(R.layout.profile2);
		}
         
         if(selectedItem.equals("3")){
 			
        	 setContentView(R.layout.profile3);
		}
         
         if(selectedItem.equals("4")){
 			
        	 setContentView(R.layout.profile4);
		}
         
         if(selectedItem.equals("5")){
 			
        	 setContentView(R.layout.profile5);
		}
         
         if(selectedItem.equals("6")){
 			
        	 setContentView(R.layout.profile6);
		}
         
         if(selectedItem.equals("7")){
 			
        	 setContentView(R.layout.profile7);
		}
         
         if(selectedItem.equals("8")){
 			
        	 setContentView(R.layout.profile8);
		}
         
         if(selectedItem.equals("9")){
 			
        	 setContentView(R.layout.profile9);
		}
         
         if(selectedItem.equals("10")){
 			
        	 setContentView(R.layout.profile10);
		}
         
         if(selectedItem.equals("11")){
 			
        	 setContentView(R.layout.profile11);
		}
         
         if(selectedItem.equals("12")){
 			
        	 setContentView(R.layout.profile12);
		}
         
         if(selectedItem.equals("13")){
 			
        	 setContentView(R.layout.profile13);
		}
         
         if(selectedItem.equals("14")){
 			
        	 setContentView(R.layout.profile14);
		}
         
         if(selectedItem.equals("15")){
 			
        	 setContentView(R.layout.profile15);
		}
         
		
		
	}

}
