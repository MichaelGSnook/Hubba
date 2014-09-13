package com.example.hubba;

import android.view.KeyEvent;
import android.view.View;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {
	
	private boolean insta = false;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void goInsta(View view) {
    		startActivity(new Intent(this, INSTAsecond_screen.class));
	}
    
    public void goTwit(View view) {
		startActivity(new Intent(this, Twitsecond_screen.class)); 
	}
    
    public void goFB(View view) {
		startActivity(new Intent(this, FBsecond_screen.class)); 
    }
}
