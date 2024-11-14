import java.lang.reflect.Array;
import java.util.ArrayList;

public class SocialNetworkClass {
    private ArrayList<User> userList;

    public SocialNetworkClass(){
        userList = new ArrayList<>();
    }


    public void addUser(User user){
        userList.add(user);
        System.out.println("User " + user.getUsername() + " has been added to the network!");
    }


    public void viewFriendPosts(User user){
        user.viewposts();
    }

}
