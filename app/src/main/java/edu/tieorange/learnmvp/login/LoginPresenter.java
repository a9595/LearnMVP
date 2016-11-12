package edu.tieorange.learnmvp.login;

import java.lang.ref.WeakReference;

import edu.tieorange.learnmvp.models.User;

/**
 * Created by root on 11/12/16.
 */
public class LoginPresenter implements ILoginPresenter, ILoginFinished {
    private WeakReference<ILoginView> mView;
    private LoginInteractor mInteractor;

    public LoginPresenter(ILoginView iLoginView) {
        mView = new WeakReference<>(iLoginView);

        mInteractor = new LoginInteractor();
    }

    @Override
    public void attemptToLogin(User user) {
        mInteractor.validateCredentials(this, user);
    }

    @Override
    public void onError() {
        mView.get().loginFailed();
    }

    @Override
    public void onSuccess() {
        mView.get().navigateToMainActivity();
    }
}
