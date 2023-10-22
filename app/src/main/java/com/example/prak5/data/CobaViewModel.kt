package com.example.prak5.data

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CobaViewModel: ViewModel() {
    var namaUsr : String by mutableStateOf("")
        private set
    var noTlp : String by mutableStateOf("")
        private set
    var jenisKl : String by mutableStateOf("")
        private set
    var Goldar : String by mutableStateOf("")
        private set
    private val _uiState = MutableStateFlow(DataForm())
    val uiState: StateFlow<DataForm> = _uiState.asStateFlow()

    fun BacaData(nm:String,tlp:String, jk:String, godar:String){
        namaUsr=nm;
        noTlp=tlp;
        jenisKl=jk;
        Goldar=godar;
    }
    fun setJK(pilihJK:String){
        _uiState.update { currenState -> currenState.copy(sex= pilihJK)}
    }
}



