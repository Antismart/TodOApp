package com.example.basiccodelab

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddTask(onAddTask: (String) -> Unit) {
    var taskText by remember { mutableStateOf(TextFieldValue()) }
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        TextField(
            value = taskText,
            onValueChange = { taskText = it },
            placeholder = { Text("Enter a new task")
            }
        )
        Button(
            onClick = {
                onAddTask(taskText.text)
                taskText = TextFieldValue("")
            }
        ) {
            Text("Add")
        }
    }
}