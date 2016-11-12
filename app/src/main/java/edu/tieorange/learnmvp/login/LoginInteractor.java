package edu.tieorange.learnmvp.login;

import android.os.Handler;

import edu.tieorange.learnmvp.models.User;

/**
 * Created by root on 11/12/16.
 */
class LoginInteractor {
    void validateCredentials(final ILoginFinished listener, final User user) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (user.password.get().isEmpty() || user.username.get().isEmpty()) {
                    listener.onError();
                } else {
                    listener.onSuccess();
                }
            }
        }, 1000);

    }
}
