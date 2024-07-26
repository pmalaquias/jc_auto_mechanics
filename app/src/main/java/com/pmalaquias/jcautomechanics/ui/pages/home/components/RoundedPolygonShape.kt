package com.pmalaquias.jcautomechanics.ui.pages.home.components

import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Matrix
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.asComposePath
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.graphics.shapes.RoundedPolygon
import androidx.graphics.shapes.toPath
import kotlin.math.max

/**
 * Extension function to calculate the bounding rectangle of a RoundedPolygon.
 * It uses the calculated bounds and returns a Rect object representing the bounds.
 *
 * @return A Rect object representing the bounds of the RoundedPolygon.
 */
fun RoundedPolygon.getBounds() = calculateBounds().let { Rect(it[0], it[1], it[2], it[3]) }

/**
 * A custom Shape implementation that represents a RoundedPolygon with optional transformation.
 * This class creates an outline for the RoundedPolygon by transforming its path based on the given size.
 *
 * @property polygon The RoundedPolygon instance to be used for creating the shape.
 * @property matrix An optional Matrix for transforming the polygon's path. Defaults to an identity matrix.
 */
class RoundedPolygonShape(
    private val polygon: RoundedPolygon, private var matrix: Matrix = Matrix(),
) : Shape {
    private var path = Path()

    /**
     * Creates an outline for the RoundedPolygonShape by transforming its path based on the given size.
     *
     * @param size The size of the layout to which the shape is being applied.
     * @param layoutDirection The layout direction of the layout (LTR or RTL).
     * @param density The density of the layout.
     * @return An Outline object representing the transformed path of the RoundedPolygon.
     */
    override fun createOutline(
        size: Size, layoutDirection: LayoutDirection, density: Density,
    ): Outline {
        path.rewind()
        path = polygon.toPath().asComposePath()
        matrix.reset()
        val bounds = polygon.getBounds()
        val maxDimension = max(bounds.width, bounds.height)
        matrix.scale(size.width / maxDimension, size.height / maxDimension)
        matrix.translate(-bounds.left, -bounds.top)

        path.transform(matrix)
        return Outline.Generic(path)
    }
}