package com.pmalaquias.jcautomechanics.ui.pages.home.components

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
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.pmalaquias.jcautomechanics.R
import com.pmalaquias.jcautomechanics.ui.pages.home.TabBarItem
import com.pmalaquias.jcautomechanics.ui.theme.JCAutoMechanicsTheme

/**
 * A composable function that creates a navigation bar with tabs based on the provided list of [TabBarItem].
 * Each tab is represented by a [NavigationBarItem] that, when clicked, updates the current selected tab index
 * and navigates to the corresponding page using the provided [NavController].
 *
 * @param tabBarItems A list of [TabBarItem] objects representing each tab in the navigation bar.
 * @param navController The [NavController] used to navigate between pages when a tab is selected.
 */
@Composable
fun TabView(tabBarItems: List<TabBarItem>, navController: NavController) {
    var selectedTabIndex by rememberSaveable { mutableIntStateOf(0) }

    NavigationBar(
        modifier = Modifier,
        containerColor = Color.Transparent,
    ) {
        tabBarItems.forEachIndexed { index, tabBarItem ->
            NavigationBarItem(
                selected = selectedTabIndex == index,
                onClick = {
                    selectedTabIndex = index
                    navController.navigate(tabBarItem.title)
                },
                icon = {
                    TabBarIconView(
                        isSelected = selectedTabIndex == index,
                        selectedIcon = tabBarItem.selectedIcon,
                        unselectedIcon = tabBarItem.unselectedIcon,
                        title = tabBarItem.title,
                    )
                },
                label = { Text(tabBarItem.title) })
        }
    }
}

/**
 * Provides a preview of the [TabView] composable function within the app's theme.
 * This preview function generates a sample navigation bar with predefined tabs such as Home, Calls, Schedules,
 * Invoices, and Profile. Each tab is represented with both selected and unselected icons to demonstrate
 * the visual changes in the navigation bar as different tabs are selected.
 *
 * The [TabViewPreview] function is annotated with @Preview, allowing Android Studio to render a preview
 * of the composable without needing to run the entire application. This aids in rapid development and
 * visual testing of the composable's design and functionality.
 */
@Preview(showBackground = true)
@Composable
fun TabViewPreview() {
    JCAutoMechanicsTheme {
        TabView(
            tabBarItems = listOf(
                TabBarItem(
                    title = stringResource(R.string.label_home),
                    selectedIcon = Icons.Filled.Home,
                    unselectedIcon = Icons.Outlined.Home
                ),
                TabBarItem(
                    title = stringResource(R.string.label_calls),
                    selectedIcon = Icons.Filled.Build,
                    unselectedIcon = Icons.Outlined.Build,
                ),
                TabBarItem(
                    title = stringResource(R.string.label_schedules),
                    selectedIcon = Icons.Filled.Event,
                    unselectedIcon = Icons.Outlined.Event
                ),
                TabBarItem(
                    title = stringResource(R.string.label_invoices),
                    selectedIcon = Icons.Filled.Receipt,
                    unselectedIcon = Icons.Outlined.Receipt
                ),
                TabBarItem(
                    title = stringResource(R.string.label_profile),
                    selectedIcon = Icons.Filled.Person,
                    unselectedIcon = Icons.Outlined.Person
                )
            ),
            navController = rememberNavController()
        )
    }
}