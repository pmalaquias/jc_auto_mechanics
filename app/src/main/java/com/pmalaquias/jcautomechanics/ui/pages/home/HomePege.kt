package com.pmalaquias.jcautomechanics.ui.pages.home

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Event
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Receipt
import androidx.compose.material.icons.outlined.Build
import androidx.compose.material.icons.outlined.Event
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Receipt
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pmalaquias.jcautomechanics.R
import com.pmalaquias.jcautomechanics.ui.pages.home.components.TabView
import com.pmalaquias.jcautomechanics.ui.pages.home.screens.AppointmentsScreen
import com.pmalaquias.jcautomechanics.ui.pages.home.screens.CallsScreen
import com.pmalaquias.jcautomechanics.ui.pages.home.screens.DashboardScreen
import com.pmalaquias.jcautomechanics.ui.pages.home.screens.InvoicesScreen
import com.pmalaquias.jcautomechanics.ui.pages.home.screens.ProfileScreen
import com.pmalaquias.jcautomechanics.ui.theme.JCAutoMechanicsTheme

/**
 * Represents an item within the navigation tab bar.
 *
 * @property title The title of the tab, used as a label.
 * @property selectedIcon The icon displayed when the tab is selected.
 * @property unselectedIcon The icon displayed when the tab is not selected.
 * @property badgeAmount Optional. The number to display on a badge for the tab (e.g., for notifications). Null if no badge is displayed.
 */
data class TabBarItem(
    val title: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val badgeAmount: Int? = null
)

/**
 * A composable function that serves as the main page of the application. It sets up the navigation controller,
 * defines the tabs for navigation, and uses a Scaffold to layout the page structure including the bottom navigation bar.
 * The function dynamically creates tabs based on predefined items and manages navigation between different screens
 * within the app.
 *
 * @param modifier A [Modifier] applied to the Scaffold, allowing customization of its layout behavior.
 */
@Composable
fun HomePage(
    modifier: Modifier = Modifier
) {

    val navController = rememberNavController()

    // setting up the individual tabs
    val homeTab = TabBarItem(
        title = stringResource(R.string.label_home),
        selectedIcon = Icons.Filled.Home,
        unselectedIcon = Icons.Outlined.Home
    )
    val callsTab = TabBarItem(
        title = stringResource(R.string.label_calls),
        selectedIcon = Icons.Filled.Build,
        unselectedIcon = Icons.Outlined.Build,
    )
    val appointmentsTab = TabBarItem(
        title = stringResource(R.string.label_schedules),
        selectedIcon = Icons.Filled.Event,
        unselectedIcon = Icons.Outlined.Event
    )
    val invoicesTab = TabBarItem(
        title = stringResource(R.string.label_invoices),
        selectedIcon = Icons.Filled.Receipt,
        unselectedIcon = Icons.Outlined.Receipt
    )
    val profileTab = TabBarItem(
        title = stringResource(R.string.label_profile),
        selectedIcon = Icons.Filled.Person,
        unselectedIcon = Icons.Outlined.Person
    )

    val tabBarItems = listOf(homeTab, callsTab, appointmentsTab, invoicesTab, profileTab)

    Scaffold(
        bottomBar = { TabView(tabBarItems, navController) }
    ) { innerPadding ->
        NavHost(
            modifier = modifier.padding(innerPadding),
            navController = navController,
            startDestination = homeTab.title
        ) {
            composable(homeTab.title) { DashboardScreen() }
            composable(callsTab.title) { CallsScreen() }
            composable(appointmentsTab.title) { AppointmentsScreen() }
            composable(invoicesTab.title) { InvoicesScreen() }
            composable(profileTab.title) { ProfileScreen() }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JCAutoMechanicsTheme {
        HomePage()
    }
}