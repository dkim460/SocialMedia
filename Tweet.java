import java.util.ArrayList;

/**
* This class represents a Tweet object
* @author David Kim
* @version 13.31
*/
public class Tweet implements SocialMediaPost {
    private Person author;
    private String content;
    private ArrayList<Person> favorites = new ArrayList<>();
    private ArrayList<Tweet> retweets = new ArrayList<>();
    private ArrayList<Tweet> replies = new ArrayList<>();
    private int numFavorites;
    private int numRetweets;
    private int numReplies;

    /**
    * This is the constructor for the class Tweet
    * which takes in an author and content and instantiates them.
    * @param author is of type Person of the author of the tweet
    * @param content is of type String of the content of the tweet
    */
    public Tweet(Person author, String content) {
        this.author = author;
        this.content = content.substring(0, Math.min(140, content.length()));
    }

    /**
    * This method takes in no parameters and returns the author
    * @return author the author of the tweet.
    */
    public Person getAuthor() {
        return author;
    }

    /**
    * This method takes in no parameters and returns the content
    * @return content of the tweet
    */
    public String getContent() {
        return content;
    }

    /**
    * This method takes in object of type person and add them into
    * the ArrayList called favorites. It does not return anything
    * @param favoriter is the object you want to add
    */
    public void addFavorite(Person favoriter) {
        favorites.add(favoriter);
    }

    /**
    * This method takes in an object of type person and adds them into
    * the ArrayList called retweets. It does not return anything
    * @param retweeter is the object you want to retweet to.
    */
    public void addShare(Person retweeter) {
        Tweet tweet = new Tweet(retweeter, "RT: " + this.content);
        retweets.add(tweet);
    }

    /**
    * This method takes in an object of type person and an object of type
    * String. It creates a new tweet and adds a the new comment into the
    * ArrayList called replies.
    * It does not return anything.
    * @param tweeter is an object of type Person who is the tweeter
    * @param body is an object of type String and is the content of the comment
    */
    public void addComment(Person tweeter, String body) {
        Tweet tweet = new Tweet(tweeter, body);
        replies.add(tweet);
    }

    /**
    * This method takes in no parameters and returns the amount of favorites
    * @return numFavorites which is the number of favorites you have
    */
    public int getFavorites() {
        return numFavorites;
    }

    /**
    * This method takes in no parameters and returns the amount of retweets
    * @return numRetweets which is the number of retweets
    */
    public int getShares() {
        return numRetweets;
    }

    /**
    * This method takes in no parameters and returns the amount of replies
    * @return numReplies the number of replies
    */
    public int getComments() {
        return numReplies;
    }

    /**
    * This method takes in no parameters and returns a string
    * mentioning the number
    * of stuff like number of favorites etc.
    * @return statment a String displaying the author, content,
    * numfavorites, and numRetweets.
    */
    public String toString() {
        String statement = String.format("%s:%n\t\u201C%s\u201D%n%d Favorites |"
            + " %d Retweets%n",
            author.toString(), content, numFavorites, numRetweets);
        return statement;
    }
}