package com.example.hubba;

import android.app.Activity;
import android.os.Bundle;

public class FBsecond_screen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		//@Tweet4j's Twitter Account:
        //Your Twitter App's Consumer Key
        /*String consumerKey = "rCwcaUcfAg3ztcEG1HU8tA";
 
        //Your Twitter App's Consumer Secret
        String consumerSecret = "F4t3qdvhsr2D3gGrxfKYbOS4cp35qLpT2vJ0utHI";
 
        //Your Twitter Access Token
        String accessToken = "2353909237-GVvjXqOx1uuF37fdfZhdQzwEoQKuOstNnYg3FUe";
 
        //Your Twitter Access Token Secret
        String accessTokenSecret = "4e1jXSbhzAyxpnx6mgzOvTVdagql4S6rGGPHvHVVIiICT";
 
        //Instantiate a re-usable and thread-safe factory
        TwitterFactory twitterFactory = new TwitterFactory();
 
        //Instantiate a new Twitter instance
        //Twitter twitter = twitterFactory.getInstance();
        Twitter twitter = TwitterFactory.getSingleton();
        //setup OAuth Consumer Credentials
        twitter.setOAuthConsumer(consumerKey, consumerSecret);
 
        //setup OAuth Access Token
        twitter.setOAuthAccessToken(new AccessToken(accessToken, accessTokenSecret));
        */
        /*StatusUpdate latestStatus = new StatusUpdate("TESTESTEST");
        Status status;
		try {
			status = twitter.updateStatus(latestStatus);
			System.out.println("Successfully updated the status to [" + status.getText() + "].");
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
        
        /*ConnectivityManager check = (ConnectivityManager) 
        getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo[] info = check.getAllNetworkInfo();
        
        for (int i = 0; i<info.length; i++){
        	   if (info[i].getState() == NetworkInfo.State.CONNECTED){
        		   		System.out.println("true");
        	   }
        	}*/
        
        
        
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
		setContentView(R.layout.activity_fbsecond_screen);
	}
}
