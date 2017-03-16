package javakurs;

import java.security.Permission;

public class Account {
    private int userId;
    private Permissions perm;

    public Account(int userId) {
        this.userId = userId;
        this.perm = new Permissions();
    }

    public int getUserId() {
        return this.userId;
    }

    public static class Permissions {
        public boolean canRead;
        public boolean canWrite;
        public boolean canDelete;
    }

    public Permissions getPermissions() {
        return this.perm;
    }
}
