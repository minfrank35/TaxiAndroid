package com.android.example.taxi.ui.view.main

import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.android.example.taxi.TaxiNavHost


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainView() {
//    Scaffold(
//        bottomBar = { MainBottomBar() },
//        floatingActionButton = { FloatingActionButton(onClick = { /*TODO*/ }) {
//
//        }},
//        floatingActionButtonPosition = FabPosition.Center
//    ) {
//        TaxiNavHost()
//    }
}

@Preview
@Composable
fun MainBottomBar() {
    BottomAppBar() {

    }
}