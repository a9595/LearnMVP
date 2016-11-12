package edu.tieorange.learnmvp.ui;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 11/12/16.
 */
public class RepoListInteractor {
    private IReposInteractorFinishedListener mListener;

    public RepoListInteractor(IReposInteractorFinishedListener listener) {
        mListener = listener;
    }

    public void loadRecentCommits(String username) {
        List<Repo> commitList = Repo.getDummy(10);
        mListener.onNetworkSuccess(commitList);
    }
}
