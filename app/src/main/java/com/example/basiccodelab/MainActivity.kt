
package com.example.basiccodelab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MyToDoApp()
        }
    }
}

@Composable
fun MyToDoApp() {
    val tasks = remember { mutableStateListOf<Task>() }

    ToDoApp(
        tasks = tasks,
        onAddTask = { taskTitle ->
            tasks.add(Task(tasks.size, taskTitle, false))
        },
        onTaskCheckedChange = { task, isChecked ->
            task.isCompleted = isChecked
        }
    )
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    BasicCodelabTheme {
//        Greeting("Android")
//    }
//}