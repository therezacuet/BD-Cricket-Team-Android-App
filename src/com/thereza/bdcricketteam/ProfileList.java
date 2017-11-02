package com.thereza.bdcricketteam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageView;

public class ProfileList extends Activity {
	
	ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12,img13,img14,img15;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		 requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.profile_list);
		
		img1=(ImageView)findViewById(R.id.imageView1);
		img2=(ImageView)findViewById(R.id.imageView2);
		img3=(ImageView)findViewById(R.id.imageView3);
		img4=(ImageView)findViewById(R.id.imageView4);
		img5=(ImageView)findViewById(R.id.imageView5);
		img6=(ImageView)findViewById(R.id.imageView6);
		img7=(ImageView)findViewById(R.id.imageView7);
		img8=(ImageView)findViewById(R.id.imageView8);
		img9=(ImageView)findViewById(R.id.imageView9);
		img10=(ImageView)findViewById(R.id.imageView10);
		img11=(ImageView)findViewById(R.id.imageView11);
		img12=(ImageView)findViewById(R.id.imageView12);
		img13=(ImageView)findViewById(R.id.imageView13);
		img14=(ImageView)findViewById(R.id.imageView14);
		img15=(ImageView)findViewById(R.id.imageView15);
		
		img1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(ProfileList.this,Profile.class);
				
				intent.putExtra("item_name","1");
				startActivity(intent);
	            overridePendingTransition(R.anim.slide_in_up,R.anim.slide_out_up);
				
			}
		});
		
		
		
img2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(ProfileList.this,Profile.class);
				
				intent.putExtra("item_name","2");
				startActivity(intent);
	            overridePendingTransition(R.anim.slide_in_up,R.anim.slide_out_up);
				
			}
		});

img3.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent intent=new Intent(ProfileList.this,Profile.class);
		
		intent.putExtra("item_name","3");
		startActivity(intent);
        overridePendingTransition(R.anim.slide_in_up,R.anim.slide_out_up);
		
	}
});

img4.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent intent=new Intent(ProfileList.this,Profile.class);
		
		intent.putExtra("item_name","4");
		startActivity(intent);
        overridePendingTransition(R.anim.slide_in_up,R.anim.slide_out_up);
		
	}
});


img5.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent intent=new Intent(ProfileList.this,Profile.class);
		
		intent.putExtra("item_name","5");
		startActivity(intent);
        overridePendingTransition(R.anim.slide_in_up,R.anim.slide_out_up);
		
	}
});


img6.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent intent=new Intent(ProfileList.this,Profile.class);
		
		intent.putExtra("item_name","6");
		startActivity(intent);
        overridePendingTransition(R.anim.slide_in_up,R.anim.slide_out_up);
		
	}
});


img7.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent intent=new Intent(ProfileList.this,Profile.class);
		
		intent.putExtra("item_name","7");
		startActivity(intent);
        overridePendingTransition(R.anim.slide_in_up,R.anim.slide_out_up);
		
	}
});


img8.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent intent=new Intent(ProfileList.this,Profile.class);
		
		intent.putExtra("item_name","8");
		startActivity(intent);
        overridePendingTransition(R.anim.slide_in_up,R.anim.slide_out_up);
		
	}
});


img9.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent intent=new Intent(ProfileList.this,Profile.class);
		
		intent.putExtra("item_name","9");
		startActivity(intent);
        overridePendingTransition(R.anim.slide_in_up,R.anim.slide_out_up);
		
	}
});


img10.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent intent=new Intent(ProfileList.this,Profile.class);
		
		intent.putExtra("item_name","10");
		startActivity(intent);
        overridePendingTransition(R.anim.slide_in_up,R.anim.slide_out_up);
		
	}
});


img11.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent intent=new Intent(ProfileList.this,Profile.class);
		
		intent.putExtra("item_name","11");
		startActivity(intent);
        overridePendingTransition(R.anim.slide_in_up,R.anim.slide_out_up);
		
	}
});


img12.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent intent=new Intent(ProfileList.this,Profile.class);
		
		intent.putExtra("item_name","12");
		startActivity(intent);
        overridePendingTransition(R.anim.slide_in_up,R.anim.slide_out_up);
		
	}
});



img13.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent intent=new Intent(ProfileList.this,Profile.class);
		
		intent.putExtra("item_name","13");
		startActivity(intent);
        overridePendingTransition(R.anim.slide_in_up,R.anim.slide_out_up);
		
	}
});


img14.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent intent=new Intent(ProfileList.this,Profile.class);
		
		intent.putExtra("item_name","14");
		startActivity(intent);
        overridePendingTransition(R.anim.slide_in_up,R.anim.slide_out_up);
		
	}
});


img15.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent intent=new Intent(ProfileList.this,Profile.class);
		
		intent.putExtra("item_name","15");
		startActivity(intent);
        overridePendingTransition(R.anim.slide_in_up,R.anim.slide_out_up);
		
	}
});
		
	}

}
