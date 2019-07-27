package lesson9homework;

public class Users {
    private long id;
    private String name;
    private String sessionId;
    public Users(long id, String name, String sessionId) {
        this.id = id;
        this.name = name;
        this.sessionId = sessionId;
    }

    public long getId() {
            return id;
        }


    public String getName() {
        return name;
        }

    public String getSessionId() {
        return sessionId;
        }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sessionId='" + sessionId + '\'' +
                '}';
    }
}
