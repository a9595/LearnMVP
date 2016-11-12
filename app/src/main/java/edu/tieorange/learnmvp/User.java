package edu.tieorange.learnmvp;

import android.databinding.ObservableField;

/**
 * Created by root on 11/12/16.
 */
public class User {
    public ObservableField<String> username;
    public ObservableField<String> password;

    public User(String username, String password) {
        this.username.set(username);
        this.password.set(password);
    }
}
