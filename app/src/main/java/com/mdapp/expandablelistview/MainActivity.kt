package com.mdapp.expandablelistview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mdapp.expandablelistview.data.DataContext
import com.mdapp.expandablelistview.databinding.ActivityMainBinding
import java.util.*
import kotlin.collections.HashMap
import kotlin.collections.List
import kotlin.collections.MutableList
import kotlin.collections.set

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private lateinit var listViewAdapter: ExpandableListViewAdapter
    private lateinit var chapterList: List<String>
    private lateinit var topicList: HashMap<String, List<String>>

    lateinit var dataContext: DataContext


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        showList()

        listViewAdapter = ExpandableListViewAdapter(this, chapterList, topicList)
        binding.elistvView.setAdapter(listViewAdapter)

    }

    private fun showList() {
        dataContext = DataContext(toString())
        chapterList = ArrayList()
        topicList = HashMap()

        (chapterList as ArrayList<String>).add("‘NGU’ VÌ THẤY NGỰC TO..")
        (chapterList as ArrayList<String>).add("TRẺ HƠN 30 TUỔI")
        (chapterList as ArrayList<String>).add("SỜ NGỰC ĐOÁN TUỔI..??")
        (chapterList as ArrayList<String>).add("CẮT NGẮN, CẮT DÀI")
        (chapterList as ArrayList<String>).add("SẼ CÓ … NHIỀU CÁI !")

        val topic1: MutableList<String> = ArrayList()
        topic1.add(dataContext.context01())

        val topic2: MutableList<String> = ArrayList()
        topic2.add(dataContext.context02())

        val topic3: MutableList<String> = ArrayList()
        topic3.add(dataContext.context03())

        val topic4: MutableList<String> = ArrayList()
        topic4.add(dataContext.context04())

        val topic5: MutableList<String> = ArrayList()
        topic5.add(dataContext.context05())

        topicList[chapterList[0]] = topic1
        topicList[chapterList[1]] = topic2
        topicList[chapterList[2]] = topic3
        topicList[chapterList[3]] = topic4
        topicList[chapterList[4]] = topic5

    }
}