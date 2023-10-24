package com.example.basiccodelab

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun TaskList(tasks: List<Task>, onTaskCheckedChange: (Task, Boolean) -> Unit) {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(tasks) { task ->
            TaskItem(task, onTaskCheckedChange)
        }
    }
}