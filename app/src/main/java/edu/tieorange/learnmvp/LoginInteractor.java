package edu.tieorange.learnmvp;

import android.os.Handler;

/**
 * Created by root on 11/12/16.
 */
class LoginInteractor {
    void validateCredentials(final ILoginFinished listener, final User user) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (user.password.get().isEmpty() || user.username.get().isEmpty()) {
                    listener.onSuccess();
                } else {
                    listener.onError();
                }
            }
        }, 1000);

    }
}
