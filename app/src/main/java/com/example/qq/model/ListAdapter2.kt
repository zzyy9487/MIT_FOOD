package com.example.qq.model

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.qq.R
import kotlinx.android.synthetic.main.checkfood_cell.view.*

class ListAdapter2 (val TTList:List<Model>, val context2: Context):RecyclerView.Adapter<ListAdapter2.ViewHolder>(){

    private var smallWoman: ClickListener?=null

    interface ClickListener{
        fun pluswrite(position: Int, locate: Int, number: Int, price: Int, cost: Int)
        fun minuswrite(position: Int, locate: Int, number: Int, price: Int, cost: Int)
        fun remove(position: Int, locate:Int)
        fun showTotalPrice(total: Int)
    }


    fun setClickListener(ClickListener:ClickListener){
        this.smallWoman = ClickListener
    }


    override fun onCreateViewHolder(viewGroup: ViewGroup, position: Int): ViewHolder {

        val view2 = LayoutInflater.from(context2).inflate(R.layout.checkfood_cell, viewGroup, false)

        return ViewHolder(view2)
    }

    override fun getItemCount():Int{
        return TTList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindModel(TTList[position])


        holder.itemView.plusbtn.setOnClickListener{
            var number = TTList[position].cost/TTList[position].price
            number = number +1
            holder.itemView.checknumbertext.text = (number).toString()
            var cost:Int = TTList[position].price * number
            holder.itemView.pricetext.text = (cost).toString()
            smallWoman?.pluswrite(position, TTList[position].loccate, number, TTList[position].price, cost)
            val totalPrice:Int = TTList.sumBy { it.cost }
            smallWoman?.showTotalPrice(totalPrice)
        }

        holder.itemView.minusbtn.setOnClickListener{
            var number = TTList[position].cost/TTList[position].price
            number = number -1

            if (number<=0){smallWoman?.remove(position, TTList[position].loccate)
                val totalPrice:Int = TTList.sumBy { it.cost }
                smallWoman?.showTotalPrice(totalPrice)}

            else{holder.itemView.checknumbertext.text = (number).toString()
                 var cost:Int = TTList[position].price * number
                 holder.itemView.pricetext.text = (cost).toString()
                 smallWoman?.minuswrite(position, TTList[position].loccate, number, TTList[position].price, cost)
                val totalPrice:Int = TTList.sumBy { it.cost }
                smallWoman?.showTotalPrice(totalPrice)
            }
        }
    }


    inner class ViewHolder(itemview2: View):RecyclerView.ViewHolder(itemview2){

        fun bindModel(model: Model){
            itemView.pricetext.text = model.cost.toString()
            var cost = model.cost
            var price = model.price
            itemView.checknumbertext.text = (cost/price).toString()


            when(model.loccate){
                0 -> itemView.img_bg2.setImageResource(R.drawable.bg1)
                1 -> itemView.img_bg2.setImageResource(R.drawable.bg2)
                2 -> itemView.img_bg2.setImageResource(R.drawable.bg3)
                3 -> itemView.img_bg2.setImageResource(R.drawable.bg4)
                4 -> itemView.img_bg2.setImageResource(R.drawable.bg5)
                5 -> itemView.img_bg2.setImageResource(R.drawable.bg6)
                6 -> itemView.img_bg2.setImageResource(R.drawable.bg7)
                7 -> itemView.img_bg2.setImageResource(R.drawable.bg8)
                8 -> itemView.img_bg2.setImageResource(R.drawable.bg9)
                9 -> itemView.img_bg2.setImageResource(R.drawable.bg10)
                10-> itemView.img_bg2.setImageResource(R.drawable.bg11)
            }

            when(model.loccate){
                0 ->itemView.img_item2.setImageResource(R.drawable.i1)
                1 ->itemView.img_item2.setImageResource(R.drawable.i2)
                2 ->itemView.img_item2.setImageResource(R.drawable.i3)
                3 ->itemView.img_item2.setImageResource(R.drawable.i4)
                4 ->itemView.img_item2.setImageResource(R.drawable.i5)
                5 ->itemView.img_item2.setImageResource(R.drawable.i6)
                6 ->itemView.img_item2.setImageResource(R.drawable.i7)
                7 ->itemView.img_item2.setImageResource(R.drawable.i8)
                8 ->itemView.img_item2.setImageResource(R.drawable.i9)
                9 ->itemView.img_item2.setImageResource(R.drawable.i10)
                10->itemView.img_item2.setImageResource(R.drawable.i11)
            }

            when(model.loccate){
                0 ->itemView.img_title2.setImageResource(R.drawable.t1)
                1 ->itemView.img_title2.setImageResource(R.drawable.t2)
                2 ->itemView.img_title2.setImageResource(R.drawable.t3)
                3 ->itemView.img_title2.setImageResource(R.drawable.t4)
                4 ->itemView.img_title2.setImageResource(R.drawable.t5)
                5 ->itemView.img_title2.setImageResource(R.drawable.t6)
                6 ->itemView.img_title2.setImageResource(R.drawable.t7)
                7 ->itemView.img_title2.setImageResource(R.drawable.t8)
                8 ->itemView.img_title2.setImageResource(R.drawable.t9)
                9 ->itemView.img_title2.setImageResource(R.drawable.t10)
                10->itemView.img_title2.setImageResource(R.drawable.t11)
            }
        }
    }
}
