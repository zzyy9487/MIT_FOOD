package com.example.qq

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.graphics.BitmapFactory
import android.media.MediaPlayer
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.ToggleButton
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.qq.model.ListAdapter
import com.example.qq.model.ListAdapter2
import com.example.qq.model.Model
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main2.*
import okhttp3.*
import java.io.IOException
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.webkit.WebViewClient


class Main2Activity : AppCompatActivity() {

    private lateinit var musicplayer: MediaPlayer

    lateinit var manager: NotificationManager
    lateinit var builder: Notification.Builder


    val QQQList by lazy {
        mutableListOf(
            Model(0, "bg1", "i1", "t1", 60, "A", 1, 0, false),
            Model(1, "bg2", "i2", "t2", 120, "A", 1, 0, false),
            Model(2, "bg3", "i3", "t3", 60, "A", 1, 0, false),
            Model(3, "bg4", "i4", "t4", 120, "A", 1, 0, false),
            Model(4, "bg5", "i5", "t5", 120, "A", 1, 0, false),
            Model(5, "bg6", "i6", "t6", 120, "A", 1, 0, false),
            Model(6, "bg7", "i7", "t7", 120, "A", 1, 0, false),
            Model(7, "bg8", "i8", "t8", 120, "A", 1, 0, false),
            Model(8, "bg9", "i9", "t9", 60, "B", 1, 0, false),
            Model(9, "bg10", "i10", "t10", 60, "B", 1, 0, false),
            Model(10, "bg11", "i11", "t11", 60, "B", 1, 0, false)
        )
    }

    var QQlist = mutableListOf<Model>()




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        //  recyclerView內的內容&Adapter

        QQlist.addAll(QQQList)
        QQlist.removeAt(10)
        QQlist.removeAt(9)
        QQlist.removeAt(8)
        var adapter = ListAdapter(QQlist, this)
        val recycleView = findViewById<RecyclerView>(R.id.recyclerView)
        recycleView.adapter = adapter
        recycleView.layoutManager = LinearLayoutManager(this)


        var qqlist = mutableListOf<Model>()
        var adapter2 = ListAdapter2(qqlist, this)
        var recyclerView2 = findViewById<RecyclerView>(R.id.recyclerView2)
        recyclerView2.adapter = adapter2
        recyclerView2.layoutManager = LinearLayoutManager(this)


        adapter.setItemListener(object : ListAdapter.ItemListener {
            override fun addItem0() {
                qqlist.add(Model(0, "bg1", "i1", "t1", 60, "A", 1, 60, false))
                adapter2.notifyDataSetChanged()
                val totalPrice: Int = qqlist.sumBy { it.cost }
                this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                if (!qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                    this@Main2Activity.textView_totalprice.visibility = View.VISIBLE
                    this@Main2Activity.recyclerView2.visibility = View.VISIBLE
                } else if (qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.visibility = View.GONE
                    this@Main2Activity.recyclerView2.visibility = View.GONE
                }
            }


            override fun addItem1() {
                qqlist.add(Model(1, "bg2", "i2", "t2", 120, "A", 1, 120, false))
                adapter2.notifyDataSetChanged()
                val totalPrice: Int = qqlist.sumBy { it.cost }
                this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                if (!qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                    this@Main2Activity.textView_totalprice.visibility = View.VISIBLE
                    this@Main2Activity.recyclerView2.visibility = View.VISIBLE
                } else if (qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.visibility = View.GONE
                    this@Main2Activity.recyclerView2.visibility = View.GONE
                }
            }

            override fun addItem2() {
                qqlist.add(Model(2, "bg3", "i3", "t3", 60, "A", 1, 60, false))
                adapter2.notifyDataSetChanged()
                val totalPrice: Int = qqlist.sumBy { it.cost }
                this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                if (!qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                    this@Main2Activity.textView_totalprice.visibility = View.VISIBLE
                    this@Main2Activity.recyclerView2.visibility = View.VISIBLE
                } else if (qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.visibility = View.GONE
                    this@Main2Activity.recyclerView2.visibility = View.GONE
                }
            }

            override fun addItem3() {
                qqlist.add(Model(3, "bg4", "i4", "t4", 120, "A", 1, 120, false))
                adapter2.notifyDataSetChanged()
                val totalPrice: Int = qqlist.sumBy { it.cost }
                this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                if (!qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                    this@Main2Activity.textView_totalprice.visibility = View.VISIBLE
                    this@Main2Activity.recyclerView2.visibility = View.VISIBLE
                } else if (qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.visibility = View.GONE
                    this@Main2Activity.recyclerView2.visibility = View.GONE
                }
            }

            override fun addItem4() {
                qqlist.add(Model(4, "bg5", "i5", "t5", 120, "A", 1, 120, false))
                adapter2.notifyDataSetChanged()
                val totalPrice: Int = qqlist.sumBy { it.cost }
                this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                if (!qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                    this@Main2Activity.textView_totalprice.visibility = View.VISIBLE
                    this@Main2Activity.recyclerView2.visibility = View.VISIBLE
                } else if (qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.visibility = View.GONE
                    this@Main2Activity.recyclerView2.visibility = View.GONE
                }
            }

            override fun addItem5() {
                qqlist.add(Model(5, "bg6", "i6", "t6", 120, "A", 1, 120, false))
                adapter2.notifyDataSetChanged()
                val totalPrice: Int = qqlist.sumBy { it.cost }
                this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                if (!qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                    this@Main2Activity.textView_totalprice.visibility = View.VISIBLE
                    this@Main2Activity.recyclerView2.visibility = View.VISIBLE
                } else if (qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.visibility = View.GONE
                    this@Main2Activity.recyclerView2.visibility = View.GONE
                }
            }

            override fun addItem6() {
                qqlist.add(Model(6, "bg7", "i7", "t7", 120, "A", 1, 120, false))
                adapter2.notifyDataSetChanged()
                val totalPrice: Int = qqlist.sumBy { it.cost }
                this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                if (!qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                    this@Main2Activity.textView_totalprice.visibility = View.VISIBLE
                    this@Main2Activity.recyclerView2.visibility = View.VISIBLE
                } else if (qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.visibility = View.GONE
                    this@Main2Activity.recyclerView2.visibility = View.GONE
                }
            }

            override fun addItem7() {
                qqlist.add(Model(7, "bg8", "i8", "t8", 120, "A", 1, 120, false))
                adapter2.notifyDataSetChanged()
                val totalPrice: Int = qqlist.sumBy { it.cost }
                this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                if (!qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                    this@Main2Activity.textView_totalprice.visibility = View.VISIBLE
                    this@Main2Activity.recyclerView2.visibility = View.VISIBLE
                } else if (qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.visibility = View.GONE
                    this@Main2Activity.recyclerView2.visibility = View.GONE
                }
            }

            override fun addItem8() {
                qqlist.add(Model(8, "bg9", "i9", "t9", 60, "B", 1, 60, false))
                adapter2.notifyDataSetChanged()
                val totalPrice: Int = qqlist.sumBy { it.cost }
                this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                if (!qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                    this@Main2Activity.textView_totalprice.visibility = View.VISIBLE
                    this@Main2Activity.recyclerView2.visibility = View.VISIBLE
                } else if (qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.visibility = View.GONE
                    this@Main2Activity.recyclerView2.visibility = View.GONE
                }
            }

            override fun addItem9() {
                qqlist.add(Model(9, "bg10", "i10", "t10", 60, "B", 1, 60, false))
                adapter2.notifyDataSetChanged()
                val totalPrice: Int = qqlist.sumBy { it.cost }
                this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                if (!qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                    this@Main2Activity.textView_totalprice.visibility = View.VISIBLE
                    this@Main2Activity.recyclerView2.visibility = View.VISIBLE
                } else if (qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.visibility = View.GONE
                    this@Main2Activity.recyclerView2.visibility = View.GONE
                }
            }

            override fun addItem10() {
                qqlist.add(Model(10, "bg11", "i11", "t11", 60, "B", 1, 60, false))
                adapter2.notifyDataSetChanged()
                val totalPrice: Int = qqlist.sumBy { it.cost }
                this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                if (!qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                    this@Main2Activity.textView_totalprice.visibility = View.VISIBLE
                    this@Main2Activity.recyclerView2.visibility = View.VISIBLE
                } else if (qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.visibility = View.GONE
                    this@Main2Activity.recyclerView2.visibility = View.GONE
                }
            }


            override fun removeItem0() {
                for (i in 0..qqlist.size) {
                    if (qqlist[i].loccate == 0) {
                        qqlist.removeAt(i)
                        break
                    }
                }
                adapter2.notifyDataSetChanged()
                val totalPrice: Int = qqlist.sumBy { it.cost }
                this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                if (!qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                    this@Main2Activity.textView_totalprice.visibility = View.VISIBLE
                    this@Main2Activity.recyclerView2.visibility = View.VISIBLE
                } else if (qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.visibility = View.GONE
                    this@Main2Activity.recyclerView2.visibility = View.GONE
                }
            }

            override fun removeItem1() {
                for (i in 0..qqlist.size) {
                    if (qqlist[i].loccate == 1) {
                        qqlist.removeAt(i)
                        break
                    }
                }
                adapter2.notifyDataSetChanged()
                val totalPrice: Int = qqlist.sumBy { it.cost }
                this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                if (!qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                    this@Main2Activity.textView_totalprice.visibility = View.VISIBLE
                    this@Main2Activity.recyclerView2.visibility = View.VISIBLE
                } else if (qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.visibility = View.GONE
                    this@Main2Activity.recyclerView2.visibility = View.GONE
                }
            }

            override fun removeItem2() {
                for (i in 0..qqlist.size) {
                    if (qqlist[i].loccate == 2) {
                        qqlist.removeAt(i)
                        break
                    }
                }
                adapter2.notifyDataSetChanged()
                val totalPrice: Int = qqlist.sumBy { it.cost }
                this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                if (!qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                    this@Main2Activity.textView_totalprice.visibility = View.VISIBLE
                    this@Main2Activity.recyclerView2.visibility = View.VISIBLE
                } else if (qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.visibility = View.GONE
                    this@Main2Activity.recyclerView2.visibility = View.GONE
                }
            }

            override fun removeItem3() {
                for (i in 0..qqlist.size) {
                    if (qqlist[i].loccate == 3) {
                        qqlist.removeAt(i)
                        break
                    }
                }
                adapter2.notifyDataSetChanged()
                val totalPrice: Int = qqlist.sumBy { it.cost }
                this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                if (!qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                    this@Main2Activity.textView_totalprice.visibility = View.VISIBLE
                    this@Main2Activity.recyclerView2.visibility = View.VISIBLE
                } else if (qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.visibility = View.GONE
                    this@Main2Activity.recyclerView2.visibility = View.GONE
                }
            }

            override fun removeItem4() {
                for (i in 0..qqlist.size) {
                    if (qqlist[i].loccate == 4) {
                        qqlist.removeAt(i)
                        break
                    }
                }
                adapter2.notifyDataSetChanged()
                val totalPrice: Int = qqlist.sumBy { it.cost }
                this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                if (!qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                    this@Main2Activity.textView_totalprice.visibility = View.VISIBLE
                    this@Main2Activity.recyclerView2.visibility = View.VISIBLE
                } else if (qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.visibility = View.GONE
                    this@Main2Activity.recyclerView2.visibility = View.GONE
                }
            }

            override fun removeItem5() {
                for (i in 0..qqlist.size) {
                    if (qqlist[i].loccate == 5) {
                        qqlist.removeAt(i)
                        break
                    }
                }
                adapter2.notifyDataSetChanged()
                val totalPrice: Int = qqlist.sumBy { it.cost }
                this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                if (!qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                    this@Main2Activity.textView_totalprice.visibility = View.VISIBLE
                    this@Main2Activity.recyclerView2.visibility = View.VISIBLE
                } else if (qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.visibility = View.GONE
                    this@Main2Activity.recyclerView2.visibility = View.GONE
                }
            }

            override fun removeItem6() {
                for (i in 0..qqlist.size) {
                    if (qqlist[i].loccate == 6) {
                        qqlist.removeAt(i)
                        break
                    }
                }
                adapter2.notifyDataSetChanged()
                val totalPrice: Int = qqlist.sumBy { it.cost }
                this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                if (!qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                    this@Main2Activity.textView_totalprice.visibility = View.VISIBLE
                    this@Main2Activity.recyclerView2.visibility = View.VISIBLE
                } else if (qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.visibility = View.GONE
                    this@Main2Activity.recyclerView2.visibility = View.GONE
                }
            }

            override fun removeItem7() {
                for (i in 0..qqlist.size) {
                    if (qqlist[i].loccate == 7) {
                        qqlist.removeAt(i)
                        break
                    }
                }
                adapter2.notifyDataSetChanged()
                val totalPrice: Int = qqlist.sumBy { it.cost }
                this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                if (!qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                    this@Main2Activity.textView_totalprice.visibility = View.VISIBLE
                    this@Main2Activity.recyclerView2.visibility = View.VISIBLE
                } else if (qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.visibility = View.GONE
                    this@Main2Activity.recyclerView2.visibility = View.GONE
                }
            }

            override fun removeItem8() {
                for (i in 0..qqlist.size) {
                    if (qqlist[i].loccate == 8) {
                        qqlist.removeAt(i)
                        break
                    }
                }
                adapter2.notifyDataSetChanged()
                val totalPrice: Int = qqlist.sumBy { it.cost }
                this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                if (!qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                    this@Main2Activity.textView_totalprice.visibility = View.VISIBLE
                    this@Main2Activity.recyclerView2.visibility = View.VISIBLE
                } else if (qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.visibility = View.GONE
                    this@Main2Activity.recyclerView2.visibility = View.GONE
                }
            }

            override fun removeItem9() {
                for (i in 0..qqlist.size) {
                    if (qqlist[i].loccate == 9) {
                        qqlist.removeAt(i)
                        break
                    }
                }
                adapter2.notifyDataSetChanged()
                val totalPrice: Int = qqlist.sumBy { it.cost }
                this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                if (!qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                    this@Main2Activity.textView_totalprice.visibility = View.VISIBLE
                    this@Main2Activity.recyclerView2.visibility = View.VISIBLE
                } else if (qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.visibility = View.GONE
                    this@Main2Activity.recyclerView2.visibility = View.GONE
                }
            }

            override fun removeItem10() {
                for (i in 0..qqlist.size) {
                    if (qqlist[i].loccate == 10) {
                        qqlist.removeAt(i)
                        break
                    }
                }
                adapter2.notifyDataSetChanged()
                val totalPrice: Int = qqlist.sumBy { it.cost }
                this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                if (!qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                    this@Main2Activity.textView_totalprice.visibility = View.VISIBLE
                    this@Main2Activity.recyclerView2.visibility = View.VISIBLE
                } else if (qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.visibility = View.GONE
                    this@Main2Activity.recyclerView2.visibility = View.GONE
                }
            }


            override fun modItem0() {
                QQQList.set(0, Model(0, "bg1", "i1", "t1", 60, "A", 0, 0, true))
                QQlist.clear()
                QQlist.addAll(QQQList.filter { it.tag == "A" })
                adapter.notifyDataSetChanged()
            }

            override fun modItem1() {
                QQQList.set(1, Model(1, "bg2", "i2", "t2", 120, "A", 0, 0, true))
                QQlist.clear()
                QQlist.addAll(QQQList.filter { it.tag == "A" })
                adapter.notifyDataSetChanged()
            }

            override fun modItem2() {
                QQQList.set(2, Model(2, "bg3", "i3", "t3", 60, "A", 0, 0, true))
                QQlist.clear()
                QQlist.addAll(QQQList.filter { it.tag == "A" })
                adapter.notifyDataSetChanged()
            }

            override fun modItem3() {
                QQQList.set(3, Model(3, "bg4", "i4", "t4", 120, "A", 0, 0, true))
                QQlist.clear()
                QQlist.addAll(QQQList.filter { it.tag == "A" })
                adapter.notifyDataSetChanged()
            }

            override fun modItem4() {
                QQQList.set(4, Model(4, "bg5", "i5", "t5", 120, "A", 0, 0, true))
                QQlist.clear()
                QQlist.addAll(QQQList.filter { it.tag == "A" })
                adapter.notifyDataSetChanged()
            }

            override fun modItem5() {
                QQQList.set(5, Model(5, "bg6", "i6", "t6", 120, "A", 0, 0, true))
                QQlist.clear()
                QQlist.addAll(QQQList.filter { it.tag == "A" })
                adapter.notifyDataSetChanged()
            }

            override fun modItem6() {
                QQQList.set(6, Model(6, "bg7", "i7", "t7", 120, "A", 0, 0, true))
                QQlist.clear()
                QQlist.addAll(QQQList.filter { it.tag == "A" })
                adapter.notifyDataSetChanged()
            }

            override fun modItem7() {
                QQQList.set(7, Model(7, "bg8", "i8", "t8", 120, "A", 0, 0, true))
                QQlist.clear()
                QQlist.addAll(QQQList.filter { it.tag == "A" })
                adapter.notifyDataSetChanged()
            }

            override fun modItem8() {
                QQQList.set(8, Model(8, "bg9", "i9", "t9", 60, "B", 0, 0, true))
                QQlist.clear()
                QQlist.addAll(QQQList.filter { it.tag == "B" })
                adapter.notifyDataSetChanged()
            }

            override fun modItem9() {
                QQQList.set(9, Model(9, "bg10", "i10", "t10", 60, "B", 0, 0, true))
                QQlist.clear()
                QQlist.addAll(QQQList.filter { it.tag == "B" })
                adapter.notifyDataSetChanged()
            }

            override fun modItem10() {
                QQQList.set(10, Model(10, "bg11", "i11", "t11", 60, "B", 0, 0, true))
                QQlist.clear()
                QQlist.addAll(QQQList.filter { it.tag == "B" })
                adapter.notifyDataSetChanged()
            }


            override fun modQQQItem0() {
                QQQList.set(0, Model(0, "bg1", "i1", "t1", 60, "A", 0, 0, false))
                QQlist.clear()
                QQlist.addAll(QQQList.filter { it.tag == "A" })
                adapter.notifyDataSetChanged()
            }

            override fun modQQQItem1() {
                QQQList.set(1, Model(1, "bg2", "i2", "t2", 120, "A", 0, 0, false))
                QQlist.clear()
                QQlist.addAll(QQQList.filter { it.tag == "A" })
                adapter.notifyDataSetChanged()
            }

            override fun modQQQItem2() {
                QQQList.set(2, Model(2, "bg3", "i3", "t3", 60, "A", 0, 0, false))
                QQlist.clear()
                QQlist.addAll(QQQList.filter { it.tag == "A" })
                adapter.notifyDataSetChanged()
            }

            override fun modQQQItem3() {
                QQQList.set(3, Model(3, "bg4", "i4", "t4", 120, "A", 0, 0, false))
                QQlist.clear()
                QQlist.addAll(QQQList.filter { it.tag == "A" })
                adapter.notifyDataSetChanged()
            }

            override fun modQQQItem4() {
                QQQList.set(4, Model(4, "bg5", "i5", "t5", 120, "A", 0, 0, false))
                QQlist.clear()
                QQlist.addAll(QQQList.filter { it.tag == "A" })
                adapter.notifyDataSetChanged()
            }

            override fun modQQQItem5() {
                QQQList.set(5, Model(5, "bg6", "i6", "t6", 120, "A", 0, 0, false))
                QQlist.clear()
                QQlist.addAll(QQQList.filter { it.tag == "A" })
                adapter.notifyDataSetChanged()
            }

            override fun modQQQItem6() {
                QQQList.set(6, Model(6, "bg7", "i7", "t7", 120, "A", 0, 0, false))
                QQlist.clear()
                QQlist.addAll(QQQList.filter { it.tag == "A" })
                adapter.notifyDataSetChanged()
            }

            override fun modQQQItem7() {
                QQQList.set(7, Model(7, "bg8", "i8", "t8", 120, "A", 0, 0, false))
                QQlist.clear()
                QQlist.addAll(QQQList.filter { it.tag == "A" })
                adapter.notifyDataSetChanged()
            }

            override fun modQQQItem8() {
                QQQList.set(8, Model(8, "bg9", "i9", "t9", 60, "B", 0, 0, false))
                QQlist.clear()
                QQlist.addAll(QQQList.filter { it.tag == "B" })
                adapter.notifyDataSetChanged()
            }

            override fun modQQQItem9() {
                QQQList.set(9, Model(9, "bg10", "i10", "t10", 60, "B", 0, 0, false))
                QQlist.clear()
                QQlist.addAll(QQQList.filter { it.tag == "B" })
                adapter.notifyDataSetChanged()
            }

            override fun modQQQItem10() {
                QQQList.set(10, Model(10, "bg11", "i11", "t11", 60, "B", 0, 0, false))
                QQlist.clear()
                QQlist.addAll(QQQList.filter { it.tag == "B" })
                adapter.notifyDataSetChanged()
            }

        })


        adapter2.setClickListener(object : ListAdapter2.ClickListener {

            override fun pluswrite(position: Int, locate: Int, number: Int, price: Int, cost: Int) {
                var no = locate + 1
                var tag = "A"
                if (no >= 9) {
                    tag = "B"
                }

                qqlist.set(
                    position,
                    Model(locate, "bg$no", "i$no", "t$no", price, "$tag", number, cost, false)
                )
                adapter2.notifyDataSetChanged()
            }

            override fun minuswrite(
                position: Int,
                locate: Int,
                number: Int,
                price: Int,
                cost: Int
            ) {
                var no = locate + 1
                var tag = "A"
                if (no >= 9) {
                    tag = "B"
                }

                qqlist.set(
                    position,
                    Model(locate, "bg$no", "i$no", "t$no", price, "$tag", number, cost, false)
                )
                adapter2.notifyDataSetChanged()
            }

            override fun remove(position: Int, locate: Int) {

                var ttlist = mutableListOf<Model>()

                ttlist.addAll(qqlist)

                ttlist.removeAt(position)

                qqlist.clear()

                qqlist.addAll(ttlist)

                adapter2.notifyDataSetChanged()

                val totalPrice: Int = qqlist.sumBy { it.cost }
                this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"

                when (locate) {
                    0 -> {
                        QQQList.set(0, Model(0, "bg1", "i1", "t1", 60, "A", 0, 0, false))
                        QQlist.clear()
                        QQlist.addAll(QQQList.filter { it.tag == "A" })
                        adapter.notifyDataSetChanged()
                    }
                    1 -> {
                        QQQList.set(1, Model(1, "bg2", "i2", "t2", 120, "A", 0, 0, false))
                        QQlist.clear()
                        QQlist.addAll(QQQList.filter { it.tag == "A" })
                        adapter.notifyDataSetChanged()
                    }
                    2 -> {
                        QQQList.set(2, Model(2, "bg3", "i3", "t3", 60, "A", 0, 0, false))
                        QQlist.clear()
                        QQlist.addAll(QQQList.filter { it.tag == "A" })
                        adapter.notifyDataSetChanged()
                    }
                    3 -> {
                        QQQList.set(3, Model(3, "bg4", "i4", "t4", 120, "A", 0, 0, false))
                        QQlist.clear()
                        QQlist.addAll(QQQList.filter { it.tag == "A" })
                        adapter.notifyDataSetChanged()
                    }
                    4 -> {
                        QQQList.set(4, Model(4, "bg5", "i5", "t5", 120, "A", 0, 0, false))
                        QQlist.clear()
                        QQlist.addAll(QQQList.filter { it.tag == "A" })
                        adapter.notifyDataSetChanged()
                    }
                    5 -> {
                        QQQList.set(5, Model(5, "bg6", "i6", "t6", 120, "A", 0, 0, false))
                        QQlist.clear()
                        QQlist.addAll(QQQList.filter { it.tag == "A" })
                        adapter.notifyDataSetChanged()
                    }
                    6 -> {
                        QQQList.set(6, Model(6, "bg7", "i7", "t7", 120, "A", 0, 0, false))
                        QQlist.clear()
                        QQlist.addAll(QQQList.filter { it.tag == "A" })
                        adapter.notifyDataSetChanged()
                    }
                    7 -> {
                        QQQList.set(7, Model(7, "bg8", "i8", "t8", 120, "A", 0, 0, false))
                        QQlist.clear()
                        QQlist.addAll(QQQList.filter { it.tag == "A" })
                        adapter.notifyDataSetChanged()
                    }
                    8 -> {
                        QQQList.set(8, Model(8, "bg9", "i9", "t9", 60, "B", 0, 0, false))
                        QQlist.clear()
                        QQlist.addAll(QQQList.filter { it.tag == "B" })
                        adapter.notifyDataSetChanged()
                    }
                    9 -> {
                        QQQList.set(9, Model(9, "bg10", "i10", "t10", 60, "B", 0, 0, false))
                        QQlist.clear()
                        QQlist.addAll(QQQList.filter { it.tag == "B" })
                        adapter.notifyDataSetChanged()
                    }
                    10 -> {
                        QQQList.set(10, Model(10, "bg11", "i11", "t11", 60, "B", 0, 0, false))
                        QQlist.clear()
                        QQlist.addAll(QQQList.filter { it.tag == "B" })
                        adapter.notifyDataSetChanged()
                    }
                }
            }

            override fun showTotalPrice(total: Int) {
                textView_totalprice.text = "Total：$total"
                adapter2.notifyDataSetChanged()
                val totalPrice: Int = qqlist.sumBy { it.cost }
                this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                if (!qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.text = "Total：$totalPrice"
                    this@Main2Activity.textView_totalprice.visibility = View.VISIBLE
                    this@Main2Activity.recyclerView2.visibility = View.VISIBLE
                } else if (qqlist.isEmpty()) {
                    this@Main2Activity.textView_totalprice.visibility = View.GONE
                    this@Main2Activity.recyclerView2.visibility = View.GONE
                }
            }

        })


        // webview的設定

//        webView.setInitialScale(1)

        webView.webViewClient = WebViewClient()

        webView.settings.javaScriptEnabled = true

//        webView.settings.loadWithOverviewMode = true
//
//        webView.settings.useWideViewPort = true
//
//        webView.settings.builtInZoomControls = true
//
//        webView.settings.domStorageEnabled = true
//
//        webView.settings.javaScriptCanOpenWindowsAutomatically = true

        webView.loadUrl("https://docs.google.com/spreadsheets/d/1ViezauApALd2PcPxF7BTNqJvc3vZEBNCcWcvOBcF4LY/")




        // music 進入Main2Activity開始撥放

        musicplayer = MediaPlayer.create(this, R.raw.noise)

        if (!musicplayer.isPlaying) {
            musicplayer.start()
            musicplayer.isLooping = true
        }

        // 右下角的music啟閉紐

        val toggle: ToggleButton = findViewById(R.id.toggleButton)
        toggle.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                musicplayer.start()
                musicplayer.isLooping = true
                toggle.setBackgroundResource(R.drawable.icon5)
            } else {
                musicplayer.stop()
                musicplayer.prepare()
                toggle.setBackgroundResource(R.drawable.icon4)
            }
        }


        //  tabItem外觀自定義

        var tablayout = findViewById<TabLayout>(R.id.tabLayout)
        for (i in 0 until 5) {
            val tab = tablayout.getTabAt(i)
            if (tab != null)
                tab!!.setCustomView(R.layout.tablayout_icon)
            tablayout.getTabAt(0)?.setIcon(R.drawable.icon0)
            tablayout.getTabAt(1)?.setIcon(R.drawable.icon1)
            tablayout.getTabAt(2)?.setIcon(R.drawable.icon2)
            tablayout.getTabAt(3)?.setIcon(R.drawable.icon3)
        }

        //  Tablayout   設定監聽

        tablayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {

            override fun onTabSelected(tab: TabLayout.Tab) {

                when (tab.position) {
                    0 -> {
                        imageView.setImageResource(R.drawable.fragment1)
                        this@Main2Activity.recyclerView.visibility = View.VISIBLE
                        this@Main2Activity.linearLayout.visibility = View.GONE
                        this@Main2Activity.webView.visibility = View.GONE
                        QQlist.clear()
                        QQlist.addAll(QQQList.filter { it.tag == "A" })
                        adapter.notifyDataSetChanged()
                        if (qqlist.isEmpty()) {
                            this@Main2Activity.recyclerView2.visibility = View.GONE
                        } else this@Main2Activity.recyclerView2.visibility = View.VISIBLE

                        if (this@Main2Activity.recyclerView2.isVisible) {
                            this@Main2Activity.textView_totalprice.visibility = View.VISIBLE
                        } else this@Main2Activity.textView_totalprice.visibility = View.GONE
                    }

                    1 -> {
                        imageView.setImageResource(R.drawable.fragment2)
                        this@Main2Activity.recyclerView.visibility = View.VISIBLE
                        this@Main2Activity.linearLayout.visibility = View.GONE
                        this@Main2Activity.webView.visibility = View.GONE
                        QQlist.clear()
                        QQlist.addAll(QQQList.filter { it.tag == "B" })
                        adapter.notifyDataSetChanged()
                        if (qqlist.isEmpty()) {
                            this@Main2Activity.recyclerView2.visibility = View.GONE
                        } else this@Main2Activity.recyclerView2.visibility = View.VISIBLE

                        if (this@Main2Activity.recyclerView2.isVisible) {
                            this@Main2Activity.textView_totalprice.visibility = View.VISIBLE
                        } else this@Main2Activity.textView_totalprice.visibility = View.GONE
                    }

                    2 -> {
                        imageView.setImageResource(R.drawable.fragment3)
                        this@Main2Activity.recyclerView.visibility = View.GONE
                        this@Main2Activity.recyclerView2.visibility = View.GONE
                        this@Main2Activity.textView_totalprice.visibility = View.GONE
                        this@Main2Activity.linearLayout.visibility = View.VISIBLE
                        this@Main2Activity.webView.visibility = View.GONE
                    }
                    3 -> {
                        imageView.setImageResource(R.drawable.fragment4)
                        this@Main2Activity.recyclerView.visibility = View.GONE
                        this@Main2Activity.recyclerView2.visibility = View.GONE
                        this@Main2Activity.textView_totalprice.visibility = View.GONE
                        this@Main2Activity.linearLayout.visibility = View.GONE
                        this@Main2Activity.webView.visibility = View.VISIBLE
                    }
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {
            }

            override fun onTabReselected(tab: TabLayout.Tab) {
            }
        })


        //   QQ ~ UN OKHTTP


        btn_buy.setOnClickListener {

            if (qqlist.sumBy { it.cost } == 0) {
                Toast.makeText(this, "You Buy Nothing!!!", Toast.LENGTH_SHORT).show()
            } else if (ed_name.text.isEmpty()) {
                Toast.makeText(this, "What's Your Name???", Toast.LENGTH_SHORT).show()
            } else if (ed_address.text.isEmpty()) {
                Toast.makeText(this, "Send where???", Toast.LENGTH_SHORT).show()
            } else if (ed_phone.text.isEmpty()) {
                Toast.makeText(this, "Phone Number........", Toast.LENGTH_SHORT).show()
            } else {
                var no1: String = ""
                var no2: String = ""
                var no3: String = ""
                var no4: String = ""
                var no5: String = ""
                var no6: String = ""
                var no7: String = ""
                var no8: String = ""
                var no9: String = ""
                var no10: String = ""
                var no11: String = ""
                var pay: Int = qqlist.sumBy { it.cost }

//                for (i in 0..qqlist.size) {
//                    when(qqlist[i].loccate) {
//                        0 -> no1 = qqlist[i].number
//                        1 -> no2 = qqlist[i].number
//                        2 -> no3 = qqlist[i].number
//                        3 -> no4 = qqlist[i].number
//                        4 -> no5 = qqlist[i].number
//                        5 -> no6 = qqlist[i].number
//                        6 -> no7 = qqlist[i].number
//                        7 -> no8 = qqlist[i].number
//                        8 -> no9 = qqlist[i].number
//                        9 -> no10 = qqlist[i].number
//                        10 -> no11 = qqlist[i].number
//                    }
//                }


//                for (i in 0..qqlist.size) {
//
//                    if (qqlist[i].loccate == 0) {
//                        no1 = qqlist[i].number
//                    }
//                    if (qqlist[i].loccate == 1) {
//                        no2 = qqlist[i].number
//                    }
//                    if (qqlist[i].loccate == 2) {
//                        no3 = qqlist[i].number
//                    }
//                    if (qqlist[i].loccate == 3) {
//                        no4 = qqlist[i].number
//                    }
//                    if (qqlist[i].loccate == 4) {
//                        no5 = qqlist[i].number
//                    }
//                    if (qqlist[i].loccate == 5) {
//                        no6 = qqlist[i].number
//                    }
//                    if (qqlist[i].loccate == 6) {
//                        no7 = qqlist[i].number
//                    }
//                    if (qqlist[i].loccate == 7) {
//                        no8 = qqlist[i].number
//                    }
//                    if (qqlist[i].loccate == 8) {
//                        no9 = qqlist[i].number
//                    }
//                    if (qqlist[i].loccate == 9) {
//                        no10 = qqlist[i].number
//                    }
//                    if (qqlist[i].loccate == 10) {
//                        no11 = qqlist[i].number
//                    }
//                }

//                fun filter0(list0: MutableList<Model>){
//                    val finallist0 = list0
//                    for(i in 0..finallist0!!.size) {
//                        if (finallist0[i].loccate==0){
//                            no1 = finallist0[i].number
//                        }
//                        else {no1 = 0}
//                    }
//                }
//                filter0(qqlist)


                fun filter0(list: MutableList<Model>) {
                    var array = mutableListOf<Model>()
                    val finallist = list
                    for (i in 0..finallist.size - 1) {
                        if (finallist[i].loccate == 0) {
                            array.add(finallist[i])
                            no1 = array[0].number.toString()
                            break
                        }
                    }
                }
                filter0(qqlist)

                fun filter1(list: MutableList<Model>) {
                    var array = mutableListOf<Model>()
                    val finallist = list
                    for (i in 0..finallist.size - 1) {
                        if (finallist[i].loccate == 1) {
                            array.add(finallist[i])
                            no2 = array[0].number.toString()
                            break
                        }
                    }
                }
                filter1(qqlist)

                fun filter2(list: MutableList<Model>) {
                    var array = mutableListOf<Model>()
                    val finallist = list
                    for (i in 0..finallist.size - 1) {
                        if (finallist[i].loccate == 2) {
                            array.add(finallist[i])
                            no3 = array[0].number.toString()
                            break
                        }
                    }
                }
                filter2(qqlist)

                fun filter3(list: MutableList<Model>) {
                    var array = mutableListOf<Model>()
                    val finallist = list
                    for (i in 0..finallist.size - 1) {
                        if (finallist[i].loccate == 3) {
                            array.add(finallist[i])
                            no4 = array[0].number.toString()
                            break
                        }
                    }
                }
                filter3(qqlist)

                fun filter4(list: MutableList<Model>) {
                    var array = mutableListOf<Model>()
                    val finallist = list
                    for (i in 0..finallist.size - 1) {
                        if (finallist[i].loccate == 4) {
                            array.add(finallist[i])
                            no5 = array[0].number.toString()
                            break
                        }
                    }
                }
                filter4(qqlist)

                fun filter5(list: MutableList<Model>) {
                    var array = mutableListOf<Model>()
                    val finallist = list
                    for (i in 0..finallist.size - 1) {
                        if (finallist[i].loccate == 5) {
                            array.add(finallist[i])
                            no6 = array[0].number.toString()
                            break
                        }
                    }
                }
                filter5(qqlist)

                fun filter6(list: MutableList<Model>) {
                    var array = mutableListOf<Model>()
                    val finallist = list
                    for (i in 0..finallist.size - 1) {
                        if (finallist[i].loccate == 6) {
                            array.add(finallist[i])
                            no7 = array[0].number.toString()
                            break
                        }
                    }
                }
                filter6(qqlist)

                fun filter7(list: MutableList<Model>) {
                    var array = mutableListOf<Model>()
                    val finallist = list
                    for (i in 0..finallist.size - 1) {
                        if (finallist[i].loccate == 7) {
                            array.add(finallist[i])
                            no8 = array[0].number.toString()
                            break
                        }
                    }
                }
                filter7(qqlist)

                fun filter8(list: MutableList<Model>) {
                    var array = mutableListOf<Model>()
                    val finallist = list
                    for (i in 0..finallist.size - 1) {
                        if (finallist[i].loccate == 8) {
                            array.add(finallist[i])
                            no9 = array[0].number.toString()
                            break
                        }
                    }
                }
                filter8(qqlist)

                fun filter9(list: MutableList<Model>) {
                    var array = mutableListOf<Model>()
                    val finallist = list
                    for (i in 0..finallist.size - 1) {
                        if (finallist[i].loccate == 9) {
                            array.add(finallist[i])
                            no10 = array[0].number.toString()
                            break
                        }
                    }
                }
                filter9(qqlist)

                fun filter10(list: MutableList<Model>) {
                    var array = mutableListOf<Model>()
                    val finallist = list
                    for (i in 0..finallist.size - 1) {
                        if (finallist[i].loccate == 10) {
                            array.add(finallist[i])
                            no11 = array[0].number.toString()
                            break
                        }
                    }
                }
                filter10(qqlist)


//                fun filter1(list1: MutableList<Model>){
//                    var array1 = mutableListOf<Model>()
//                    val finallist1 = list1
//                    for(i in 0..finallist1!!.size) {
//                        finallist1?.filter { it.loccate == 1 }
//                        array1.addAll(finallist1)
//                        if (array1.isEmpty()){no2 = 0}
//                        else {no2 = array1[0].number}
//                    }
//                }
//                filter1(qqlist)
//
//                fun filter2(list1: MutableList<Model>){
//                    var array2 = mutableListOf<Model>()
//                    val finallist2 = list1
//                    for(i in 0..finallist2!!.size) {
//                        finallist2?.filter { it.loccate == 2 }
//                        array2.addAll(finallist2)
//                        if (array2.isEmpty()){no3 = 0}
//                        else {no3 = array2[0].number}
//                    }
//                }
//                filter2(qqlist)


                qqlist.filter { it.loccate == 0 }


                var client = OkHttpClient()

                var body =
                    FormBody.Builder()
                        .add("method", "write")
                        .add("name", "${ed_name.text}")
                        .add("address", "${ed_address.text}")
                        .add("phone", "${ed_phone.text}")
                        .add("ps", "${ed_ps.text}")
                        .add("No1", no1)
                        .add("No2", no2)
                        .add("No3", no3)
                        .add("No4", no4)
                        .add("No5", no5)
                        .add("No6", no6)
                        .add("No7", no7)
                        .add("No8", no8)
                        .add("No9", no9)
                        .add("No10", no10)
                        .add("No11", no11)
                        .add("pay", "$pay")
                        .build()

                var request = Request.Builder()
                    .url("https://script.google.com/macros/s/AKfycbyn5YBS72YWOyaw8s-ZHrTpDbxWmHnU_nJ-DaL2Sh9ITvXuAGpd/exec")
                    .post(body)
                    .build()

                var call = client.newCall(request)

                call.enqueue(object : Callback {

                    override fun onFailure(call: okhttp3.Call?, e: IOException?) {
                    }

                    override fun onResponse(call: okhttp3.Call?, response: Response?) {
                    }
                })

                startActivityForResult(Intent(this, MainActivity::class.java), 1)


                // Notification

                fun notification() {
                    manager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                        val channel = NotificationChannel(
                            "Bill",
                            "Be~Be~Bill~",
                            NotificationManager.IMPORTANCE_HIGH
                        )
                        manager.createNotificationChannel(channel)
                        builder = Notification.Builder(this, "Bill")
                    }
                    else {
                        builder = Notification.Builder(this)
                    }

                    //   以上為版本差異的控制?!

                    builder.setSmallIcon(R.drawable.iconsmall)
                           .setContentTitle("快給錢！！！XDDDD")
                           .setContentText("$pay.......(伸~")
                           .setLargeIcon(BitmapFactory.decodeResource(resources, R.drawable.iconbig))
                           .setAutoCancel(true)
                }
                notification()
                manager.notify(9, builder.build())

            }
        }
    }
}
