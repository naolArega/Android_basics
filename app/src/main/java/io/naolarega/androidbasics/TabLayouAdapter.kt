package io.naolarega.androidbasics

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_view_pager.view.*

class TabLayouAdapter(
    val tabContents: List<Int>
) : RecyclerView.Adapter<TabLayouAdapter.TabLayoutViewHolder>() {

    inner class TabLayoutViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TabLayoutViewHolder {
        val tabContentView = LayoutInflater.from(parent.context).inflate(R.layout.item_view_pager, parent, false)
        return TabLayoutViewHolder(tabContentView)
    }

    override fun onBindViewHolder(holder: TabLayoutViewHolder, position: Int) {
        val currentTabContent = tabContents[position]

        holder.itemView.ivImage.setImageResource(currentTabContent)
    }

    override fun getItemCount(): Int {
        return tabContents.size
    }
}