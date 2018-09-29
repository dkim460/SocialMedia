/**
* This class a driver object which is used to call the following calls
* in the main class
* @author David Kim
* @version 13.31
*/
public class Driver {

    /**
    * This method is used in order to make a call
    * @param args which isn't used
    */
    public static void main(String[] args) {
        Person george = new Person("George", "Burdell");
        Person buzz = new Person("Buzz", "");
        Person bud = new Person("Bud", "Peterson");

        SocialManager sm = new SocialManager(george);

        SocialMediaPost fbPost = new FacebookPost(buzz,
            "Yellow Jackets trump Bulldogs, 14-0!");
        fbPost.addFavorite(buzz);
        fbPost.addComment(george, "Go Jackets!");
        sm.updateFeed(fbPost);
        //System.out.println(sm.getFeed());


        SocialMediaPost tweet = new Tweet(bud,
            "Georgia Tech Research Institute discovers cure for cancer");
        tweet.addShare(george);
        sm.updateFeed(tweet);
        //System.out.println(sm.getFeed());

        SocialMediaPost insta = new InstagramPost(george,
            "I don't even use Instagram!");
        insta.addFavorite(george);
        insta.addComment(buzz, "Neither do I!");
        sm.updateFeed(insta);
        System.out.println(sm.getFeed());
    }
}