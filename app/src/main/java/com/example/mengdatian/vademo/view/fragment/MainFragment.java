package com.example.mengdatian.vademo.view.fragment;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mengdatian.vademo.R;
import com.example.mengdatian.vademo.model.JavaBean;
import com.example.mengdatian.vademo.view.adapter.DialogAdapter;
import com.example.mengdatian.vademo.viewModel.MainViewModel;
import com.gc.materialdesign.views.ButtonFloat;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mengdatian
 */
public class MainFragment extends Fragment {

    private MainViewModel mViewModel;
    private RecyclerView recyclerView;
    private DialogAdapter dialogAdapter;
    private LinearLayoutManager layoutManager;
    private ButtonFloat button;
    List<JavaBean> list = new ArrayList<>();
    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d("MainFragment", "onCreate");
        super.onCreate(savedInstanceState);
        mViewModel = ViewModelProviders.of(getActivity()).get(MainViewModel.class);
        observeViewModel(mViewModel);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        Log.d("MainFragment", "onCreateView");
        View dialogue = inflater.inflate(R.layout.main_fragment, container, false);
        return dialogue;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("MainFragment", "onActivityCreated");

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d("MainFragment", "onViewCreated");

        initView(view);
    }
    private void initView(View view) {
        recyclerView = (RecyclerView) view.findViewById(R.id.dialogue);
        button = (ButtonFloat) view.findViewById(R.id.testbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainFragment", "onClick");
                mViewModel.getDialogObservable().setValue(new JavaBean("1",1,"查看天气"));
                mViewModel.getDialogObservable().setValue(new JavaBean("0",0,"为你查看天气发送到发送到发送到发送到发送到发斯蒂芬阿斯顿发送到发"));
                mViewModel.getDialogObservable().setValue(new JavaBean("0",2,"今天天气多云"));
                mViewModel.getDialogObservable().setValue(new JavaBean("0",3,"播放歌曲"));
            }
        });
        layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        dialogAdapter = new DialogAdapter(getActivity(),list);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(dialogAdapter);
    }
    private void observeViewModel(MainViewModel viewModel){
        viewModel.getDialogObservable().observe(this, new Observer<JavaBean>() {
            @Override
            public void onChanged(@Nullable JavaBean javaBean) {
                Log.d("MainFragment",javaBean.getId()+javaBean.getContent());
                list.add(javaBean);
                dialogAdapter.notifyDataSetChanged();
                recyclerView.smoothScrollToPosition(dialogAdapter.getItemCount()-1);
            }
        });
    }

}
