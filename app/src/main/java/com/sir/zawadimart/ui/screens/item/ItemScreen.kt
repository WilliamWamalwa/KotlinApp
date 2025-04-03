package com.sir.zawadimart.ui.screens.item

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sir.zawadimart.R
import com.sir.zawadimart.ui.theme.coffee
import com.sir.zawadimart.ui.theme.titlewhite

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemScreen(){

Column(
    modifier = Modifier.fillMaxSize(),

) {
    //TopAppBar
    TopAppBar(
        title = { Text(text = "Products") },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = coffee,
            titleContentColor = titlewhite,
            actionIconContentColor = titlewhite,
            navigationIconContentColor = titlewhite,
        ),

        navigationIcon = {
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.Default.Menu, contentDescription = "")

            }
        },
        actions = {
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "")

            }
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.Default.Person, contentDescription = "")

            }
        }


    )

    //end

    Image(
        painter = painterResource(R.drawable.potato),
        contentDescription = "potato",
        modifier = Modifier.fillMaxWidth().height(200.dp),
        contentScale = ContentScale.FillWidth
    )
}


}


@Preview(showBackground = true)
@Composable
fun ItemScreenPreview(){

    ItemScreen()
}