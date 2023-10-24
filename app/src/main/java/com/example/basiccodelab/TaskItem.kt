package com.example.basiccodelab

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TaskItem(task: Task, onTaskCheckedChange: (Task, Boolean) -> Unit) {
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = task.title)
        Checkbox(
            checked = task.isCompleted,
            onCheckedChange = { isChecked ->
            onTaskCheckedChange(task, isChecked)
        }
        )
    }
}