package com.lynshield.app.ui

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LearnScreen() {

    Column(modifier = Modifier.padding(20.dp)) {

        Text("Fraud Awareness", style = MaterialTheme.typography.headlineSmall)

        Spacer(modifier = Modifier.height(10.dp))

        Text("• Never click unknown links")
        Text("• Do not share OTP codes")
        Text("• Verify callers before sending money")
        Text("• LynShield detects scam patterns in real-time (demo)")
    }
}
