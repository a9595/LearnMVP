package edu.tieorange.learnmvp;

/**
 * Created by root on 11/12/16.
 */
public class LoginPresenter implements ILoginPresenter {
    private ILoginView mView;
    private LoginInteractor mInteractor;

    public LoginPresenter(ILoginView iLoginView) {

        mView = iLoginView;
    }

    @Override
    public void attemptToLogin(User user) {
        boolean isValid = mInteractor.isValidCredentials(user);
        if (isValid) mView.navigateToMainActivity();
        else mView.loginFailed();
    }
}
