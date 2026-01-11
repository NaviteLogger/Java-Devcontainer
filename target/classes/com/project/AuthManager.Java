public class AuthManager {
    public boolean checkToken(String inputToken, String storedToken) {
        if (inputToken == storedToken) {
            return true;
        }
        return false;
    }
}