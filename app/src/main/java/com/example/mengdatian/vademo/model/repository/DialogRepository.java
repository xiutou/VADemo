package com.example.mengdatian.vademo.model.repository;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import com.example.mengdatian.vademo.model.JavaBean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mengdatian
 */
public class DialogRepository {
    MutableLiveData<JavaBean>dialogData = new MutableLiveData<>();
    private DialogRepository() {
    }

    private static class SingletonInstance {
        private static final DialogRepository INSTANCE = new DialogRepository();
    }

    public static DialogRepository getInstance() {
        return SingletonInstance.INSTANCE;
    }

    public MutableLiveData<JavaBean>getDialog(){
      return dialogData;
    }
}