package com.raywenderlich.galacticon

import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.*
import android.util.Log
import android.view.View
import android.view.ViewGroup

class RecyclerAdapter(private val photos: ArrayList<Photo>)  : Adapter<RecyclerAdapter.PhotoHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerAdapter.PhotoHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(p0: RecyclerAdapter.PhotoHolder, p1: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount() = photos.size

    class PhotoHolder (v: View) : RecyclerView.ViewHolder(v), View.OnClickListener{

        private var view: View = v
        private var photo: Photo? = null

        init {
            v.setOnClickListener(this)
        }

        override fun onClick(v: View) {
            Log.d("RecyclerView", "You have clicked!")
        }

        companion object{
            private val PHOTO_KEY = "PHOTO"
        }
    }

}