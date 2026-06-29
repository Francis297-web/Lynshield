package com.lynshield.app.ui

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ReportScreen() {
    var text by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(20.dp)) {

        Text("Report Suspicious Activity", style = MaterialTheme.typography.headlineSmall)

        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Describe incident") }
        )

        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {
            text = ""
        }) {
            Text("Submit Report")
        }
    }
}
