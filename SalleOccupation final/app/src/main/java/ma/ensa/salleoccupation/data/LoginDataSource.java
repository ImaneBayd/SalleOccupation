package ma.ensa.salleoccupation.data;

import ma.ensa.salleoccupation.data.model.LoggedInUser;

import java.io.IOException;

import javax.security.auth.login.LoginException;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {

    public Result<LoggedInUser> login(String username, String password) {

        try {
            if (username.equals("admin") && password.equals("admin123")) {

                LoggedInUser fakeUser =
                        new LoggedInUser(
                                java.util.UUID.randomUUID().toString(),
                                "admin");
                return new Result.Success<>(fakeUser);
            }
            return new Result.Error(new LoginException("erreur"));
        } catch (Exception e) {
            return new Result.Error(new IOException("Error logging in", e));
        }
    };

    public void logout() {
        // TODO: revoke authentication
    }
}