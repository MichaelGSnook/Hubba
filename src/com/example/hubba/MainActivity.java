package com.example.hubba;

import android.view.View;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void goRed(View view) {
    		startActivity(new Intent(this, Redditsecond_screen.class));
	}
    
    public void goTwit(View view) {
		startActivity(new Intent(this, Twitsecond_screen.class)); 
	}
    
    public void goFB(View view) {
		startActivity(new Intent(this, FBsecond_screen.class)); 
    }
}
