package com.dycode.edu.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {
    /**
     * Live Data Instance
     */
    private MutableLiveData<String> mName = new MutableLiveData<>();

    public void setName(String name) {
        mName.setValue(name);
    }

    private MutableLiveData<String> mAge = new MutableLiveData<>();
    private MutableLiveData<String> mEmail = new MutableLiveData<>();
    private MutableLiveData<String> mNumber = new MutableLiveData<>();
    private MutableLiveData<String> mAddress = new MutableLiveData<>();

    public LiveData<String> getName() {
        return mName;
    }

    public LiveData<String> getAge() {
        return mAge;
    }

    public void setAge(String age) {
        mAge.setValue(age);
    }

    public LiveData<String> getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail.setValue(email);
    }

}



