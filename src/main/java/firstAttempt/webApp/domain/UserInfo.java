package firstAttempt.webApp.domain;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "user_Info")
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String time;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId")
    private User author;

    public UserInfo(){

    }

    public UserInfo(String firstName, String lastName, User user, Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMMM yyyy HH:mm");
        this.author = user;
        this.firstName = firstName;
        this.lastName = lastName;
        this.time = simpleDateFormat.format(date);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
