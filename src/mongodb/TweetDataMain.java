package mongodb;

import java.net.UnknownHostException;
import java.util.Date;

// running library data
// data mongodb
public class TweetDataMain {
	public static void main(String args[]) throws UnknownHostException
	{
		// callculation running time and generate data
	    long start = new Date().getTime();
		TweetData call = new TweetData();
		call.run();
        long end = new Date().getTime();
        System.out.println("Job took "+(end-start) + " milliseconds");

	}
}
