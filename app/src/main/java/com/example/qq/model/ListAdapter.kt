package com.example.qq.model

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.qq.Main2Activity
import com.example.qq.R
import kotlinx.android.synthetic.main.food_cell.view.*

class ListAdapter (val QQList:List<Model>, val context: Context):RecyclerView.Adapter<ListAdapter.ViewHolder>(){

    private var smallMan: ItemListener?=null

    interface ItemListener{
        fun addItem0()
        fun addItem1()
        fun addItem2()
        fun addItem3()
        fun addItem4()
        fun addItem5()
        fun addItem6()
        fun addItem7()
        fun addItem8()
        fun addItem9()
        fun addItem10()
        fun removeItem0()
        fun removeItem1()
        fun removeItem2()
        fun removeItem3()
        fun removeItem4()
        fun removeItem5()
        fun removeItem6()
        fun removeItem7()
        fun removeItem8()
        fun removeItem9()
        fun removeItem10()
        fun modItem0()
        fun modItem1()
        fun modItem2()
        fun modItem3()
        fun modItem4()
        fun modItem5()
        fun modItem6()
        fun modItem7()
        fun modItem8()
        fun modItem9()
        fun modItem10()
        fun modQQQItem0()
        fun modQQQItem1()
        fun modQQQItem2()
        fun modQQQItem3()
        fun modQQQItem4()
        fun modQQQItem5()
        fun modQQQItem6()
        fun modQQQItem7()
        fun modQQQItem8()
        fun modQQQItem9()
        fun modQQQItem10()
    }

    fun setItemListener(ItemListener:ItemListener){
        this.smallMan = ItemListener
    }

//    interface tabSelectedListener{
//        fun tagA()
//        fun tagB()
//    }
//
//    fun settabSelectedListener(tabSelectedListener: tabSelectedListener){
//        this.smallthree = tabSelectedListener
//    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListAdapter.ViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.food_cell, viewGroup, false)

        return ViewHolder(view)
    }

    override fun getItemCount():Int{
        return QQList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindModel(QQList[position])

        val item = QQList[position]
        holder.itemView.checkbox.isChecked = item.isSelect

    }


    inner class ViewHolder(itemview: View):RecyclerView.ViewHolder(itemview){

        fun bindModel(model: Model){
            itemView.checkbox.text = model.price.toString()


            when(model.loccate){
                0 -> itemView.img_bg.setImageResource(R.drawable.bg1)
                1 -> itemView.img_bg.setImageResource(R.drawable.bg2)
                2 -> itemView.img_bg.setImageResource(R.drawable.bg3)
                3 -> itemView.img_bg.setImageResource(R.drawable.bg4)
                4 -> itemView.img_bg.setImageResource(R.drawable.bg5)
                5 -> itemView.img_bg.setImageResource(R.drawable.bg6)
                6 -> itemView.img_bg.setImageResource(R.drawable.bg7)
                7 -> itemView.img_bg.setImageResource(R.drawable.bg8)
                8 -> itemView.img_bg.setImageResource(R.drawable.bg9)
                9 -> itemView.img_bg.setImageResource(R.drawable.bg10)
                10-> itemView.img_bg.setImageResource(R.drawable.bg11)
            }

            when(model.loccate){
                0 ->itemView.img_item.setImageResource(R.drawable.i1)
                1 ->itemView.img_item.setImageResource(R.drawable.i2)
                2 ->itemView.img_item.setImageResource(R.drawable.i3)
                3 ->itemView.img_item.setImageResource(R.drawable.i4)
                4 ->itemView.img_item.setImageResource(R.drawable.i5)
                5 ->itemView.img_item.setImageResource(R.drawable.i6)
                6 ->itemView.img_item.setImageResource(R.drawable.i7)
                7 ->itemView.img_item.setImageResource(R.drawable.i8)
                8 ->itemView.img_item.setImageResource(R.drawable.i9)
                9 ->itemView.img_item.setImageResource(R.drawable.i10)
                10->itemView.img_item.setImageResource(R.drawable.i11)
            }

            when(model.loccate){
                0 ->itemView.img_title.setImageResource(R.drawable.t1)
                1 ->itemView.img_title.setImageResource(R.drawable.t2)
                2 ->itemView.img_title.setImageResource(R.drawable.t3)
                3 ->itemView.img_title.setImageResource(R.drawable.t4)
                4 ->itemView.img_title.setImageResource(R.drawable.t5)
                5 ->itemView.img_title.setImageResource(R.drawable.t6)
                6 ->itemView.img_title.setImageResource(R.drawable.t7)
                7 ->itemView.img_title.setImageResource(R.drawable.t8)
                8 ->itemView.img_title.setImageResource(R.drawable.t9)
                9 ->itemView.img_title.setImageResource(R.drawable.t10)
                10->itemView.img_title.setImageResource(R.drawable.t11)
            }

            when(model.loccate){
                0 -> itemView.checkbox.setOnClickListener {if(itemView.checkbox.isChecked)  {smallMan?.addItem0()
                                                            smallMan?.modItem0()}
                                                            else {smallMan?.removeItem0()
                                                                    smallMan?.modQQQItem0()}}
                1 -> itemView.checkbox.setOnClickListener {if(itemView.checkbox.isChecked)  {smallMan?.addItem1()
                                                            smallMan?.modItem1()}
                                                            else {smallMan?.removeItem1()
                                                                    smallMan?.modQQQItem1()}}
                2 -> itemView.checkbox.setOnClickListener {if(itemView.checkbox.isChecked)  {smallMan?.addItem2()
                                                            smallMan?.modItem2()}
                                                            else {smallMan?.removeItem2()
                                                                    smallMan?.modQQQItem2()}}
                3 -> itemView.checkbox.setOnClickListener {if(itemView.checkbox.isChecked)  {smallMan?.addItem3()
                                                            smallMan?.modItem3()}
                                                            else {smallMan?.removeItem3()
                                                                    smallMan?.modQQQItem3()}}
                4 -> itemView.checkbox.setOnClickListener {if(itemView.checkbox.isChecked)  {smallMan?.addItem4()
                                                            smallMan?.modItem4()}
                                                            else {smallMan?.removeItem4()
                                                                    smallMan?.modQQQItem4()}}
                5 -> itemView.checkbox.setOnClickListener {if(itemView.checkbox.isChecked)  {smallMan?.addItem5()
                                                            smallMan?.modItem5()}
                                                            else {smallMan?.removeItem5()
                                                                    smallMan?.modQQQItem5()}}
                6 -> itemView.checkbox.setOnClickListener {if(itemView.checkbox.isChecked)  {smallMan?.addItem6()
                                                            smallMan?.modItem6()}
                                                            else {smallMan?.removeItem6()
                                                                    smallMan?.modQQQItem10()}}
                7 -> itemView.checkbox.setOnClickListener {if(itemView.checkbox.isChecked)  {smallMan?.addItem7()
                                                            smallMan?.modItem7()}
                                                            else {smallMan?.removeItem7()
                                                                    smallMan?.modQQQItem7()}}
                8 -> itemView.checkbox.setOnClickListener {if(itemView.checkbox.isChecked)  {smallMan?.addItem8()
                                                            smallMan?.modItem8()}
                                                            else {smallMan?.removeItem8()
                                                                    smallMan?.modQQQItem8()}}
                9 -> itemView.checkbox.setOnClickListener {if(itemView.checkbox.isChecked)  {smallMan?.addItem9()
                                                            smallMan?.modItem9()}
                                                            else {smallMan?.removeItem9()
                                                                    smallMan?.modQQQItem9()}}
                10-> itemView.checkbox.setOnClickListener {if(itemView.checkbox.isChecked)  {smallMan?.addItem10()
                                                            smallMan?.modItem10()}
                                                            else {smallMan?.removeItem10()
                                                                     smallMan?.modQQQItem10()}}
            }

        }

    }

}