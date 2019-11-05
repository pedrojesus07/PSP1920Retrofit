package com.example.psp1920retrofit.view;

import android.app.Application;

import com.example.psp1920retrofit.model.Repository;
import com.example.psp1920retrofit.model.data.Type;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class MainViewModel extends AndroidViewModel {

    private Repository repository;



    public MainViewModel(@NonNull Application application) {
        super(application);
        repository = new Repository();
    }

    public List<Type> getTypeList(){
        return repository.getTypeList();
    }
}
