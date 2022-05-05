package com.example.app_040922_nd.ui.filantropos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FilantroposViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public FilantroposViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is maravillas modernas fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}