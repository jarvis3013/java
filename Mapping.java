import java.util.HashMap;
import java.util.LinkedList;
import java.util.Arrays;
// one comment added by the jarvis
class User{
    private String userName;
    private String userId;
    User(String userName,String userId){
        this.userName = userName;
        this.userId = userId;
    }

    public String getUserName(){
        return this.userName;
    }
    public String getUserId(){
        return this.userId;
    }
}

class Posts{
    private LinkedList<String[]> postsList = new LinkedList<>();
    public void addPost(String[] post){
        postsList.add(post);
        
    }
    public LinkedList<String[]> getAllPosts(){
        return this.postsList;
    }
    public int getPostsSize(){
        return this.postsList.size();
    }
    
    public void displayPosts(){
        for(int i=0;i<postsList.size();i++){
            System.out.println(Arrays.toString(postsList.get(i)));
        }
    }
}
public class Mapping{
    public static void main(String[] args){
        HashMap<User,Posts> map = new HashMap<>();

        // -------------------
        User u1 = new User("user1","user1ID");
        User u2 = new User("user2","user2ID");
        // ------------------
        // ------------------
        String[] user1Posts = {"image","post1","comment1"};
        Posts user1 = new Posts();
        user1.addPost(user1Posts);

        String[] user2Posts = {"image","post2","comment2"};
        Posts user2 = new Posts();
        user2.addPost(user2Posts);
        // ------------------

        map.put(u1,user1);
        map.put(u2,user2);

        System.out.println(map);
        System.out.println(map.get(u1).getAllPosts());
        System.out.println(map.get(u1).getPostsSize());
        map.get(u1).displayPosts();
        map.get(u2).displayPosts();
        // map.get(u1).getAllPosts();
    }
}
