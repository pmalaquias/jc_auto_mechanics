package com.pmalaquias.jcautomechanics.ui.pages.home.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.pmalaquias.jcautomechanics.R
import com.pmalaquias.jcautomechanics.ui.pages.home.components.contents.PersonContent
import com.pmalaquias.jcautomechanics.ui.pages.home.components.contents.WorkshopContent
import com.pmalaquias.jcautomechanics.ui.theme.JCAutoMechanicsTheme
import kotlinx.coroutines.launch

/**
 * A composable function that defines the layout and behavior of the Profile screen within the application.
 * This screen utilizes a [Scaffold] layout to provide a consistent structure, including a top app bar
 * and a content area. The top app bar is created using the [TopAppBar] composable function, which is passed
 * the title resource ID [R.string.title_profile]. The content area is defined by a [Column] layout, which
 * can be populated with additional components as needed.
 *
 * @param modifier A [Modifier] applied to the [Column] layout, allowing for customization of its size, padding, etc.
 *                 By default, it fills the maximum available size and applies padding defined by the [Scaffold].
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(
    modifier: Modifier = Modifier,
) {
    var expanded by remember { mutableStateOf(false) }
    val scrollState = rememberScrollState()

    Scaffold(
        topBar = {
            TopAppBar(title = { Text(stringResource(R.string.title_profile)) },
                actions = {
                    IconButton(onClick = {
                        expanded = !expanded
                    }) {
                        Icon(
                            imageVector = Icons.Filled.Settings,
                            contentDescription = "Settings"
                        )
                    }
                })

        },
    ) { innerPadding ->

        LaunchedEffect(expanded) {
            if (expanded) {
                // Scroll to show the bottom menu items.
                scrollState.scrollTo(scrollState.maxValue)
            }
        }

        val tabItem = listOf("Pessoal","Oficina" )

        val pagerState = rememberPagerState { tabItem.size }
        val coroutineScope = rememberCoroutineScope()

        Column(
            modifier = modifier
                .padding(innerPadding)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            TabRow(
                selectedTabIndex = pagerState.currentPage,
            ) {
                tabItem.forEachIndexed { index, title ->
                    Tab(
                        text = { Text(title) },
                        selected = pagerState.currentPage == index,
                        onClick = {
                            coroutineScope.launch {
                                pagerState.animateScrollToPage(index)
                            }
                        }
                    )
                }
            }

            HorizontalPager(
                state = pagerState,
                modifier = Modifier
            ) { page ->
                when (page) {
                    0 -> PersonContent()
                    1 -> WorkshopContent()
                }
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    JCAutoMechanicsTheme {
        ProfileScreen()
    }
}