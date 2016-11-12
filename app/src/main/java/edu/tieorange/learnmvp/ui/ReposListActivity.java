package edu.tieorange.learnmvp.ui;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import edu.tieorange.learnmvp.R;
import edu.tieorange.learnmvp.databinding.ActivityReposListBinding;

public class ReposListActivity extends AppCompatActivity implements IReposListView {


    private ActivityReposListBinding mBinding;
    private IReposInteractorFinishedListener mPresenter;
    private RepoAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_repos_list);

        mPresenter = new ReposListPresenter(this);
        initRecycler();

    }

    private void initRecycler() {

//        mBinding.recycler
    }

    @Override
    public void someAction() {

    }

    @Override
    public void onReposLoadedSuccess(List<Repo> list) {
        mAdapter = new RepoAdapter(this, list);
    }

    @Override
    public void onReposLoadedFailure(String error) {

    }
}
