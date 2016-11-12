package edu.tieorange.learnmvp;

/**
 * Created by root on 11/12/16.
 */
public class LoginPresenter implements ILoginPresenter, ILoginFinished {
    private ILoginView mView;
    private LoginInteractor mInteractor;

    public LoginPresenter(ILoginView iLoginView) {
        mView = iLoginView;
    }

    @Override
    public void attemptToLogin(User user) {
        mInteractor.validateCredentials(this, user);
    }

    @Override
    public void onError() {
        mView.loginFailed();
    }

    @Override
    public void onSuccess() {
        mView.navigateToMainActivity();
    }
}
