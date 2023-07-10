package om.gov.taxoman.entity;

import java.util.Arrays;

public class User {

    private int id;
    private String username;
    private String password;
    private String[] roles = new String[5];

    public User(){
        this(-1,"default","default", new String[]{"ADMIN","USER"});
    }

    public User(int id, String username, String password, String[] roles){
        this.id=id;
        this.username=username;
        this.password=password;
        this.roles=roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", roles=" + Arrays.toString(roles) +
                '}';
    }
}

