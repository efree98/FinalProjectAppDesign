package com.example.finalprojectv2.ui.slideshow

import android.R
import android.R.attr.button
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class SlideshowViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is FoundersMap2 Fragment"
    }



    val text: LiveData<String> = _text
}

/*fun setHighlighted(highlight: Boolean) {
    button.(if (highlight) R.drawable.bgalt else R.drawable.bgnorm)
*/

