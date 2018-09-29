import java.util.ArrayList;
import java.util.Random;

/**
* This class represents a Tweet object
* @author David Kim
* @version 13.31
*/
public class SocialManager implements NewsSource<SocialMediaPost> {
    private Person user;

    private ArrayList<SocialMediaPost> feedPosts = new ArrayList<>();
    private int numFeedPosts;

    private ArrayList<SocialMediaPost> myPosts = new ArrayList<>();
    private int numMyPosts;

    /**
    * This constructor takes in an object of type person and instantiates it
    * @param user which is the person
    */
    public SocialManager(Person user) {
        this.user = user;
    }

    /**
    * This method takes in no parameter and returns the author
    * @return user which is the author
    */
    public Person getAuthor() {
        return user;
    }

    /**
    * This method takes in no parameters and returns the feed
    * @return feed which is the string displaying the feeds of each post after
    * they are converted into a string using the toString() method.
    */
    public String getFeed() {
        String feed = "";
        for (int i = 0; i < feedPosts.size(); i++) {
            //feed += feedPosts[i].toString();
            feed += feedPosts.get(i).toString();
        }
        // for each loop
        return feed;
    }

    /**
    * This method takes in an object of type SocialMediaPost and adds it into
    * the ArrayList called feedPosts. It does not return anything
    * @param post which is the post that is being added
    */
    public void updateFeed(SocialMediaPost post) {
        feedPosts.add(post);
    }

    /**
    * This method takes in an object of type SocialMediaPost and adds it into
    * the Arraylist called myPosts. It does not return anything
    * @param post which is the post being added
    */
    public void post(SocialMediaPost post) {
        myPosts.add(post);
    }

    /**
    * This method takes in no parameters and returns the feedPosts which are
    * the articles
    * @return feedPosts which are the articles
    */
    public ArrayList<SocialMediaPost> getArticles() {
        return feedPosts;
    }

    /**
    * This method takes in no parameters and returns a random article
    * from feedPosts
    * @return randomArticle which is the random article
    */
    public SocialMediaPost getRandomArticle() {
        Random rand = new Random();
        int randomNumber = (rand.nextInt(feedPosts.size()));
        SocialMediaPost randomArticle = feedPosts.get(randomNumber);
        return randomArticle;
    }
}