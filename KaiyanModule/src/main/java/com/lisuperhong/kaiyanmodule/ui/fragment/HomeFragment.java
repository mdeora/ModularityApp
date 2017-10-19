package com.lisuperhong.kaiyanmodule.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;

import com.company.commonbusiness.base.fragment.BaseMvpFragment;
import com.lisuperhong.kaiyanmodule.R;
import com.lisuperhong.kaiyanmodule.R2;
import com.lisuperhong.kaiyanmodule.contract.HomeVideoContract;
import com.lisuperhong.kaiyanmodule.presenter.HomeVideoPresenter;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends BaseMvpFragment<HomeVideoPresenter> implements HomeVideoContract.View {

    public static final String TITLE = "title";

    @BindView(R2.id.swipe_refresh)
    SwipeRefreshLayout swipeRefreshLayout;
    @BindView(R2.id.rv_home)
    RecyclerView recyclerView;

    private String title;

    public static HomeFragment newInstance(String title) {
        HomeFragment fragment = new HomeFragment();
        Bundle bundle = new Bundle();
        bundle.putString(TITLE, title);
        fragment.setArguments(bundle);
        return fragment;
    }


    @Override
    protected int getLayoutResId() {
        return R.layout.kaiyan_fragment_home;
    }

    @Override
    protected void handleArguments() {
        title = getArguments().getString(TITLE);
    }

    @Override
    protected void initView() {

    }

    @Override
    public void setPresenter() {

    }

    @Override
    protected void initData() {

    }
}
