package com.sir.zawadimart.ui.screens.start

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sir.zawadimart.R
import com.sir.zawadimart.ui.theme.coffee

@Composable
fun StartScreen(){

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {

        Text(
            text = "ZawadiMart"

        )

        Spacer(modifier = Modifier.height(20.dp))

        Image(
            painter = painterResource(R.drawable.img),
            contentDescription = "pear",
            modifier = Modifier.size(300.dp).clip(shape = CircleShape),
            contentScale = ContentScale.Crop
            )
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Find Your Order!",
            fontWeight = FontWeight.ExtraBold,
            fontSize = 30.sp,
            color = coffee
        )

        Text(
            text = "Browse 51504 incredible Random vectors, icons, clipart graphics, and backgrounds for royalty-free download from the creative contributors at Vecteezy!",

            textAlign = TextAlign.Center,

            fontWeight = FontWeight.ExtraBold,

        )

        Spacer(modifier = Modifier.height(20.dp))


        Button(
            onClick ={},
            colors = ButtonDefaults.buttonColors(coffee),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)
        ) {
            Text(text = "Add to Cart")
        }

    }

}

@Preview(showBackground = true)
@Composable
fun StartScreenPreview(){

    StartScreen()
}