class Admin {
    String username = "admin170";
    String password = "password170";

    public boolean login(String inputUsername, String inputPassword) {
        return inputUsername.equals(username) && inputPassword.equals(password);
    }
    public void displayInfo() {
    }
}