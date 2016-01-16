
import java.util.List;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

// java Central twitter_handle
// Gets the twitter timeline of a user and prints it 
public class Central {

	public static void main(String[] args) {
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
		  .setOAuthConsumerKey("u47E1TrmUcxAINL5ALHFkaiLc")
		  .setOAuthConsumerSecret("9hF4nKqZujWHmWeBk57s0gOny94mtdwREsKpYiM6jmktYp8Bn1")
		  .setOAuthAccessToken("900468175-ffcJ8fN3f9CXt0pxfduAiK2KrOWJT0jRFhrOEBHO")
		  .setOAuthAccessTokenSecret("nilRtxfeirmEHqJE9VXayLrLRFOJFleoxkEtxbRQuAYEQ");
		
		try {
            // gets Twitter instance with default credentials
			TwitterFactory tf = new TwitterFactory(cb.build());
			Twitter twitter = tf.getInstance();

            List<Status> statuses = twitter.getUserTimeline(args[0]);
            System.out.println("Showing @" + args[0] + "'s home timeline.");
            for (Status status : statuses) {
                System.out.println("@" + status.getUser().getScreenName() + " - " + status.getText());
            }
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to get timeline: " + te.getMessage());
            System.exit(-1);
        }
		
	}
}
