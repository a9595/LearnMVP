package edu.tieorange.learnmvp.ui;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.Toast;

import java.util.List;

import edu.tieorange.learnmvp.R;
import edu.tieorange.learnmvp.databinding.ActivityReposListBinding;
import edu.tieorange.learnmvp.models.Repo;
import edu.tieorange.learnmvp.models.User;
import edu.tieorange.learnmvp.repos.IReposListView;
import edu.tieorange.learnmvp.repos.RepoAdapter;
import edu.tieorange.learnmvp.repos.ReposListPresenter;

public class ReposListActivity extends AppCompatActivity implements IReposListView {


    private ReposListPresenter mPresenter;
    private RepoAdapter mAdapter;

    private ActivityReposListBinding mBinding;
    private User mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_repos_list);

        mPresenter = new ReposListPresenter(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mUser = new User("tieorange", "admin");
        mPresenter.loadCommits(mUser.username.get());
    }

    private void initRecycler(List<Repo> list) {
        mBinding.recycler.setLayoutManager(new LinearLayoutManager(this));

        mAdapter = new RepoAdapter(this, list);
        mBinding.recycler.setAdapter(mAdapter);
    }

    @Override
    public void onReposLoadedSuccess(List<Repo> list) {
        initRecycler(list);
    }

    @Override
    public void onReposLoadedFailure(String error) {
        Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
    }
}
