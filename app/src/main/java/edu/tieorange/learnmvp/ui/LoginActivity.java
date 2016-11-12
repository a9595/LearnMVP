package edu.tieorange.learnmvp.ui;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import edu.tieorange.learnmvp.databinding.ActivityLoginBinding;
import edu.tieorange.learnmvp.login.ILoginView;
import edu.tieorange.learnmvp.login.LoginPresenter;
import edu.tieorange.learnmvp.R;
import edu.tieorange.learnmvp.models.User;

public class LoginActivity extends AppCompatActivity implements ILoginView {

    private static final String TAG = LoginActivity.class.getCanonicalName();
    private User mUser = new User();
    private LoginPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLoginBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        binding.setUser(mUser);

        mPresenter = new LoginPresenter(this);
    }

    public void onClickLogin(View view) {
        mPresenter.attemptToLogin(mUser);

    }

    @Override
    public void navigateToMainActivity() {
        Toast.makeText(this, "success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginFailed() {
        Toast.makeText(this, "failed", Toast.LENGTH_SHORT).show();
    }
}
