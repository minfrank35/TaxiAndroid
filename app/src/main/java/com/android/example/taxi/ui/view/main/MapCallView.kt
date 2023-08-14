package com.android.example.taxi.ui.view.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun MapCallView(navController : NavController) {
    Box() {
        Text(
            text = "장소 선택 해주세요",
            fontSize = 15.sp,
            color = MaterialTheme.colorScheme.tertiary
        )
    }
}

@Preview
@Composable
fun PreviewMapCallView() {
    val navController = rememberNavController()

    MapCallView(navController)
}