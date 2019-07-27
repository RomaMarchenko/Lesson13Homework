package lesson9homework;

public class UserRepository {
    private User[] users = new User[10];

    public UserRepository() {
    }

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    private int countUsers() {
        int countUsers = 0;
        for (User user : users) {
            if (user != null)
                countUsers++;
        }
        return countUsers;
    }

    public String[] getUserNames() {
        int index = 0;
        String[] names = new String[countUsers()];
        for (User user : users) {
            if (user != null) {
                names[index] = user.getName()   ;
                index++;
            }

        }
        return names;
    }


    public long[] getUserIds() {
        int index = 0;
        long[] ids = new long[countUsers()];
        for (User user : users) {
            if (user != null) {
                ids[index] = user.getId();
                index++;
            }

        }
        return ids;
    }

    public String getUserNameById(long id) {
        String userName = null;
        for (User user : users) {
            if (user != null) {
                long userID = user.getId();
                if (userID == id) {
                    userName = user.getName();
                }
            }
        }
        return userName;
    }

    public User getUserByName(String name) {
        User wantedUser = null;
        for (User user : users) {
            if (user != null) {
                String userName = user.getName();
                if (userName == name) {
                    wantedUser = user;
                    break;
                }
            }
        }
        return wantedUser;
    }

    public User getUserById(long id) {
        User wantedUser = null;
        for (User user : users) {
            if (user != null) {
                long userId = user.getId();
                if (userId == id) {
                    wantedUser = user;
                    break;
                }
            }
        }
        return wantedUser;
    }

    public User getUserBySessionId(String sessionId) {
        User wantedUser = null;
        for (User user : users) {
            if (user != null) {
                String userSessionId = user.getSessionId();
                if (userSessionId == sessionId) {
                    wantedUser = user;
                    break;
                }
            }
        }
        return wantedUser;
    }

    private User findById(long id) {
        User repeatedUser = null;
        for (User user : users) {
            if (user != null) {
                long userId = user.getId();
                if (userId == id) {
                    repeatedUser = user;
                }
            }
        }
        return repeatedUser;
    }

    public User save(User user) {
        if(user == null)
            return null;

        if (findById(user.getId()) != null) {
            return null;
        }
        int index = 0;
        for (User nullUser : users) {
            if (nullUser == null) {
                users[index] = user;
                return user;
            }
            index++;
        }
        return null;
    }

    public User update(User user) {
        if(user == null)
            return null;

        int index = 0;
        for (User wantedUser : users) {
            if (wantedUser != null && wantedUser.getId() == user.getId()) {
                users[index] = user;
                return users[index];
            }
            index++;

        }

        return null;
    }

        public void delete ( long id){
            int index = 0;
            for (User wantedUser : users) {
                if (findById(id) == wantedUser) {
                    users[index] = null;
                }
                index++;
            }
        }
}