package Module13;

import Module13.helpers.UserRequestsHelper;

import java.io.IOException;

public class Task1 {
    private static String URL = "https://jsonplaceholder.typicode.com";
    static private int id = 1;
    static private String username = "Samantha";

    public static void main(String[] args) throws IOException, InterruptedException, IOException {
        String data = "{\n" +
                "    \"name\": \"Rassel Weissnat\",\n" +
                "    \"username\": \"RasWeis\",\n" +
                "    \"email\": \"rasweis@gmail.com\",\n" +
                "    \"address\": {\n" +
                "      \"street\": \"Rex Trail\",\n" +
                "      \"suite\": \"Suite 280\",\n" +
                "      \"city\": \"Howemouth\",\n" +
                "      \"zipcode\": \"58804-1099\",\n" +
                "      \"geo\": {\n" +
                "        \"lat\": \"24.8918\",\n" +
                "        \"lng\": \"21.8984\"\n" +
                "      }\n" +
                "    },\n" +
                "    \"phone\": \"210.067.6132\",\n" +
                "    \"website\": \"elvis.io\",\n" +
                "    \"company\": {\n" +
                "      \"name\": \"Johns Group\",\n" +
                "      \"catchPhrase\": \"Configurable multimedia task-force\",\n" +
                "      \"bs\": \"generate enterprise e-tailers\"\n" +
                "    }\n" +
                "  }";
        UserRequestsHelper helper = new UserRequestsHelper();
        helper.sendPost(URL + "/users", data);
        helper.sendPatch(URL + "/users/9", data);
        helper.sendDelete(URL + "/users/1");
        helper.sendGetAllUsersInfo(URL + "/users");

        String idToString = String.valueOf(id);
        String userUrl = URL + "/users/" + idToString;
        helper.sendGetUserInfoByID(userUrl);

        String usernameUrl = URL + "/users?username=" + username;
        helper.sendGetUserInfoByUsername(usernameUrl);
    }
}

