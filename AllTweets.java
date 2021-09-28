package project1;

public class AllTweets {

	public static void main(String[] args) {
		AllTweets myData = new AllTweets("./trainingProcessed.txt");
		ArrayLIst<Long> allIds = myData.getIds();
		for(Long long1 : someIds) {
			System.out.println(myData.getTweet(long1));
		}
		ArrayList<Long> someIds = myData.getIdsByUser("a users name");
		for (Long long1 : someIds) {
			System.out.println(myData.deleteTweet(long1));
		}
		
		Tweet aTweet = new Tweet(/*some data here*/);
		System.out.println(myData.predict(aTweet));

	}

}
