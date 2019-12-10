package com.example.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {
    private val _counter = MutableLiveData<Int>()
     val getCounter: LiveData<Int>
        get() = _counter // getter

    init {
        Log.d("ViewModel","ViewModel initialised")
        _counter.value = 0
    }

    fun increment(){
        _counter.value = _counter.value?.plus(1)
    }
    fun decrement(){
        _counter.value = _counter.value?.minus(1)
    }

    //last call back method of view Model
    override fun onCleared() {
        Log.d("ViewModel","ViewModel cleared")
        super.onCleared()
    }
}


