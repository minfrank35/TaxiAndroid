package com.android.example.taxi

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.android.example.taxi.ui.view.login.LoginView
import com.android.example.taxi.ui.view.main.MapCallView


class TaxiDestinations {
    companion object {
        const val LOGIN_ROUTE = "LOGIN_ROUTE"
        const val MAIN_ROUTE = "MAIN_ROUTE"
    }
}

class MainNavigation {
    companion object {
        const val MAP_CALL_ROUTE = "MAP_CALL_ROUTE"
    }
}

@Composable
fun TaxiNavHost() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = TaxiDestinations.LOGIN_ROUTE) {
        LoginComposables(navController)

        MainNestedNavigation(navController)


    }
}

fun NavGraphBuilder.LoginComposables(navController: NavController) {
    composable(route = TaxiDestinations.LOGIN_ROUTE) {
        LoginView(navController)
    }
}

fun NavGraphBuilder.MainNestedNavigation(navController: NavController) {
    navigation(startDestination = MainNavigation.MAP_CALL_ROUTE, route = TaxiDestinations.MAIN_ROUTE) {
        composable(route = MainNavigation.MAP_CALL_ROUTE) {
            MapCallView(navController = navController)
        }
    }
}
