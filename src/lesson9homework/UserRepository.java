package lesson9homework;

public class UserRepository {
    private Users[] users = new Users[10];

    public UserRepository() {
    }

    public UserRepository(Users[] users) {
        this.users = users;
    }

    public Users[] getUsers() {
        return users;
    }

    private int countUsers() {
        int countUsers = 0;
        for (Users users : this.users) {
            if (users != null)
                countUsers++;
        }
        return countUsers;
    }

    public String[] getUserNames() {
        int index = 0;
        String[] names = new String[countUsers()];
        for (Users users : this.users) {
            if (users != null) {
                names[index] = users.getName()   ;
                index++;
            }

        }
        return names;
    }


    public long[] getUserIds() {
        int index = 0;
        long[] ids = new long[countUsers()];
        for (Users users : this.users) {
            if (users != null) {
                ids[index] = users.getId();
                index++;
            }

        }
        return ids;
    }

    public String getUserNameById(long id) {
        String userName = null;
        for (Users users : this.users) {
            if (users != null) {
                long userID = users.getId();
                if (userID == id) {
                    userName = users.getName();
                }
            }
        }
        return userName;
    }

    public Users getUserByName(String name) {
        Users wantedUsers = null;
        for (Users users : this.users) {
            if (users != null) {
                String userName = users.getName();
                if (userName == name) {
                    wantedUsers = users;
                    break;
                }
            }
        }
        return wantedUsers;
    }

    public Users getUserById(long id) {
        Users wantedUsers = null;
        for (Users users : this.users) {
            if (users != null) {
                long userId = users.getId();
                if (userId == id) {
                    wantedUsers = users;
                    break;
                }
            }
        }
        return wantedUsers;
    }

    public Users getUserBySessionId(String sessionId) {
        Users wantedUsers = null;
        for (Users users : this.users) {
            if (users != null) {
                String userSessionId = users.getSessionId();
                if (userSessionId == sessionId) {
                    wantedUsers = users;
                    break;
                }
            }
        }
        return wantedUsers;
    }

    private Users findById(long id) {
        Users repeatedUsers = null;
        for (Users users : this.users) {
            if (users != null) {
                long userId = users.getId();
                if (userId == id) {
                    repeatedUsers = users;
                }
            }
        }
        return repeatedUsers;
    }

    public Users save(Users users) {
        if(users == null)
            return null;

        if (findById(users.getId()) != null) {
            return null;
        }
        int index = 0;
        for (Users nullUsers : this.users) {
            if (nullUsers == null) {
                this.users[index] = users;
                return users;
            }
            index++;
        }
        return null;
    }

    public Users update(Users users) {
        if(users == null)
            return null;

        int index = 0;
        for (Users wantedUsers : this.users) {
            if (wantedUsers != null && wantedUsers.getId() == users.getId()) {
                this.users[index] = users;
                return this.users[index];
            }
            index++;

        }

        return null;
    }

        public void delete ( long id){
            int index = 0;
            for (Users wantedUsers : users) {
                if (findById(id) == wantedUsers) {
                    users[index] = null;
                }
                index++;
            }
        }
}