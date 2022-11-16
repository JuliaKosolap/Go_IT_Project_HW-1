package Module13;

import Module13.helpers.UserTasksRequestsHelper;

import java.io.IOException;

public class Task3 {
    static int id = 1;
    private static String URL = "https://jsonplaceholder.typicode.com/users/";

    public static void main(String[] args) throws IOException {
        UserTasksRequestsHelper helper = new UserTasksRequestsHelper();
        while (id <= 10) {
            helper.printAllUserTasks(URL + String.valueOf(id) + "/todos");
            id++;
        }
    }
}
