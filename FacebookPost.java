import java.util.ArrayList;

/**
* This class represents a FacebookPost object
* @author David Kim
* @version 13.31
*/
public class FacebookPost implements SocialMediaPost {
    private Person author;
    private String content;
    private ArrayList<Person> likes = new ArrayList<>();
    private ArrayList<Person> shares = new ArrayList<>();
    private ArrayList<FacebookPost> comments = new ArrayList<>();
    private int numLikes;
    private int numShares;
    private int numComments;

    /**
    * This constructor takes in a Person object, and String
    * and instantiates them
    * It does not return anything
    * @param author is an object of type person which is the author of the post
    * @param content is a string of the content of the post
    */
    public FacebookPost(Person author, String content) {
        this.author = author;
        this.content = content;
    }

    /**
    * This method takes in no parameters and returns the content of the post
    * @return content which is a String of the content of the post
    */
    public String getContent() {
        return content;
    }

    /**
    * This method takes in no paramters and returns the author of the post
    * @return author the author of the post
    */
    public Person getAuthor() {
        return author;
    }

    /**
    * This method takes an object of type person and adds them into the
    * ArrayList called likes. It does not return anything.
    * @param liker the person you want to add to likes
    */
    public void addFavorite(Person liker) {
        likes.add(liker);
    }

    /**
    * This method takes in an object of type person and adds them into
    * the the ArrayList called shares. This method does not return anything.
    * @param sharer the person you want to add to shares
    */
    public void addShare(Person sharer) {
        shares.add(sharer);
    }

    /**
    * This method takes in a object of type person and a string adds them into
    * the Arraylist called comments. This does not return anything.
    * @param commenter is the person who made the comment
    * @param body is the content of the comment
    */
    public void addComment(Person commenter, String body) {
        FacebookPost comment = new FacebookPost(commenter, body);
        comments.add(comment);
    }

    /**
    * This method takes in no parameters and returns the number of likes
    * @return numLikes which is the number of likes
    */
    public int getFavorites() {
        return numLikes;
    }

    /**
    * This method takes in no parameters and returns the number of shares
    * @return numShares which is the number of shares
    */
    public int getShares() {
        return numShares;
    }

    /**
    * This method takes in no parameters and returns the number of comments
    * @return numComments which is the number of comments.
    */
    public int getComments() {
        return numComments;
    }

    /**
    * Ths method takes in no parameters and returns the statement
    * @return statment which is a string that consists of the author name
    * the content, number of likes, number of shares, and number of comments
    */
    public String toString() {
        String s = String.format("%s:%n\t\u201C%s\u201D%n%d Likes | %d Shares"
            + " | %d Comments%n",
            author.toString(), content, numLikes, numShares, numComments);
        return s;
    }
}