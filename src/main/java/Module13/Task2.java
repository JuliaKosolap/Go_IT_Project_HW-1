package Module13;

import Module13.helpers.UserPostsRequestHelper;

import java.io.IOException;

public class Task2 {
    static int id = 1;
    private static String URL_USERS = "https://jsonplaceholder.typicode.com/users/";
    private static String URL_POSTS = "https://jsonplaceholder.typicode.com/posts/";

    public static void main(String[] args) throws IOException, InterruptedException {
        UserPostsRequestHelper helper = new UserPostsRequestHelper();
        while (id <= 1) {
            int lastPostId = helper.getLastUserPostId(URL_USERS + String.valueOf(id) + "/posts");
            String s = String.valueOf(lastPostId);
            String lastPostCommentsUrl = URL_POSTS + s + "/comments";
            helper.getLastPostComments(lastPostCommentsUrl, "user-" + id + "-post-" + lastPostId + "-comments.json");
            id++;
        }
    }
}
