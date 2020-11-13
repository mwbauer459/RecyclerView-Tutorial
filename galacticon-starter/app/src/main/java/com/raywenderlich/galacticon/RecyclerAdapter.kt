package com.raywenderlich.galacticon

import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.*
import android.util.Log
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.recyclerview_item_row.view.*

class RecyclerAdapter(private val photos: ArrayList<Photo>)  : RecyclerView.Adapter<RecyclerAdapter.PhotoHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.PhotoHolder {
        val inflatedView = parent.inflate(R.layout.recyclerview_item_row, false)
        return PhotoHolder(inflatedView)

    }


    override fun onBindViewHolder(holder: RecyclerAdapter.PhotoHolder, position: Int) {
        val itemPhoto = photos[position]
        holder.bindPhoto(itemPhoto)
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

        fun bindPhoto(photo: Photo) {
            this.photo = photo
            Picasso.with(view.context).load(photo.url).into(view.itemImage)
            view.itemDate.text = photo.humanDate
            view.itemDescription.text = photo.explanation
        }
    }

}