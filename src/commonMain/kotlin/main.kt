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
import kotlin.math.round

suspend fun main() = Korge(width = 512, height = 512,

    bgcolor = Colors["#16281f"],
    virtualHeight = 400,
    virtualWidth = 400
    ) {
    val rect = solidRect(5000.0,5000.0, Colors.DARKVIOLET)
    val mouseNativeCoords = text("0,0").xy(100,100)
    val localNativeCoords = text("0,0").xy(100,200)
    mouseNativeCoords.addUpdater {
        text = "${round(views.nativeMouseX/2)},${round(views.nativeMouseY/2)}"
    }
    localNativeCoords.addUpdater {
        text = "${round(mouseX)},${round(mouseY)}"
    }
}