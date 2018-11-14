package com.example.mengdatian.vademo.viewModel;


import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.support.annotation.NonNull;

import com.example.mengdatian.vademo.model.JavaBean;
import com.example.mengdatian.vademo.model.repository.DialogRepository;

import java.nio.channels.MulticastChannel;
import java.util.List;

/**
 * @author mengdatian
 */
public class MainViewModel extends AndroidViewModel {
    private DialogRepository dialogRepository;
    private MutableLiveData<JavaBean> dialogObservable;

    public MainViewModel(@NonNull Application application) {
        super(application);
        dialogObservable = new MutableLiveData<>();
    }

    public MutableLiveData<JavaBean> getDialogObservable() {
        return dialogObservable;
    }

}
