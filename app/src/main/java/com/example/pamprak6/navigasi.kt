package com.example.pamprak6

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pamprak6.view.FormDataDiri
import com.example.pamprak6.view.TampilData
import com.example.pamprak6.view.TampilanAwal

enum class Navigasi {
    Awal,
    Formulirku,
    Detail
}