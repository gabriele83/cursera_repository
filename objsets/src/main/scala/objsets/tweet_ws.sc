package objsets

object tweet_ws {
  val set1 = new Empty                            //> set1  : objsets.Empty = objsets.Empty@42c0ef0
  val set2 = set1.incl(new Tweet("a", "a body", 20))
                                                  //> set2  : objsets.TweetSet = objsets.NonEmpty@66be9fc1
  val set3 = set2.incl(new Tweet("b", "b body", 20))
                                                  //> set3  : objsets.TweetSet = objsets.NonEmpty@20f5e794
  val c = new Tweet("c", "c body", 70)            //> c  : objsets.Tweet = User: c
                                                  //| Text: c body [70]
  val d = new Tweet("d", "d body", 9)             //> d  : objsets.Tweet = User: d
                                                  //| Text: d body [9]
  val set4c = set3.incl(c)                        //> set4c  : objsets.TweetSet = objsets.NonEmpty@7036b673
  val set4d = set3.incl(d)                        //> set4d  : objsets.TweetSet = objsets.NonEmpty@18047193
  val set5 = set4c.incl(d)                        //> set5  : objsets.TweetSet = objsets.NonEmpty@4bbc7636

  // var filteredSet: TweetSet = set4c.filter(tweet => tweet.retweets > 7)
  // filteredSet.foreach(t => println(t))

  var unionSet: TweetSet = set1 union set2 union set3 union set4c union set4d union set5
                                                  //> unionSet  : objsets.TweetSet = objsets.NonEmpty@4ee42af2

  unionSet.foreach(t => println(t))               //> User: a
                                                  //| Text: a body [20]
                                                  //| User: b
                                                  //| Text: b body [20]
                                                  //| User: c
                                                  //| Text: c body [70]
                                                  //| User: d
                                                  //| Text: d body [9]

  unionSet.mostRetweeted                          //> res0: objsets.Tweet = User: c
                                                  //| Text: c body [70]

  val tl: TweetList = unionSet.descendingByRetweet//> tl  : objsets.TweetList = objsets.Cons@48bfba23
  TweetReader.allTweets.foreach(t => println(t))  //> User: gizmodo
                                                  //| Text: Kindle Paperwhite Review: Forget Everything Else, This Is the E-Reader
                                                  //|  You Want http://t.co/737W6aNC [51]
                                                  //| User: gizmodo
                                                  //| Text: Ever wonder why the sky is dark at night? Here's your answer. http://t
                                                  //| .co/eTKxkcaE [86]
                                                  //| User: gizmodo
                                                  //| Text: 18 unlucky people who already broke the iPhone 5: http://t.co/9RpvX4te
                                                  //|  [79]
                                                  //| User: gizmodo
                                                  //| Text: 14 people who should be ashamed of their @foursquare mayorship http://
                                                  //| t.co/7AEHQJLT [50]
                                                  //| User: gizmodo
                                                  //| Text: 12 deadly inventions that killed their creators (not for the faint of 
                                                  //| heart) http://t.co/BCwRAzhe [82]
                                                  //| User: gizmodo
                                                  //| Text: (In case you're wondering who the awesome speller is, that's @brentros
                                                  //| e. He has an MFA.) [2]
                                                  //| User: engadget
                                                  //| Text: "It's now a surprise to hear of a company listening to its users, issu
                                                  //| ing an apology and vowing to make it better." (http://t.co/R5bu5Wp1) [49]
                                                  //| User: gadgetlab
                                                  //| Text: #iOS6 will feature new iTunes st
                                                  //| Output exceeds cutoff limit.
  

}