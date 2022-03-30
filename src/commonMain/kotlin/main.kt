import com.soywiz.klock.seconds
import com.soywiz.klogger.AnsiEscape
import com.soywiz.korge.*
import com.soywiz.korge.tween.*
import com.soywiz.korge.view.*
import com.soywiz.korim.color.Colors
import com.soywiz.korim.format.*
import com.soywiz.korio.file.std.*
import com.soywiz.korma.geom.degrees
import com.soywiz.korma.interpolation.Easing

suspend fun main() = Korge(width = 512, height = 512, bgcolor = Colors["#16281f"]) {
	var circle = circle(25.0, fill = Colors.DARKRED).xy(200,200)
	circle.addUpdater {
		x++
		y++
	}
}