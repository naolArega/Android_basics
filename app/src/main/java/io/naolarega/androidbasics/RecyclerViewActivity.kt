package io.naolarega.androidbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_edit_text.*
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        var todos = mutableListOf<TodoItem>(
                TodoItem("wake up", false),
                TodoItem("wash", false),
                TodoItem("eat", false),
                TodoItem("goto work", true)
        )
        val todoAdapter = TodoAdapter(todos)

        rvTodo.adapter = todoAdapter
        rvTodo.layoutManager = LinearLayoutManager(this)

        btnAddTodo.setOnClickListener {
            val todoTitle = etTodoTitle.text.toString()
            val todo = TodoItem(
                    todoTitle,
                    false
            )
            todos.add(todo)
            todoAdapter.notifyItemInserted(todos.size - 1)

            etTodoTitle.text.clear()
        }
    }
}