package edu.tieorange.learnmvp.models;

import android.databinding.BindingAdapter;
import android.databinding.InverseBindingAdapter;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.support.v4.util.Pair;
import android.support.v7.widget.AppCompatEditText;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by root on 11/12/16.
 */
public class User {
    public ObservableField<String> username = new ObservableField<>();
    public ObservableField<String> password = new ObservableField<>();

    public User() {
        this("", "");
    }

    public User(String username, String password) {
        this.username.set(username);
        this.password.set(password);
    }

    @Override
    public String toString() {
        return "User{" +
                "username=" + username.get() +
                ", password=" + password.get() +
                '}';
    }
}
