package com.chula.harakamall.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.chula.harakamall.ui.screens.about.AboutScreen
import com.chula.harakamall.ui.screens.baraka.BarakaScreen
import com.chula.harakamall.ui.screens.contact.ContactScreen
import com.chula.harakamall.ui.screens.dashboard.DashboardScreen
import com.chula.harakamall.ui.screens.form.FormScreen
import com.chula.harakamall.ui.screens.form1.Form1Screen
import com.chula.harakamall.ui.screens.home.HomeScreen
import com.chula.harakamall.ui.screens.intent.IntentScreen
import com.chula.harakamall.ui.screens.item.ItemScreen
import com.chula.harakamall.ui.screens.service.ServiceScreen
import com.chula.harakamall.ui.screens.splash.SplashScreen
import com.chula.harakamall.ui.screens.start.StartScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_SPLASH
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }

        composable(ROUT_ITEM) {
            ItemScreen(navController)
        }
        composable(ROUT_START) {
            StartScreen(navController)
        }

        composable(ROUT_INTENT) {
            IntentScreen(navController)
        }

        composable(ROUT_DASHBOARD) {
            DashboardScreen(navController)
        }
        composable(ROUT_CONTACT) {
            ContactScreen(navController)
        }
        composable(ROUT_SERVICE) {
           ServiceScreen(navController)
        }
        composable(ROUT_SPLASH) {
           SplashScreen(navController)
        }
        composable(ROUT_BARAKA) {
           BarakaScreen(navController)
        }
        composable(ROUT_FORM1) {
           Form1Screen(navController)
        }

    }
}

