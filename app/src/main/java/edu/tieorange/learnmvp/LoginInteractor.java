package edu.tieorange.learnmvp;

/**
 * Created by root on 11/12/16.
 */
public class LoginInteractor {
    public boolean isValidCredentials(User user) {
        if(user.password.get().isEmpty() || user.username.get().isEmpty()){
            return false;
        }
        return true;
    }
}
