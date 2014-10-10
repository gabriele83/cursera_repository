package objsets

object tweet_ws {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(58); 
  val set1 = new Empty;System.out.println("""set1  : objsets.Empty = """ + $show(set1 ));$skip(53); 
  val set2 = set1.incl(new Tweet("a", "a body", 20));System.out.println("""set2  : objsets.TweetSet = """ + $show(set2 ));$skip(53); 
  val set3 = set2.incl(new Tweet("b", "b body", 20));System.out.println("""set3  : objsets.TweetSet = """ + $show(set3 ));$skip(39); 
  val c = new Tweet("c", "c body", 70);System.out.println("""c  : objsets.Tweet = """ + $show(c ));$skip(38); 
  val d = new Tweet("d", "d body", 9);System.out.println("""d  : objsets.Tweet = """ + $show(d ));$skip(27); 
  val set4c = set3.incl(c);System.out.println("""set4c  : objsets.TweetSet = """ + $show(set4c ));$skip(27); 
  val set4d = set3.incl(d);System.out.println("""set4d  : objsets.TweetSet = """ + $show(set4d ));$skip(27); 
  val set5 = set4c.incl(d);System.out.println("""set5  : objsets.TweetSet = """ + $show(set5 ));$skip(209); 

  // var filteredSet: TweetSet = set4c.filter(tweet => tweet.retweets > 7)
  // filteredSet.foreach(t => println(t))

	var unionSet: TweetSet = set1 union set2 union set3  union set4c union set4d union set5;System.out.println("""unionSet  : objsets.TweetSet = """ + $show(unionSet ));$skip(37); 
	
	unionSet.foreach(t => println(t));$skip(26); val res$0 = 
	
	unionSet.mostRetweeted;System.out.println("""res0: objsets.Tweet = """ + $show(res$0))}
	

}
