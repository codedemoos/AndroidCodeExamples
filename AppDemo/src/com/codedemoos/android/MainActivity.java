package com.codedemoos.android;


import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.app.Activity;
import android.content.Intent;


public class MainActivity extends Activity {

	
	LinearLayout mainLinearLayout;
	
	ScrollView mainScrollView; 
	/*
	 * (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
		
		
		
		//CREATE COMMON LAYOUT PARAMS
		LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

		//GET THE MAIN SCROLL VIEW
		
		mainScrollView = (ScrollView) findViewById(R.id.mainScrollView);
		
		//GET THE MAIN LINEAR LAYOUT
		
		mainLinearLayout = (LinearLayout) findViewById(R.id.mainLinearLayout);
				
	
		//CREATE A BUTTON 
		Button buttonDemoToast = new Button(this);		
		//SET TEXT
		buttonDemoToast.setText("Demo Toast");		
		//SET LAYOUT PARAMS
		buttonDemoToast.setLayoutParams(p);		
		//SET CLICK LISTENER
		buttonDemoToast.setOnClickListener(buttonDemoToastClickListener);		
		//ADD VIEW
		mainLinearLayout.addView(buttonDemoToast);
		
	
		
	
		
		
		


		
	}

	

	
      
  	//buttonDemoToast - CLICK LISTENER
      private OnClickListener buttonDemoToastClickListener= new OnClickListener() { 	
          public void onClick(View v) {       	
          	//simple navigation
          	Intent intent = new Intent(MainActivity.this,
          			ActivityDemoToast.class);
  			startActivity(intent); 			
          	}          
        };
	

}
