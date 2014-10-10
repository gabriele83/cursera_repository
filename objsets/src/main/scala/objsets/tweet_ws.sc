package objsets

object tweet_ws {
  val set1 = new Empty                            //> set1  : objsets.Empty = objsets.Empty@6b9bb4bb
  val set2 = set1.incl(new Tweet("a", "a body", 20))
                                                  //> set2  : objsets.TweetSet = objsets.NonEmpty@5158ce4
  val set3 = set2.incl(new Tweet("b", "b body", 20))
                                                  //> set3  : objsets.TweetSet = objsets.NonEmpty@5a2ee4e8
  val c = new Tweet("c", "c body", 70)            //> c  : objsets.Tweet = User: c
                                                  //| Text: c body [70]
  val d = new Tweet("d", "d body", 9)             //> d  : objsets.Tweet = User: d
                                                  //| Text: d body [9]
  val set4c = set3.incl(c)                        //> set4c  : objsets.TweetSet = objsets.NonEmpty@3cb66999
  val set4d = set3.incl(d)                        //> set4d  : objsets.TweetSet = objsets.NonEmpty@6bcedaf2
  val set5 = set4c.incl(d)                        //> set5  : objsets.TweetSet = objsets.NonEmpty@59887d29

  // var filteredSet: TweetSet = set4c.filter(tweet => tweet.retweets > 7)
  // filteredSet.foreach(t => println(t))

	var unionSet: TweetSet = set1 union set2 union set3  union set4c union set4d union set5
                                                  //> unionSet  : objsets.TweetSet = objsets.NonEmpty@115426ec
	
	unionSet.foreach(t => println(t))         //> User: a
                                                  //| Text: a body [20]
                                                  //| User: b
                                                  //| Text: b body [20]
                                                  //| User: c
                                                  //| Text: c body [70]
                                                  //| User: d
                                                  //| Text: d body [9]
	
	unionSet.mostRetweeted                    //> res0: objsets.Tweet = User: c
                                                  //| Text: c body [70]
	

}