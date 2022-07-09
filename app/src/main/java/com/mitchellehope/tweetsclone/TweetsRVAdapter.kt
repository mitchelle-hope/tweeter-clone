package com.mitchellehope.tweetsclone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class TweetRvAdapter (var TweetList: List<Tweetz>):
    RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var itemView= LayoutInflater.from(parent.context)
            .inflate(R.layout.tweet_list,parent,false)
        return ContactViewHolder(itemView)

    }
    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact=TweetList.get(position)
        holder.tvOne.text=currentContact.name
        holder.tvTwo.text=currentContact.tweet
        holder.tvMessage.text=currentContact.message
        holder.tvLove.text=currentContact.messageTweet
        holder.tvResend.text=currentContact.loveTweet




    }

    override fun getItemCount(): Int {
        return TweetList.size
    }
}
class ContactViewHolder(itemView:View):
    RecyclerView.ViewHolder(itemView) {
    var tvOne= itemView.findViewById<TextView>(R.id.tvOne)
    var tvTwo = itemView.findViewById<TextView>(R.id.tvTwo)
    var tvMessage= itemView.findViewById<TextView>(R.id.tvMessage)
    var tvLove= itemView.findViewById<TextView>(R.id.tvLove)
    var tvResend= itemView.findViewById<TextView>(R.id.tvResend)
    var tvUpload= itemView.findViewById<TextView>(R.id.tvUpload)
    var imgFirstTweetz=itemView.findViewById<ImageView>(R.id.imgFirstTweet)

}