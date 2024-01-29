//package com.example.calculatorapp

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

@Composable
fun CalBtn(
    symbol: String,
    modifier: Modifier = Modifier,
    color: Color = Color.White,
//    textStyle: TextStyle = TextStyle(),
    onClick: () -> Unit
) {
    Box(
      contentAlignment = Alignment.Center,
        modifier = Modifier
            .clip(RectangleShape)
            .clickable {
                onClick()
            }
            .then(modifier)
    ){
        Text(
            text = symbol,
            fontSize = 36.sp,
            color = color

        )
    }
}