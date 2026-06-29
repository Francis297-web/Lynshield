package com.lynshield.app.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen() {
    var status by remember { mutableStateOf("Safe") }

    Surface {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "LYNSHIELD",
                style = MaterialTheme.typography.headlineLarge
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text("AI Anti-Fraud Protection System")

            Spacer(modifier = Modifier.height(30.dp))

            Text(
                text = "Status: $status",
                style = MaterialTheme.typography.titleMedium
            )

            Spacer(modifier = Modifier.height(20.dp))

            Button(onClick = {
                status = if (status == "Safe") "Scanning..." else "Safe"
            }) {
                Text("Scan Now")
            }

            Spacer(modifier = Modifier.height(10.dp))

            Button(onClick = {
                status = "Threat Detected: None (Demo Mode)"
            }) {
                Text("Run Deep Check")
            }
        }
    }
}
