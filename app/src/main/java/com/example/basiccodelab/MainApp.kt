package com.example.basiccodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun ToDoApp(
    tasks: List<Task>,
    onAddTask: (String) -> Unit,
    onTaskCheckedChange: (Task, Boolean) -> Unit
) {
    Column {
        Text(
            text = "To Do List",
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(16.dp)
        )
        AddTask(onAddTask)
        TaskList(tasks, onTaskCheckedChange )
    }
}
