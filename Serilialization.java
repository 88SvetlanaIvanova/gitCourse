import java.User;
import java.io.*;

public class Serilialization {
    public static void main(String[] args) throws IOException {
    User user = new User();
    user.name = "Bro";
    user.password = "I <3Pizza";

        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("object info saved! :");

    }

}

