package com.example.hubba;

import twitter4j.StatusUpdate;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Twitsecond_screen extends Activity {
	
	//@Tweet4j's Twitter Account:
    //Your Twitter App's Consumer Key
    String consumerKey = "rCwcaUcfAg3ztcEG1HU8tA";

    //Your Twitter App's Consumer Secret
    String consumerSecret = "F4t3qdvhsr2D3gGrxfKYbOS4cp35qLpT2vJ0utHI";

    //Your Twitter Access Token
    String accessToken = "2353909237-GVvjXqOx1uuF37fdfZhdQzwEoQKuOstNnYg3FUe";

    //Your Twitter Access Token Secret
    String accessTokenSecret = "4e1jXSbhzAyxpnx6mgzOvTVdagql4S6rGGPHvHVVIiICT";

	@Override
	protected void onCreate(Bundle savedInstanceState) {

 
        
        /*
        User user = new User("Twiddit", "twit$test$best$quick4");	
		
        
        
		try {
			user.connect();
			java.util.List<Submission> submissions = Submissions.getSubmissions("HistoryPorn", Submissions.HOT, Submissions.FRONTPAGE, user);
			
			
			System.out.println(submissions.get(0).getTitle());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
       
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_twitsecond_screen);
		
		
        
	}
	
	public void go3Twit(View view) {
		
        //Instantiate a new Twitter instance
        Twitter twitter = TwitterFactory.getSingleton();
        //setup OAuth Consumer Credentials
        twitter.setOAuthConsumer(consumerKey, consumerSecret);
 
        //setup OAuth Access Token
        twitter.setOAuthAccessToken(new AccessToken(accessToken, accessTokenSecret));
        
        EditText editText = (EditText) findViewById(R.id.editText1);
        String str = editText.getText().toString();
        
        
      StatusUpdate latestStatus = new StatusUpdate(str);
      
      
		try {
			twitter.updateStatus(latestStatus);
		} catch (TwitterException e) { }
		
		
		Intent i = getBaseContext().getPackageManager()
				.getLaunchIntentForPackage( getBaseContext().getPackageName() );
				i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(i);
    }
}