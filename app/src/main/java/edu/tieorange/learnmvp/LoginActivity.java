package edu.tieorange.learnmvp;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import edu.tieorange.learnmvp.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    private static final String TAG = LoginActivity.class.getCanonicalName();
    private User mUser = new User();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLoginBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        binding.setUser(mUser);
    }

    public void onClickLogin(View view) {
        // go to Main act.
        Log.d(TAG, "onClickLogin() called with: view = [" + mUser + "]");
    }
}
