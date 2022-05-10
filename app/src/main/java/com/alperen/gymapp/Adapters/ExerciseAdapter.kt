package com.alperen.gymapp.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.alperen.gymapp.Exercise
import com.alperen.gymapp.R
import java.util.ArrayList

class ExerciseAdapter(private val exerciseList:ArrayList<Exercise>): RecyclerView.Adapter<ExerciseAdapter.ExerciseViewHolder>(){
    private var details = arrayOf("Click for details","Click for details","Click for details",
        "Click for details",
        "Click for details",
        "Click for details",
        "Click for details",
        "Click for details"
    )


    var onItemClick : ((Exercise) -> Unit)? = null

    class ExerciseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView: ImageView = itemView.findViewById(R.id.item_image)
        val textView: TextView = itemView.findViewById(R.id.item_title)
        val textView2: TextView = itemView.findViewById(R.id.item_detail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciseViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_layout,parent,false)
        return ExerciseViewHolder(view)
    }

    override fun onBindViewHolder(holder: ExerciseViewHolder, position: Int) {


        val exercise = exerciseList[position]
        holder.imageView.setImageResource(exercise.image)
        holder.textView.text = exercise.name
        holder.textView2.text = details[position]
        //holder.textView2.text = exercise.detail

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(exercise)
        }
    }

    override fun getItemCount(): Int {
        return exerciseList.size
    }
}