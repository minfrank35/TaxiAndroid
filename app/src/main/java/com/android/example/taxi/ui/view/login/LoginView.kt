package com.android.example.taxi.ui.view.login

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Preview(showBackground = true, showSystemUi = true, uiMode = UI_MODE_NIGHT_NO)
@Composable
fun PreviewLoginView() {
    LoginView(rememberNavController())
}

@Composable
fun LoginView(navController : NavController) {
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextField(
    value : String,
    onValueChange : (String) -> Unit
) {
    BasicTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = Modifier.border(width = 1.dp, color = Color.Black, shape = RoundedCornerShape(8.dp)),
        singleLine = true

    ) {
        innerTextField ->
        TextFieldDefaults.TextFieldDecorationBox(
            value = value,
            innerTextField = innerTextField,
            enabled = true,
            singleLine = true,
            visualTransformation = VisualTransformation.None,
            interactionSource = MutableInteractionSource()
        )
    }
}
