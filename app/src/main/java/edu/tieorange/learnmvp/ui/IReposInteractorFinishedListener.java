package edu.tieorange.learnmvp.ui;

import java.util.List;

/**
 * Created by root on 11/12/16.
 */
public interface IReposInteractorFinishedListener {
    void onNetworkSuccess(List<Repo> list);

    void onNetworkFailure(String error);
}
