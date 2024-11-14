public class SocialNetWorkMain {
    public static void main(String[] args) {

        SocialNetworkClass snc = new SocialNetworkClass();

        //create users
        User user1 = new User("ShitStain");
        User user2 = new User("PeterShite");
        User user3 = new User("huss0523");
        User user4 = new User("fakman01");
        User user5 = new User("basto");

        // adding friends
        user1.addFriend(user2);
        user1.addFriend(user2);
        user2.addFriend(user2);
        user3.addFriend(user4);

        //Create postS
        Post post1 = new Post("Fak u bitch", user1);
        Post post2 = new Post("This is post 2 from PeterShite", user2);
        Post post3 = new Post("Fak u bitch part two", user1);

        post1.likePost();
        post1.likePost();
        post1.postInfo();
        post1.likePost();

        System.out.println(post1.getLikes());
        post1.likePost();

        System.out.println(post1.getLikes());


        post1.likePost();
        post1.likePost();


        System.out.println(post1.getLikes());


        snc.addUser(user1);

        // View posts - Shows it has zero at this point bc user1 didnt create
        snc.viewFriendPosts(user1);

        user1.createPost("Fak you bitch");
        user1.createPost("Fak you bitch PART TWO");


        // Can view posts from network
        snc.viewFriendPosts(user1);


        // Can view posts using viewPosts method
        user1.viewposts();


    }
}
