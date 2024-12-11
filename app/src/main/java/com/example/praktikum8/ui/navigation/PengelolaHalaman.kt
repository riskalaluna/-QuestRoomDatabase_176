package com.example.praktikum8.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.praktikum8.ui.view.mahasiswa.DestinasiInsert
import com.example.praktikum8.ui.view.mahasiswa.DestinasiInsert.route
import com.example.praktikum8.ui.view.mahasiswa.InserMhsView

@Composable
fun PengelolaHalaman(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    NavHost(navController = navController, startDestination = DestinasiInsert.route) {
        composable(
            route = DestinasiInsert.route
        ) {
            InserMhsView(
                onBack = {}, onNavigate = { }
            )
        }
    }
}