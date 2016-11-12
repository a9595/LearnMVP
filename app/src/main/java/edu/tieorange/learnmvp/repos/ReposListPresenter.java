package edu.tieorange.learnmvp.repos;

import java.util.List;

import edu.tieorange.learnmvp.models.Repo;

/**
 * Created by root on 11/12/16.
 */
public class ReposListPresenter implements IReposInteractorFinishedListener {
    private final IReposListView mView;
    private final RepoListInteractor interactor;

    public ReposListPresenter(IReposListView view) {
        this.mView = view;
        this.interactor = new RepoListInteractor(this);
    }

    public void loadCommits(String username) {
        interactor.loadRecentCommits(username);
    }

    @Override
    public void onNetworkSuccess(List<Repo> list) {
        mView.onReposLoadedSuccess(list);
    }

    @Override
    public void onNetworkFailure(String error) {
        mView.onReposLoadedFailure(error);
    }
}
