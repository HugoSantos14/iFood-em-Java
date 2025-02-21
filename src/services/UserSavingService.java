package services;

import java.io.*;
import java.util.List;

import model.contracts.UserService;
import model.entities.User;

public class UserSavingService implements UserService {

    private static final String FILE_PATH = "users.txt";

    @Override
    public void saveUser(User user) {
        
    }

    public List<User> loadUser() {
        return null;
    }

    public static void main(String[] args) {
        String[] lines = new String[] {
                "Good morning",
                "Good afternoon",
                "Good night"
        };

        String path = "C:\\Windows\\Temp\\teste.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
