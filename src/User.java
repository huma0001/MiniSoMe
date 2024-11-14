import java.util.ArrayList;

public class User {
    private String username;
    private ArrayList<User> friendList;
    private ArrayList<String> postList;


    public User(String username){
        this.username = username;
        this.friendList = new ArrayList<>();
        this.postList = new ArrayList<>();
    }


    public void addFriend(User user){
        if (user.getUsername().equalsIgnoreCase(username)){
            System.out.println("You cannot add yourself");
        } else if(friendList.contains(user)){
            System.out.println(user + " Is already on " + username + " friends list.");
        } else {
            friendList.add(user);
            System.out.println(username + " has added " + user + " to their friends list");
        }
    }


    public void createPost(String post){
        postList.add(post);
    }

    public void viewposts(){
        System.out.println(postList);
    }


    public String getUsername(){
        return username;
    }


    public String toString (){
        return username;
    }
}
