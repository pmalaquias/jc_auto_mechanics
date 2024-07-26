package com.pmalaquias.jcautomechanics.ui.pages.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.graphics.shapes.CornerRounding
import androidx.graphics.shapes.RoundedPolygon
import androidx.graphics.shapes.star

/**
 * A composable function that defines the layout and behavior of the ImageProfile component within the application.
 * This component creates a hexagon-shaped profile image using a custom [RoundedPolygonShape] and applies various
 * styling properties such as size, background color, clipping, and border.
 */
@Composable
fun ImageProfile() {

    // Create a hexagon shape with 8 points and corner rounding of 0.2f
    val hexagon = remember { RoundedPolygon.star(8, rounding = CornerRounding(0.2f)) }

    // Create a custom shape using the hexagon
    val clip: RoundedPolygonShape = remember { RoundedPolygonShape(hexagon) }

    // Define a Box composable with specified size, background color, clipping, and border
    Box(
        modifier = Modifier
            .size(150.dp)
            .background(MaterialTheme.colorScheme.primary, shape = clip)
            .clip(clip)
            .border(1.dp, MaterialTheme.colorScheme.onPrimary, CircleShape)
    )
}

/**
 * A composable function that displays a user's profile photo.
 * This function utilizes the [ImageProfile] composable to create a hexagon-shaped profile image.
 *
 * @param photoUrl The URL of the user's profile photo. Defaults to an empty string.
 */
@Composable
fun UserProfilePhoto(photoUrl: String = "") {
    ImageProfile()
}

/**
 * A composable function that displays a workshop's profile photo.
 * This function utilizes the [ImageProfile] composable to create a hexagon-shaped profile image.
 *
 * @param photoUrl The URL of the workshop's profile photo. Defaults to an empty string.
 */
@Composable
fun WorkshopProfilePhoto(photoUrl: String = "") {
    ImageProfile()
}