package com.pmalaquias.jcautomechanics.ui.pages.home.components

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector

/**
 * A composable function to display an icon within a tab bar, switching between selected and unselected states.
 *
 * @param isSelected Determines if the icon is in the selected state.
 * @param selectedIcon The icon to display when the tab is selected.
 * @param unselectedIcon The icon to display when the tab is not selected.
 * @param title The content description for the icon, aiding accessibility.
 */
@Composable
fun TabBarIconView(
    isSelected: Boolean,
    selectedIcon: ImageVector,
    unselectedIcon: ImageVector,
    title: String,
) {
    Icon(
        imageVector = if (isSelected) {
            selectedIcon
        } else {
            unselectedIcon
        },
        contentDescription = title
    )
}