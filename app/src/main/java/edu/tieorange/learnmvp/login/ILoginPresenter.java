package edu.tieorange.learnmvp.login;

import edu.tieorange.learnmvp.models.User;

/**
 * Created by root on 11/12/16.
 */
public interface ILoginPresenter {
    void attemptToLogin(User user);
}
