package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			LearnTogetherTheme {
				// A surface container using the 'background' color from the theme
				Surface(
					modifier = Modifier.fillMaxSize(),
					color = MaterialTheme.colorScheme.background
				) {
					CardApp()
				}
			}
		}
	}
}

@Composable
fun CardApp () {
	CardContent (
		title = stringResource(R.string.title),
		descr = stringResource(R.string.descr),
		text = stringResource(R.string.text),
		imagePainter = painterResource(R.drawable.bg_compose_background)
	)
}

@Composable
fun CardContent(title: String, descr: String, text: String, imagePainter: Painter, modifier: Modifier = Modifier) {
	    Column {
		    Image(
			    painter = imagePainter,
			    contentDescription = null,
			    modifier = Modifier.fillMaxWidth()
		    )
		    Text(
			    text = title,
			    modifier = Modifier.padding(16.dp),
			    fontSize = 24.sp
		    )
		    Text(
			    text = descr,
			    modifier = Modifier.padding(start = 16.dp, end = 16.dp),
			    textAlign = TextAlign.Justify
		    )
		    Text(
			    text = text,
			    modifier = Modifier.padding(16.dp),
			    textAlign = TextAlign.Justify
		    )
	    }

}

@Preview(showBackground = true)
@Composable
private fun GreetingPreview() {
	LearnTogetherTheme {
		CardApp()
	}
}