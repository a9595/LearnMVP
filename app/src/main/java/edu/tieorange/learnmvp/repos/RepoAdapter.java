package edu.tieorange.learnmvp.repos;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.android.databinding.library.baseAdapters.BR;

import java.util.ArrayList;
import java.util.List;

import edu.tieorange.learnmvp.R;
import edu.tieorange.learnmvp.models.Repo;


/**
 * Created by root on 11/12/16.
 */
public class RepoAdapter extends RecyclerView.Adapter<RepoAdapter.ViewHolder> {
    private Context mContext;
    private List<Repo> mMyModels = new ArrayList<>();

    public RepoAdapter(Context context, List<Repo> myModels) {
        mContext = context;
        mMyModels = myModels;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
//        ViewDataBinding viewDataBinding = DataBindingUtil.inflate(layoutInflater, R.layout.item_repo, parent, false);
        View view = layoutInflater.inflate(R.layout.item_repo, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Repo repo = mMyModels.get(position);
        holder.mBinding.setVariable(BR.repo, repo);
        holder.mBinding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return mMyModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ViewDataBinding mBinding;

        public ViewHolder(View view) {
            super(view);
            mBinding = DataBindingUtil.bind(view);
        }
    }
}
