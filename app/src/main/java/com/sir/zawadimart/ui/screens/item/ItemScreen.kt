package com.sir.zawadimart.ui.screens.item

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sir.zawadimart.R
import com.sir.zawadimart.ui.theme.coffee
import com.sir.zawadimart.ui.theme.grey
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
    Spacer(modifier = Modifier.height(20.dp))
    Image(
        painter = painterResource(R.drawable.potato),
        contentDescription = "potato",
        modifier = Modifier.fillMaxWidth().height(200.dp),
        contentScale = ContentScale.FillWidth
    )
    Spacer(modifier = Modifier.height(20.dp))

//searchbar
var search by remember { mutableStateOf("") }
    OutlinedTextField(
        value = search,
        onValueChange = { search= it },
        modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
        leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = ("search")) },
        placeholder = { Text(text = "Search here")}

    )

//end of searchbar
    Spacer(modifier = Modifier.height(20.dp))

    //row
    Row (){
        Image(
            painter = painterResource(R.drawable.potato),
            contentDescription = "resturant",
            modifier = Modifier.width(150.dp).height(150.dp).clip(shape = RoundedCornerShape(20.dp)),
            contentScale = ContentScale.FillWidth,

        )

        Spacer(modifier = Modifier.width(20.dp))

        Column {
            Text(
                text = "Glens Resturant",
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold


            )
            Text(
                text = "Glens Resturant",
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold


            )
            Text(
                    text = "Glens Resturant",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold


            )
            Row {
            Icon(imageVector = Icons.Default.Star, contentDescription = "",
                tint = coffee
            )
            Icon(imageVector = Icons.Default.Star, contentDescription = "",
                    tint = coffee
                )
            Icon(imageVector = Icons.Default.Star, contentDescription = "",
                    tint = coffee
                )
            Icon(imageVector = Icons.Default.Star, contentDescription = "",
                    tint = coffee
                )
            Icon(imageVector = Icons.Default.Star, contentDescription = "",
                    tint = coffee
                )
             }

            Button(
                onClick ={},
                colors = ButtonDefaults.buttonColors(coffee),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.fillMaxWidth().padding( end = 20.dp)
            ) {
                Text(text = "Go to Review")
            }

        }


    }
    //end of row

    Spacer(modifier = Modifier.height(20.dp))

    //row
    Row (){
        Image(
            painter = painterResource(R.drawable.resturant),
            contentDescription = "resturant",
            modifier = Modifier.width(150.dp).height(150.dp).clip(shape = RoundedCornerShape(20.dp)),
            contentScale = ContentScale.FillWidth,

            )

        Spacer(modifier = Modifier.width(20.dp))

        Column {
            Text(
                text = "Glens Resturant",
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold


            )
            Text(
                text = "Glens Resturant",
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold


            )
            Text(
                text = "Glens Resturant",
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold


            )
            Row {
                Icon(imageVector = Icons.Default.Star, contentDescription = "",
                    tint = coffee
                )
                Icon(imageVector = Icons.Default.Star, contentDescription = "",
                    tint = coffee
                )
                Icon(imageVector = Icons.Default.Star, contentDescription = "",
                    tint = coffee
                )
                Icon(imageVector = Icons.Default.Star, contentDescription = "",
                    tint = coffee
                )
                Icon(imageVector = Icons.Default.Star, contentDescription = "",
                    tint = coffee
                )
            }

            Button(
                onClick ={},
                colors = ButtonDefaults.buttonColors(coffee),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.fillMaxWidth().padding( end = 20.dp)
            ) {
                Text(text = "Go to Review")
            }

        }


    }
    //end of row

    Spacer(modifier = Modifier.height(20.dp))

    //row
    Row (){
        Image(
            painter = painterResource(R.drawable.resturant),
            contentDescription = "resturant",
            modifier = Modifier.width(150.dp).height(150.dp).clip(shape = RoundedCornerShape(20.dp)),
            contentScale = ContentScale.FillWidth,

            )

        Spacer(modifier = Modifier.width(20.dp))

        Column {
            Text(
                text = "Glens Resturant",
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold


            )
            Text(
                text = "Glens Resturant",
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold


            )
            Text(
                text = "Glens Resturant",
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold


            )
            Row {
                Icon(imageVector = Icons.Default.Star, contentDescription = "",
                    tint = coffee
                )
                Icon(imageVector = Icons.Default.Star, contentDescription = "",
                    tint = coffee
                )
                Icon(imageVector = Icons.Default.Star, contentDescription = "",
                    tint = coffee
                )
                Icon(imageVector = Icons.Default.Star, contentDescription = "",
                    tint = grey
                )
                Icon(imageVector = Icons.Default.Star, contentDescription = "",
                    tint = grey
                )
            }

            Button(
                onClick ={},
                colors = ButtonDefaults.buttonColors(coffee),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.fillMaxWidth().padding( end = 20.dp)
            ) {
                Text(text = "Go to Review")
            }

        }


    }
    //end of row

}


}


@Preview(showBackground = true)
@Composable
fun ItemScreenPreview(){

    ItemScreen()
}