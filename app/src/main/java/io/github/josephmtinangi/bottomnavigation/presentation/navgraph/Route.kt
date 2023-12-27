package io.github.josephmtinangi.bottomnavigation.presentation.navgraph

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Route(
    val route: String,
    val label: String,
    val icon: ImageVector
) {
    object Home : Route("home", "Home", Icons.Default.Home)
    object Notifications : Route("notification", "Notifications", Icons.Default.Notifications)
    object Settings : Route("setting", "Settings", Icons.Default.Settings)
    object Account : Route("account", "Account", Icons.Default.AccountCircle)
}
