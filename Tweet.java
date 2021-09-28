package project1;

public class Tweet{
		private Integer polarity;
		private Long id;
		private String user;
		private String tweet;
		
		public Tweet (Integer polarity1, Long id1, String user1, String tweet1) {
			polarity = polarity1;
			id = id1;
			user = user1;
			tweet = tweet1;
		}
		
		
		
		public double collectionPrediction(AllTweets rhs) {
			
		}
		
		public Tweet getTweet(Long id) {
			Tweet tempTweet = new Tweet(polarity, id, user, tweet);
			/*int index = myData.indexOf(tempTweet);
			return myData.get(index);*/
			return tempTweet;
		}
		
		//System.out.println(trainingData.collectionTest(trainingData));
		//Double sum = list.get(0) + list.get(1);
		
		private void readFile() {
			BufferReader lineReader = null;
			try {
				FileReader fr = new FileReader(filename);
				lineReader = new BufferedReader(fr);
				String line = null;
				while((line = lineReader.readLine()) != null) {
					String[] tokens = line.split(",");
					int polarity = Integer.parseInt(tokens[0]);
					long id = Long.parseLong(tokens[1]);
					String idStr = tokens[1];
					addTweet(new Tweet(polarity, id, tokens[2], tokens[3]));
					
					String name = lineReader.readLine();
					String id = lineReader.readLine();
					if(line.equals("student")) {
						String gpaString = lineReader.readLine();
						addStudent(new Student(name,id,Double.parseDouble(gpaString)));
					}
					else if (line.equals("instructor")) {
						String email = lineReader.readLine();
						addInstructor(new Instructor(name,id,email));
					}
				}
			}
		}
		
}

