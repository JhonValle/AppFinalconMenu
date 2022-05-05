package com.example.app_040922_nd.ui.GoogleMaps;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GoogleMapsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public GoogleMapsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is visualizador fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}