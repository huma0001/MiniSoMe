public class Post {
    private String content;
    private User author;
    private int likes;


    public Post(String content, User author){
        this.content = content;
        this.author = author;
        likes = 0;
    }

    public void postInfo(){
        System.out.println(content);
        System.out.println("Author: " + author);
        System.out.println("Likes: " + likes);
    }

    public void likePost(){
        likes++;
    }

    public String getContent(){
        return content;
    }


    public User getAuthor(){
        return author;
    }

    public int getLikes(){
        return likes;
    }
}
