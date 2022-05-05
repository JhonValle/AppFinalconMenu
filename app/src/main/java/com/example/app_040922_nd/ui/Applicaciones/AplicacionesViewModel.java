package com.example.app_040922_nd.ui.Applicaciones;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AplicacionesViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AplicacionesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is abrir aplicaciones fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}