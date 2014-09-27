package com.example.button;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity 
{
	// Define and declare a button here 
	Button b;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
    //Refer the button from xml with the id of button b1 which is "button1"
	b=(Button)findViewById(R.id.button1);
	
	// Using onclick attribute from xml here we use "clickhere_method" for onclick
	//android:onClick="clickhere_method"
			
	}
	public void clickhere_method()
	{
	// TODO Auto-generated method stub
		//Message to be shown on button click
	Toast.makeText(MainActivity.this,"This button is handled by on click attribute",Toast.LENGTH_LONG).show();

	}


}
