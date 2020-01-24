package com.shiraj.notetakingapp.di;

import androidx.lifecycle.ViewModelProvider;

import com.shiraj.notetakingapp.viewmodels.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory viewModelProviderFactory);
}
